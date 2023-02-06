package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Lesson;
import com.javatpoint.repository.LessonRepository;
@Service
public class LessonService
{
    @Autowired
    LessonRepository lessonRepository;
    public List<Lesson> getAllLesson()
    {
        List<Lesson> lessons = new ArrayList<Lesson>();
        lessonRepository.findAll().forEach(lesson -> lessons.add(lesson));
        return lessons;
    }
    public Lesson getLessonById(int id)
    {
        return lessonRepository.findById(id).get();
    }
    public void saveOrUpdate(Lesson lesson)
    {
        lessonRepository.save(lesson);
    }
    public void delete(int id)
    {
        lessonRepository.deleteById(id);
    }
}