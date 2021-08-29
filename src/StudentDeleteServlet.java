
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentDeleteServlet")
public class StudentDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected <MovieDAO> void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String id = request.getParameter(id);

		
		try {
			int StudentId = Integer.parseInt(request.getParameter("Id"));
			StudentDAO StudentDAO = new StudentDAO();

			int errorCode = StudentDAO.deleteStudent(id);
			out.print(errorCode);
			Connection connection = DriverManager.getConnection("jdbc:sqlite://locahost:8080/StudentDatabase");
			PreparedStatement preparedS = connection.prepareStatement("delete student");
			preparedS.setString(1, id);
			int execute = preparedS.executeUpdate();

			if (execute > 0) {
				out.println("User successfully removed the student...");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");

	}

}
