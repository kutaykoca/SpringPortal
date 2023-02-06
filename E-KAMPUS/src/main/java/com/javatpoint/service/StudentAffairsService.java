package com.javatpoint.service;

import com.javatpoint.model.StudentAffairs;
import com.javatpoint.repository.StudentAffairsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentAffairsService
{
    @Autowired
    StudentAffairsRepository studentAffairsRepository;
    public List<StudentAffairs> getAllStudentAffairs()
    {
        List<StudentAffairs> studentaffairs = new ArrayList<StudentAffairs>();
        studentAffairsRepository.findAll().forEach(studentAffairs -> studentaffairs.add(studentAffairs));
        return studentaffairs;
    }
    public StudentAffairs getStudentAffairsById(int id)
    {
        return studentAffairsRepository.findById(id).get();
    }
    public void saveOrUpdate(StudentAffairs studentAffairs)
    {
        studentAffairsRepository.save(studentAffairs);
    }
    public void delete(int id)
    {
        studentAffairsRepository.deleteById(id);
    }
}
