package services;

import dao.StudentDAO;
import model.Student;

public class StudentService {
    private StudentDAO studentDAO;

    public StudentService() {
        studentDAO = new StudentDAO();
    }

    // Service to add a new student
    public boolean addStudent(Student student) {
        return studentDAO.insertStudent(student);
    }

    // Service to update a student's details
    public boolean updateStudent(Student student) {
        return studentDAO.updateStudent(student);
    }

    // Service to delete a student
    public boolean deleteStudent(int studentId) {
        return studentDAO.deleteStudent(studentId);
    }

    // Service to fetch a student by ID
    public Student getStudentById(int studentId) {
        return studentDAO.getStudentById(studentId);
    }
}
