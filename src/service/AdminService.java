package services;

import dao.AdminDAO;
import model.Admin;

public class AdminService {
    private AdminDAO adminDAO;

    public AdminService() {
        adminDAO = new AdminDAO();
    }

    // Service to add a new admin
    public boolean addAdmin(Admin admin) {
        return adminDAO.insertAdmin(admin);
    }

    // Service to update an admin's details
    public boolean updateAdmin(Admin admin) {
        return adminDAO.updateAdmin(admin);
    }

    // Service to delete an admin
    public boolean deleteAdmin(int adminId) {
        return adminDAO.deleteAdmin(adminId);
    }

    // Service to fetch an admin by ID
    public Admin getAdminById(int adminId) {
        return adminDAO.getAdminById(adminId);
    }
}
