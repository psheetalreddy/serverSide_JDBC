package sheetal;

import java.io.*;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteRecordJDBC")
public class deleteRecordJDBC extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String condition = request.getParameter("condition");
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "sheetal");
			Statement st = con.createStatement();
			
			st.executeUpdate("delete from employee where " + condition);
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		out.println("<h1 style = 'text-align:center'>Successfully deleted!</h1>");
	}

}
