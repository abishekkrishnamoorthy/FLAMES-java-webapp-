package com.flames.v1;
import java.sql.*;
public class jdbc {
		    protected static Connection initialize()throws SQLException, ClassNotFoundException
		    {
		        // Initialize all the information regarding
		        // Database Connection
		        String dbURL = "jdbc:mysql://localhost:3306/";
		        // Database name to access
		        String dbName = "flames";
		        String dbUsername = "root";
		        String dbPassword = "12345";
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con = DriverManager.getConnection(dbURL + dbName,
		                                                     dbUsername, 
		                                                     dbPassword);
		        return con;
		    }
		}

