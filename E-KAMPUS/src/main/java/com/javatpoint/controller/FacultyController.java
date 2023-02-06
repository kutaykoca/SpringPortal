package com.javatpoint.controller;

import com.javatpoint.model.Faculty;
import com.javatpoint.model.Lesson;
import com.javatpoint.model.Teacher;
import com.javatpoint.repository.FacultyRepository;
import com.javatpoint.repository.TeacherRepository;
import com.javatpoint.repository.LessonRepository;
import com.javatpoint.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/faculty")
public class FacultyController
{
    @Autowired
    FacultyService facultyService;
    @Autowired
    private FacultyRepository facultyRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private LessonRepository lessonRepository;

    @GetMapping
    private List<Faculty> getAllFaculty()
    {
        return facultyService.getAllFaculty();
    }
    @GetMapping("/{id}")
    private Faculty getFaculty(@PathVariable("id") int id)
    {
        return facultyService.getFacultyById(id);
    }
    @DeleteMapping("/{id}")
    private void deleteFaculty(@PathVariable("id") int id)
    {
        facultyService.delete(id);
    }
    @PostMapping
    private int saveFaculty(@RequestBody Faculty faculty)
    {
        facultyService.saveOrUpdate(faculty);
        return faculty.getId();
    }
    @PutMapping("/{facultyId}/teacher/{teacherId}")
    Faculty enrollTeacherToFaculty(
            @PathVariable int facultyId,
            @PathVariable int teacherId
    ) {
        Faculty faculty  = facultyRepository.findById(facultyId).get();
        Teacher teacher = teacherRepository.findById(teacherId).get();
        faculty.enrollTeacher(teacher);
        return facultyRepository.save(faculty);
    }
    @PutMapping("/{facultyId}/lesson/{lessonId}")
    Faculty enrollLessonToFaculty(
            @PathVariable int facultyId,
            @PathVariable int lessonId
    ) {
        Faculty faculty  = facultyRepository.findById(facultyId).get();
        Lesson lesson = lessonRepository.findById(lessonId).get();
        faculty.enrollLesson(lesson);
        return facultyRepository.save(faculty);
    }
}
