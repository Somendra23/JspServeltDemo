package net.sam.landing;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Iterator;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Campaigns
 */
//@WebServlet(name="camps")
public class Campaigns extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static int refreshCount = 0;

	/**
	 * Default constructor.
	 */
	public Campaigns() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		Enumeration configParam = config.getInitParameterNames();
		while (configParam.hasMoreElements()) {
			String name = (String) configParam.nextElement();
			String value = config.getInitParameter(name);
			System.out.println("Config name = " + name + "value =");
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//returning error programmatically !!
		//response.sendError(HttpServletResponse.SC_HTTP_VERSION_NOT_SUPPORTED,"Invalid Request");
		
		
		/*
		 * int count=1; if(count>0) { SQLException sc = new
		 * SQLException("SQL Exception occured inside comapaigns"); throw new
		 * ServletException(sc); }
		 */
	refreshCount++;

	// response.setHeader("Refresh", "10");
	
	 PrintWriter pw = response.getWriter();//.append("Served at: /").append(request.getContextPath());//append(sb.toString());
	 pw.println("<html>");pw.println("<head");pw.println("</head>");pw.println(
	  "<body>");pw.println("<h4>Following headers are present</h4>");pw.
	  println("<h4>Refreshed count = "+refreshCount+"</h4>");
	  
	  Enumeration headers = request.getHeaderNames(); Iterator iterator =
	  headers.asIterator(); StringBuilder sb = new
	  StringBuilder();while(headers.hasMoreElements()) { String header = (String)
	  headers.nextElement(); String value = request.getHeader(header);
	  pw.println("<h5>Header name = " + header + " value = " + value + "</h5>"); //
	  sb.append("Header name = "+header+" Value = "+value).append("##"); //
	  sb.append(System.lineSeparator());
	  
	  }
	  
	  pw.println("</body>");
	  
	  pw.println("</html>");
	 
	//response.sendError(HttpServletResponse.SC_FORBIDDEN ,"SECURITY_ERROR");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
