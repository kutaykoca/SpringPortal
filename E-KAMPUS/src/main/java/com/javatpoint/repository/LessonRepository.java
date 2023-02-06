package com.javatpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javatpoint.model.Lesson;
public interface LessonRepository extends JpaRepository<Lesson, Integer>
{
}
