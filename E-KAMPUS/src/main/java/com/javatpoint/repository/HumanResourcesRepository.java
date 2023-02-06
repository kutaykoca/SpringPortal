package com.javatpoint.repository;
import com.javatpoint.model.HumanResources;
import org.springframework.data.jpa.repository.JpaRepository;
public interface HumanResourcesRepository extends JpaRepository<HumanResources, Integer>
{
}
