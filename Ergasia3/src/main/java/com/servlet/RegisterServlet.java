package com.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connect.ConnectClass;
import com.connect.hashhh;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
          	
	private hashhh connect;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {

			Class.forName("org.postgresql.Driver"); 
			
			Connection con = ConnectClass.dbCon();
			
			MessageDigest digest;
			PrintWriter out = response.getWriter();
			String salt=connect.getAlphaNumericString(16);
			String name= request.getParameter("name");
			String surname= request.getParameter("surname");
			String username= request.getParameter("username");
			String course= request.getParameter("course");
			   String password= request.getParameter("newpassword1")+salt;
				digest = MessageDigest.getInstance("SHA-1");
				byte[] encodedhash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
				password=connect.bytesToHex(encodedhash);
				password =""+password;
				System.out.println("pass = "+ password);
				
				
				
        
        

			PreparedStatement ps= con.prepareStatement("INSERT INTO kathigites(name, surname, username, password, course) VALUES(?,?,?,?,?);"); 
			ps.setString(1, name);
			ps.setString(2, surname);
			ps.setString(3, username);
			ps.setString(4, password);
			ps.setString(5, course);

			int rows= ps.executeUpdate();
			
			if (rows>0) {
            	out.println("Successful register");	          	
            }
									
			con.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		catch (NoSuchAlgorithmException e) 
		{
			e.printStackTrace();
		}
		
	}
}
		


