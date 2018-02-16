
<%@ page contentType="application/pdf"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ page import="net.sf.jasperreports.engine.*"%>
<%@ page import="net.sf.jasperreports.engine.data.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<html>
<%@page import="net.sf.jasperreports.engine.JasperExportManager"%>
<%@page import="net.sf.jasperreports.engine.JasperFillManager"%>
<%@page import="net.sf.jasperreports.engine.JasperPrint"%>
<%@page import="net.sf.jasperreports.engine.JasperCompileManager"%> 
<%@page import="net.sf.jasperreports.engine.JasperReport"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<body>
 <%
 Connection conn=null;
 try
 {
	 Class.forName("com.mysql.jdbc.Driver");
	 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ApplicationForm","root","root");
	 String report=session.getServletContext().getRealPath("/report/getdata.jrxml");
	 JasperReport jasperreport=JasperCompileManager.compileReport(report);
	 JasperPrint jp=JasperFillManager.fillReport(jasperreport,null,conn);
	 JasperExportManager.exportReportToPdfStream(jp,response.getOutputStream());
	  response.getOutputStream().flush();
	 response.getOutputStream().close();
 }
 catch(Exception e)
 {
	 out.println(e);
 }
 %>
</body>
</html>