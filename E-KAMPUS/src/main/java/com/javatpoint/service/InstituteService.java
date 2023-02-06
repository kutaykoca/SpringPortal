package com.javatpoint.service;

import com.javatpoint.model.Institute;
import com.javatpoint.repository.InstituteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstituteService
{
    @Autowired
    InstituteRepository instituteRepository;
    public List<Institute> getAllInstitute()
    {
        List<Institute> institutes = new ArrayList<Institute>();
        instituteRepository.findAll().forEach(institute -> institutes.add(institute));
        return institutes;
    }
    public Institute getInstituteById(int id)
    {
        return instituteRepository.findById(id).get();
    }
    public void saveOrUpdate(Institute institute)
    {
        instituteRepository.save(institute);
    }
    public void delete(int id)
    {
        instituteRepository.deleteById(id);
    }
}