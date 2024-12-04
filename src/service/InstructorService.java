package services;

import dao.InstructorDAO;
import model.Instructor;

public class InstructorService {
    private InstructorDAO instructorDAO;

    public InstructorService() {
        instructorDAO = new InstructorDAO();
    }

    // Service to add a new instructor
    public boolean addInstructor(Instructor instructor) {
        return instructorDAO.insertInstructor(instructor);
    }

    // Service to update an instructor's details
    public boolean updateInstructor(Instructor instructor) {
        return instructorDAO.updateInstructor(instructor);
    }

    // Service to delete an instructor
    public boolean deleteInstructor(int instructorId) {
        return instructorDAO.deleteInstructor(instructorId);
    }

    // Service to fetch an instructor by ID
    public Instructor getInstructorById(int instructorId) {
        return instructorDAO.getInstructorById(instructorId);
    }
}
