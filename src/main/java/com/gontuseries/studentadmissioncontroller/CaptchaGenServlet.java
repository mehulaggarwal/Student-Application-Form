package com.gontuseries.studentadmissioncontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
 
import java.awt.image.BufferedImage;
 
import javax.imageio.ImageIO;
import javax.servlet.http.*;
 
import java.io.*;

public class CaptchaGenServlet extends HttpServlet {
	public static final String FILE_TYPE = "jpeg";
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setDateHeader("Max-Age", 0);
		response.setContentType("image/jpeg");
		String captchaStr = "";
		captchaStr = CaptchaUtil.generateCaptchaTextMethod2(6);
		
		try{
		int width = 200, height = 70;
		Color bg = new Color(0, 255, 255);
		Color fg = new Color(0, 100, 0);
		Font font = new Font("Arial", Font.BOLD,38);
     
		BufferedImage cpimg = new BufferedImage(width, height, BufferedImage.OPAQUE);
		Graphics g = cpimg.createGraphics();
		g.setFont(font);
		g.setColor(bg);
		g.fillRect(0, 0, width, height);
		g.setColor(fg);
		g.drawString(captchaStr,32,42);

		HttpSession session = request.getSession(true);
		session.setAttribute("CAPTCHA", captchaStr);
		OutputStream outputStream = response.getOutputStream();
		 
        ImageIO.write(cpimg, FILE_TYPE, outputStream);
        outputStream.close();
		}
		catch(Exception e) {
            e.printStackTrace();
    }
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	
}
