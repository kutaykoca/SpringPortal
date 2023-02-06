package com.javatpoint.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.model.Teacher;
import com.javatpoint.service.TeacherService;

@RestController
public class TeacherController
{


    @Autowired
    TeacherService teacherService;
    @GetMapping("/teacher")
    private List<Teacher> getAllTeacher()
    {
        return teacherService.getAllTeacher();
    }
    @GetMapping("/teacher/{id}")
    private Teacher getTeacher(@PathVariable("id") int id)
    {
        return teacherService.getTeacherById(id);
    }
    @DeleteMapping("/teacher/{id}")
    private void deleteTeacher(@PathVariable("id") int id)
    {
        teacherService.delete(id);
    }
    @PostMapping("/teacher")
    private int saveTeacher(@RequestBody Teacher teacher)
    {
        teacherService.saveOrUpdate(teacher);
        return teacher.getId();
    }
}
