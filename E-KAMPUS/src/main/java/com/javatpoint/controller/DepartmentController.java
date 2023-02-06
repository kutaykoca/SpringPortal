package com.javatpoint.controller;
import java.util.List;

import com.javatpoint.model.Department;
import com.javatpoint.model.Faculty;
import com.javatpoint.model.StudentAffairs;
import com.javatpoint.repository.DepartmentRepository;

import com.javatpoint.repository.StudentAffairsRepository;

import com.javatpoint.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/department")
public class DepartmentController
{
    @Autowired
    DepartmentService departmentService;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private StudentAffairsRepository studentAffairsRepository;

    @GetMapping
    private List<Department> getAllDepartment()
    {
        return departmentService.getAllDepartment();
    }
    @GetMapping("/{id}")
    private Department getDepartment(@PathVariable("id") int id)
    {
        return departmentService.getDepartmentById(id);
    }
    @DeleteMapping("/{id}")
    private void deleteDepartment(@PathVariable("id") int id)
    {
        departmentService.delete(id);
    }
    @PostMapping
    private int saveDepartment(@RequestBody Department department)
    {
        departmentService.saveOrUpdate(department);
        return department.getId();
    }
    @PutMapping("/{departmentId}/studentAffairs/{studentAffairsId}")
    Department enrollStudentAffairsToDepartment(
            @PathVariable int departmentId,
            @PathVariable int studentAffairsId
    ) {
        Department department  = departmentRepository.findById(departmentId).get();
        StudentAffairs studentAffairs = studentAffairsRepository.findById(studentAffairsId).get();
        department.enrollStudentAffairs(studentAffairs);
        return departmentRepository.save(department);
    }
}
