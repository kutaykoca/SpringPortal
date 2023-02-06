package com.javatpoint.controller;
import java.util.List;

import com.javatpoint.model.Student;
import com.javatpoint.repository.LessonRepository;
import com.javatpoint.repository.StudentRepository;
import com.javatpoint.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.javatpoint.model.Lesson;
import com.javatpoint.model.Teacher;
import com.javatpoint.service.LessonService;

@RestController
@RequestMapping("/lesson")
public class LessonController
{
    @Autowired
    LessonService lessonService;
    @Autowired
    private LessonRepository lessonRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping
    private List<Lesson> getAllLesson()
    {
        return lessonService.getAllLesson();
    }
    @GetMapping("/{id}")
    private Lesson getLesson(@PathVariable("id") int id)
    {
        return lessonService.getLessonById(id);
    }
    @DeleteMapping("/{id}")
    private void deleteLesson(@PathVariable("id") int id)
    {
        lessonService.delete(id);
    }
    @PostMapping
    private int saveLesson(@RequestBody Lesson lesson)
    {
        lessonService.saveOrUpdate(lesson);
        return lesson.getId();
    }
    @PutMapping("/{lessonId}/student/{studentId}")
    Lesson enrollStudentToLesson(
            @PathVariable int lessonId,
            @PathVariable int studentId
    ) {
        Lesson lesson  = lessonRepository.findById(lessonId).get();
        Student student = studentRepository.findById(studentId).get();
        lesson.enrollStudent(student);
        return lessonRepository.save(lesson);
    }

}
