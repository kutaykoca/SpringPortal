package com.javatpoint.controller;

import com.javatpoint.model.Institute;
import com.javatpoint.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstituteController
{
    @Autowired
    InstituteService instituteService;
    @GetMapping("/institute")
    private List<Institute> getAllInstitute()
    {
        return instituteService.getAllInstitute();
    }
    @GetMapping("/institute/{id}")
    private Institute getInstitute(@PathVariable("id") int id)
    {
        return instituteService.getInstituteById(id);
    }
    @DeleteMapping("/institute/{id}")
    private void deleteInstitute(@PathVariable("id") int id)
    {
        instituteService.delete(id);
    }
    @PostMapping("/institute")
    private int saveInstitute(@RequestBody Institute institute)
    {
        instituteService.saveOrUpdate(institute);
        return institute.getId();
    }
}
