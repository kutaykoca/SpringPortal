package com.javatpoint.service;

import com.javatpoint.model.HumanResources;
import com.javatpoint.repository.HumanResourcesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HumanResourcesService
{
    @Autowired
    HumanResourcesRepository humanResourcesRepository;
    public List<HumanResources> getAllHumanResources()
    {
        List<HumanResources> humanresources = new ArrayList<HumanResources>();
        humanResourcesRepository.findAll().forEach(humanResources -> humanresources.add(humanResources));
        return humanresources;
    }
    public HumanResources getHumanResourcesById(int id)
    {
        return humanResourcesRepository.findById(id).get();
    }
    public void saveOrUpdate(HumanResources humanResources)
    {
        humanResourcesRepository.save(humanResources);
    }
    public void delete(int id)
    {
        humanResourcesRepository.deleteById(id);
    }
}