package com.javatpoint.controller;

import com.javatpoint.model.StudentAffairs;
import com.javatpoint.service.StudentAffairsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentAffairsController
{
    @Autowired
    StudentAffairsService studentAffairsService;
    @GetMapping("/studentaffairs")
    private List<StudentAffairs> getAllStudentAffairs()
    {
        return studentAffairsService.getAllStudentAffairs();
    }
    @GetMapping("/studentaffairs/{id}")
    private StudentAffairs getStudentAffairs(@PathVariable("id") int id)
    {
        return studentAffairsService.getStudentAffairsById(id);
    }
    @DeleteMapping("/studentaffairs/{id}")
    private void deleteStudentAffairs(@PathVariable("id") int id)
    {
        studentAffairsService.delete(id);
    }
    @PostMapping("/studentaffairs")
    private int saveStudentAffairs(@RequestBody StudentAffairs studentAffairs)
    {
        studentAffairsService.saveOrUpdate(studentAffairs);
        return studentAffairs.getId();
    }
}