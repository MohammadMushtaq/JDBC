package com.xworkz.jdbc.util;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.PooledConnection;

import com.xworkz.jdbc.DBconstants.DBConstants;

public class DBUtil {

	private static Connection dbConnection = null;

	public static Connection getConnection() {
		if (dbConnection == null) {
			try {

				dbConnection = DriverManager.getConnection(DBConstants.MY_URL, DBConstants.USERNAME,
						DBConstants.PASSWORD);
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
		return dbConnection;
	}
	public static Connection mysql(PooledConnection dbconn) {
		
		
		return dbConnection;
		
	}
}