package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;

import com.javatpoint.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.repository.TeacherRepository;
@Service
public class TeacherService
{
    @Autowired
    TeacherRepository teacherRepository;
    public List<Teacher> getAllTeacher()
    {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teacherRepository.findAll().forEach(teacher -> teachers.add(teacher));
        return teachers;
    }
    public Teacher getTeacherById(int id)
    {
        return teacherRepository.findById(id).get();
    }
    public void saveOrUpdate(Teacher teacher)
    {
        teacherRepository.save(teacher);
    }
    public void delete(int id)
    {
        teacherRepository.deleteById(id);
    }
}