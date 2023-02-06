package com.javatpoint.repository;

import com.javatpoint.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, Integer>
{
}
