package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
		    protected void doGet(HttpServletRequest request, HttpServletResponse response)
		                throws ServletException, IOException {
		        response.setContentType("text/html; charset=UTF-8");
		        PrintWriter out = response.getWriter();
		        out.println("<html><body>");
		        out.println("<h1>Hello World</h1>");
		        out.println("</body></html>");
		    }
}
