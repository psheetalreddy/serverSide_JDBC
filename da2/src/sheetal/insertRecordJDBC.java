package sheetal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/insertRecordJDBC")
public class insertRecordJDBC extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		long mobile = Long.parseLong(request.getParameter("mobile"));
		String date = request.getParameter("dob");
		String address = request.getParameter("address");
		int exp = Integer.parseInt(request.getParameter("exp"));
		int sal = Integer.parseInt(request.getParameter("salary"));
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		Connection con;
		Statement st;
		String iquery = "INSERT INTO employee VALUES ('" + id + "', '" + name + "', " + age + ", " + mobile + ", '" + date + "', '" + address + "', " + sal + ", " + exp + ")";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "sheetal");
			st = con.createStatement();
			st.executeUpdate(iquery);
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PrintWriter out = response.getWriter();
		out.println("<h1 style = 'text-align:center'>Successfully Inserted!</h1>");
	}
}
