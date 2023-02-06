package com.javatpoint.service;

import com.javatpoint.model.Department;
import com.javatpoint.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService
{
    @Autowired
    DepartmentRepository departmentRepository;
    public List<Department> getAllDepartment()
    {
        List<Department> departments = new ArrayList<Department>();
        departmentRepository.findAll().forEach(department -> departments.add(department));
        return departments;
    }
    public Department getDepartmentById(int id)
    {
        return departmentRepository.findById(id).get();
    }
    public void saveOrUpdate(Department department)
    {
        departmentRepository.save(department);
    }
    public void delete(int id)
    {
        departmentRepository.deleteById(id);
    }
}