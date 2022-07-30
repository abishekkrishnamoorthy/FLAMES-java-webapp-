package com.flames.v1;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
@WebServlet("/store")
public class servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
  
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException, IOException
    {
    	
        try {
           
            StringBuffer s1=new StringBuffer(request.getParameter("fname"));
    		StringBuffer s2=new StringBuffer(request.getParameter("sname"));
    		System.out.print(s1+" "+s2);
    		 Connection con = jdbc.initialize();
    		PreparedStatement st = con.prepareStatement("INSERT INTO `flames`.`tb1` (`name`, `crush`) VALUES (?,?)");
            st.setString(1, request.getParameter("fname"));
            st.setString(2, request.getParameter("sname"));
            st.executeUpdate();
            st.close();
            con.close();
        }
        catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}