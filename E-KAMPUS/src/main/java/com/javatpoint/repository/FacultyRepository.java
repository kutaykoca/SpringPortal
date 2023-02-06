package com.javatpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.javatpoint.model.Faculty;
public interface FacultyRepository extends JpaRepository<Faculty, Integer>
{
}
