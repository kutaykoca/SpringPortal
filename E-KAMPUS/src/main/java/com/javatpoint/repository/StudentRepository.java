package com.javatpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javatpoint.model.Student;
public interface StudentRepository extends JpaRepository<Student, Integer>
{
}

