package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Faculty;
import com.javatpoint.repository.FacultyRepository;
@Service
public class FacultyService
{
    @Autowired
    FacultyRepository facultyRepository;
    public List<Faculty> getAllFaculty()
    {
        List<Faculty> faculties = new ArrayList<Faculty>();
        facultyRepository.findAll().forEach(faculty -> faculties.add(faculty));
        return faculties;
    }
    public Faculty getFacultyById(int id)
    {
        return facultyRepository.findById(id).get();
    }
    public void saveOrUpdate(Faculty faculty)
    {
        facultyRepository.save(faculty);
    }
    public void delete(int id)
    {
        facultyRepository.deleteById(id);
    }
}