package com.xworkz.jdbc.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.xworkz.jdbc.DBconstants.DBConstants;
import com.xworkz.jdbc.dto.FestivalDto;
import com.xworkz.jdbc.util.DBUtil;


public class FestivalDao {
	Connection mysql;
	public boolean save(FestivalDto festivalDto) {
		
		try {
			mysql=DriverManager.getConnection(DBConstants.MY_URL,DBConstants.USERNAME,DBConstants.PASSWORD);
			if(!mysql.isClosed()) {
			//	DBUtil.connectingmysql();
			
	//		String sql="insert  into festival_details  values("+festivalDto.getId()+",'"+festivalDto.getName()+"',"+festivalDto.getDate()+",'"+festivalDto.getState()+"')";
	//		Statement s=mysql.createStatement();
			String sql = "insert into festival_details values(?,?,?,?)";
			PreparedStatement preparedStatement = mysql.prepareStatement(sql);
			preparedStatement.setObject(1, festivalDto.getId());
			preparedStatement.setObject(2, festivalDto.getName());
			preparedStatement.setObject(3, festivalDto.getDate());
			preparedStatement.setObject(4, festivalDto.getState());
			
			int rowEffected=preparedStatement.executeUpdate();
			System.out.println(rowEffected);
			if(rowEffected==1) return true;
			}		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				mysql.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return false;		
	}
	public boolean deleteById(int id) {
		try {
			Class.forName(DBConstants.DRIVER);
			Connection mysql=DriverManager.getConnection(DBConstants.MY_URL,DBConstants.USERNAME,DBConstants.PASSWORD);
			Statement statement=mysql.createStatement();
			 String sql = "delete from festival_details where f_id"+id;
			int rowDelete=statement.executeUpdate(sql);
			return true;
				 	
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}	public boolean displayById(int gid){
		
		try {
			Connection mysql=DriverManager.getConnection(DBConstants.MY_URL,DBConstants.USERNAME,DBConstants.PASSWORD);
		//	DBUtil.connectingmysql();
			String sql="select*from festival_details where c_id="+gid;
			PreparedStatement stmt = mysql.prepareStatement(sql);
			ResultSet result=stmt.executeQuery();
			if(result.next()) {
				Object obj1=result.getObject(1);
				System.out.println(obj1);
				Object obj2=result.getObject(2);
				System.out.println(obj2);
				Object obj3=result.getObject(3);
				System.out.println(obj3);
				Object obj4=result.getObject(4);
				System.out.println(obj4);
				
			}
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
		public boolean displayAll(){
			
			try {
				Connection mysql=DriverManager.getConnection(DBConstants.MY_URL,DBConstants.USERNAME,DBConstants.PASSWORD);
			//	DBUtil.connectingmysql();
				String sql="select*from festival_details";
				PreparedStatement stmt = mysql.prepareStatement(sql);
				ResultSet result=stmt.executeQuery();
				while(result.next()) {
					Object obj1=result.getObject(1);
					System.out.println(obj1);
					Object obj2=result.getObject(2);
					System.out.println(obj2);
					Object obj3=result.getObject(3);
					System.out.println(obj3);
					Object obj4=result.getObject(4);
					System.out.println(obj4);
					
				}
				return true;
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		return false;
		
	}

}
