package com.gontuseries.studentadmissioncontroller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class StudentAdmissionController {
	@Autowired
	StudentService studentService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy****mm****dd");
		
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateformat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}

	
	@RequestMapping(value = "/admissionform.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionform() throws Exception {
   
		String exceptionOccured = "ARITHMEIC_EXCEPTION";
		if (exceptionOccured.equalsIgnoreCase("NULL_POINTER"))
			throw new NullPointerException("Null Pointer Exception");
		else if (exceptionOccured.equalsIgnoreCase("IO_EXCEPTION"))
			throw new IOException("IO Exception");
		else if (exceptionOccured.equalsIgnoreCase("ARITHMETIC_EXCEPTION"))
			throw new ArithmeticException("Arithmetic Exception");
		
		ModelAndView model = new ModelAndView("Register");
		return model;
	}

	@ModelAttribute
	public void addingCommonObjects(Model model) {
		model.addAttribute("headermessage", "YMCAUST,FARIDABAD");
	}

	@RequestMapping(value = "/submitadmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionform(@Valid @ModelAttribute("student1") Student student1, BindingResult result,
			RedirectAttributes redirectattributes,HttpSession session) {
		if (result.hasErrors()) {
			
			redirectattributes.addFlashAttribute("org.springframework.validation.BindingResult.student1", result);
			redirectattributes.addFlashAttribute("student1", student1);
			return new ModelAndView("redirect:/admissionform.html");
		} 
	  String Captcha=(String) session.getAttribute("CAPTCHA");
	  if(Captcha!=null&&!Captcha.equals(student1.getCaptcha()))
	  {
		  ModelAndView model=new ModelAndView("Register");
		 model.addObject("msg","Captcha doesn't match!");
		 return model;
	  }
	    studentService.create(student1);
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		return model;
	}

	@RequestMapping(value="/login.html",method=RequestMethod.POST)
	public ModelAndView LoginForm(@ModelAttribute("student1") Student student1)
	{
		Student student2=new Student();
		student2=studentService.find(student1.getStudentRollNo());
	//	System.out.println(student2.getPassword());
		System.out.println(student1.getPassword());
		if(student2==null)
		{
			ModelAndView model=new ModelAndView("LoginUn");
			return model;
		}
		String s1=student1.getPassword();
		String s2=student2.getPassword();
		if(!s1.equals(s2))
		{
			ModelAndView model=new ModelAndView("LoginUn");
			return model;
		}
		ModelAndView model = new ModelAndView("LoginSuccess");
		return model;
	}

	
}
