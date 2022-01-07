package com.te.preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepared {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcpractice";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "Praveen$96");
			PreparedStatement prepareStatement = connection.prepareStatement("insert into boys values(?,?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the id");
			int id=sc.nextInt();
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the dept");
			String dept=sc.next();
			prepareStatement.setInt(1, id);
			prepareStatement.setString(2, name);
			prepareStatement.setString(3, dept);
			prepareStatement.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
