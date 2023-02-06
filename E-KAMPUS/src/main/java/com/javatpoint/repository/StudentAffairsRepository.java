package com.javatpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javatpoint.model.StudentAffairs;

public interface StudentAffairsRepository extends JpaRepository<StudentAffairs, Integer>
{
}
