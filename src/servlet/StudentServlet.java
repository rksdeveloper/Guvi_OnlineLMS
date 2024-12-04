package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.StudentDAO;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        int courseId = Integer.parseInt(request.getParameter("courseId"));

        StudentDAO studentDAO = new StudentDAO();
        if (studentDAO.enrollCourse(studentId, courseId)) {
            response.sendRedirect("views/student/dashboard.jsp");
        } else {
            response.getWriter().println("Error enrolling in course.");
        }
    }
}
