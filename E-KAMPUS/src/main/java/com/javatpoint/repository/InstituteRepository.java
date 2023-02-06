package com.javatpoint.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javatpoint.model.Institute;
public interface InstituteRepository extends JpaRepository<Institute, Integer>
{
}
