package com.training.managementsystem.controller;

import com.training.managementsystem.entity.Organization;
import com.training.managementsystem.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;


    @GetMapping
    String getMessage(){
        return "Organization";
    }

    @GetMapping("/departments")
    public Integer getDepartments() {
        return organizationService.findAllDepartments();

    }




}
