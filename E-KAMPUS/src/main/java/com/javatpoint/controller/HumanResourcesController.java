package com.javatpoint.controller;

import com.javatpoint.model.HumanResources;
import com.javatpoint.service.HumanResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HumanResourcesController
{
    @Autowired
    HumanResourcesService humanResourcesService;
    @GetMapping("/humanresources")
    private List<HumanResources> getAllHumanResources()
    {
        return humanResourcesService.getAllHumanResources();
    }
    @GetMapping("/humanresources/{id}")
    private HumanResources getHumanResources(@PathVariable("id") int id)
    {
        return humanResourcesService.getHumanResourcesById(id);
    }
    @DeleteMapping("/humanresources/{id}")
    private void deleteHumanResources(@PathVariable("id") int id)
    {
        humanResourcesService.delete(id);
    }
    @PostMapping("/humanresources")
    private int saveHumanResources(@RequestBody HumanResources humanResources)
    {
        humanResourcesService.saveOrUpdate(humanResources);
        return humanResources.getId();
    }
}
