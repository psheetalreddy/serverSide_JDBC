package sheetal;

import java.io.*;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dispWhereClauseJDBC")
public class dispWhereClauseJDBC extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1 style= 'text-align: center'><em><strong>Display Required Records from Employee Database</strong></em></h1><br><br>");
		
		String condition = request.getParameter("condition");
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","sheetal");
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("Select * from employee where " + condition + ";");
			
			while(rs.next()) {
			    out.println("<strong>Employee Id :</strong>" + rs.getString("emp_id") + "<br>" + "<strong>Name :</strong>" + rs.getString("name") + "<br>" + "<strong>Age :</strong>" + rs.getInt("age") + "<br>" + "<strong>Mobile No :</strong>" + rs.getLong("mobile_no")+ "<br>" + "<strong>Date of Birth :</strong>" + rs.getString("date_of_birth") + "<br>" + "<strong>Address :</strong>" + rs.getString("address") + "<br>" + "<strong>Salary :</strong>" + rs.getString("salary") + "<br>" + "<strong>Experience :</strong>" + rs.getString("experience") + "<br><br>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
