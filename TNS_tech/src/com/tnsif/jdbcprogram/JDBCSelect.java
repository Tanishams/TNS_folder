package com.tnsif.jdbcprogram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//demo for jdbc program
public class JDBCSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 2 : load and register driver
		
		Class.forName("org.postgresql.Driver");
		System.out.println("Step 2 Load and register completed");
		
		//step 3 : establish the connection 
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/TNSIFSQL","postgres","Gre#2@wordPost");
		System.out.println("Establish the connection completed");
		
		//step 4: create statement 
		Statement st= conn.createStatement();
		System.out.println("Create statement completed");
		
//step 5: execute the query
		String strselect="select sid,sname, email, sbranch from Student";
		System.out.println("The sql statement"+ strselect);
		System.out.println("Step 5 completed");
		
		//process the result to display
		ResultSet rs= st.executeQuery(strselect);
		System.out.println("The record are:");
		int rowcount =0;
		while(rs.next()) {
			int sid=rs.getInt("sid");
			String sname= rs.getString("sname");
			String email= rs.getString("email");
			String sbranch= rs.getString("sbranch");
			
			System.out.println(sid+" "+sname+" "+email+" "+sbranch+" ");
			++rowcount;
			
//			//insert query
//		String Sqlinsert1="insert into Student values(5,'Tanvi','tanvi@gmail.com','CSE')";
//		String Sqlinsert2="insert into Student values(6,'Ram','ram@gmail.com','ISE')";
//		String Sqlinsert3="insert into Student values(7,'Jia','jia12@gmail.com','CSE')";
//		String Sqlinsert4="insert into Student values(6,'Ria','riya372@gmail.com','ISE')";
//		System.out.println("query written");
//		int countinserted1=st.executeUpdate(Sqlinsert1);
//		int countinserted2=st.executeUpdate(Sqlinsert2);
//		int countinserted3=st.executeUpdate(Sqlinsert3);
//		int countinserted4=st.executeUpdate(Sqlinsert4);
//		System.out.println("countinserted");
		
		}
		
}
}

