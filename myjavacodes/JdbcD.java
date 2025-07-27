package myjavacodes;

import java.sql.Connection;

public class JdbcD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro2025","root","Raja@0510");
		System.out.println("CC");

	}

}
