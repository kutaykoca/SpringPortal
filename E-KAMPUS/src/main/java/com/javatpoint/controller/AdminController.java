package com.javatpoint.controller;

import com.javatpoint.model.Admin;
import com.javatpoint.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController
{
    @Autowired
    AdminService adminService;
    @GetMapping("/admin")
    private List<Admin> getAllAdmin()
    {
        return adminService.getAllAdmin();
    }
    @GetMapping("/admin/{id}")
    private Admin getAdmin(@PathVariable("id") int id)
    {
        return adminService.getAdminById(id);
    }
    @DeleteMapping("/admin/{id}")
    private void deleteAdmin(@PathVariable("id") int id)
    {
        adminService.delete(id);
    }
    @PostMapping("/admin")
    private int saveAdmin(@RequestBody Admin admin)
    {
        adminService.saveOrUpdate(admin);
        return admin.getId();
    }
}
