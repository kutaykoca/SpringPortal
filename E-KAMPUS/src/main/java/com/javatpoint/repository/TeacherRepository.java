package com.javatpoint.repository;
import com.javatpoint.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TeacherRepository extends JpaRepository<Teacher, Integer>
{
}
