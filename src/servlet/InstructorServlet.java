package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.InstructorDAO;

@WebServlet("/instructor")
public class InstructorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        int instructorId = Integer.parseInt(request.getParameter("instructorId"));

        InstructorDAO instructorDAO = new InstructorDAO();
        if (instructorDAO.createCourse(title, description, instructorId)) {
            response.sendRedirect("views/instructor/dashboard.jsp");
        } else {
            response.getWriter().println("Error creating course.");
        }
    }
}
