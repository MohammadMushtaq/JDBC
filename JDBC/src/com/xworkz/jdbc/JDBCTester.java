package com.xworkz.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCTester {

	public static void main(String[] args) {
		Connection mysql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/club";
			String usename="root";
			String password="root";
			try {
				 mysql = DriverManager.getConnection(url,usename,password);
				 
				if(!mysql.isClosed()) {
					System.out.println("print this connection");
				
				String sql="insert  into clubDetails(cid,cname,clocation,cbouncers)values(2,'nightclub','btm',5)";
				String sql1="insert  into clubDetails(cid,cname,clocation,cbouncers)values(3,'latenight','yellanka',6)";
				String sql2="insert  into clubDetails(cid,cname,clocation,cbouncers)values(4,'cuba','malleshwaram',7)";
				String sql3="insert  into clubDetails(cid,cname,clocation,cbouncers)values(5,'rangoon','rajajinagar',8)";
				String sql4="insert  into clubDetails(cid,cname,clocation,cbouncers)values(6,'lets have a party','kormangla',15)";
				String sql5="insert  into clubDetails(cid,cname,clocation,cbouncers)values(7,'new club','mg road',14)";
				String sql6="insert  into clubDetails(cid,cname,clocation,cbouncers)values(8,'club8','nelamangla',9)";
				String sql7="insert  into clubDetails(cid,cname,clocation,cbouncers)values(10,'nightclub9','shivaji nagar',10)";
				Statement statement=mysql.createStatement();
				boolean roweffected=statement.execute(sql7);
				System.out.println(roweffected);
				System.out.println(sql7);
			//	System.out.println(sql1);
			//	System.out.println(sql2);
				
				
				
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("after driver class loaded and registested");
		} catch (ClassNotFoundException e) {
			
			System.out.println();
		}finally {
		 
				try {
					mysql.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				System.out.println();
			
		}
		
		
	}
}
