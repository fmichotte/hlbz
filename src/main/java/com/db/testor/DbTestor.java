package com.db.testor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/DbTestor")
public class DbTestor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DbTestor() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		String user = "fmichotte";
		String pwd = "123";
		
		String url = "jdbc:mysql://localhost:3306/hlbz_schema?useSSL=false";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		
		try {
			
			
			PrintWriter out = response.getWriter();

			out.println("Connet on :" + url + "\n");

			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, user, pwd);
			
			out.println("SUCCESS !");
			
			conn.close();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	
	

}
