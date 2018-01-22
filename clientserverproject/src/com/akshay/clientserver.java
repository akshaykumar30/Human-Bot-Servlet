package com.akshay;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class clientserver
 */
@WebServlet(description = "To check whether human or bots", urlPatterns = { "/clientserver" })
public class clientserver extends HttpServlet {
	private static final long serialVersionUID = 1L;

 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
	 	Random r = new Random();
	    int x =  r.nextInt(11); 
	    int y =  r.nextInt(11); 
	    int z=  r.nextInt(11);
	    int sum = x+y+z;
	    String ans=request.getParameter("answer");
		int answer= Integer.parseInt(ans);
		
		int xvalue = x;
		int yvalue = y;
		int zvalue = z;
        request.setAttribute("xvalue", xvalue);
        request.setAttribute("yvalue", yvalue);
        request.setAttribute("zvalue", zvalue);
		//println("Here you go, solve the question: &nbsp; &nbsp;<b> Please sum the numbers</b> " +x+ " " +y+" " +z);
        //response.sendRedirect("index.jsp");
		//request.getSession().setAttribute("x",x);		
		
		try {
		 pw.println("Here you go, solve the question: &nbsp; &nbsp;<b> Please sum the numbers</b> " +x+ " " +y+" " +z);
		 if(answer==sum)
		 {
			   pw.println("<br> <br> <br><font color='green'><b>Thats great !!!</b></font>");
               RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
               rd.include(request, response);
			 
		 }
		 else {
			 pw.println("<br> <br> <br> <br><font color='red'>Sorry, Please revaluate your answer</font>");
			 RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
             rd.include(request, response);
		}}
		finally {            
            pw.close();
        }

 //response.sendRedirect("index.jsp");

 /* RequestDispatcher reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("index.jsp");
 
	if(answer==sum)
		 {
			 pw.println("That’s great");
			 
		 }
		 else {
			 pw.println("Sorry, Please revaluate your answer");
		}}
 catch (ServletException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
 
 /* try {
	rd.forward(request, response);
	String ans=request.getParameter("answer");
	 int answer= Integer.parseInt(ans);
	 if(answer==sum)
	 {
		 pw.println("That’s great");
		 
	 }
	 else {
		 pw.println("Sorry, Please revaluate your answer");
	}
} catch (ServletException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} */ 
 }

private String println(String string) {
	// TODO Auto-generated method stub
	return null;
}}
