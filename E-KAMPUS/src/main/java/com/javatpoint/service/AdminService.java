package com.javatpoint.service;

import com.javatpoint.model.Admin;
import com.javatpoint.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService
{
    @Autowired
    AdminRepository adminRepository;
    public List<Admin> getAllAdmin()
    {
        List<Admin> admins = new ArrayList<Admin>();
        adminRepository.findAll().forEach(admin -> admins.add(admin));
        return admins;
    }
    public Admin getAdminById(int id)
    {
        return adminRepository.findById(id).get();
    }
    public void saveOrUpdate(Admin admin)
    {
        adminRepository.save(admin);
    }
    public void delete(int id)
    {
        adminRepository.deleteById(id);
    }
}