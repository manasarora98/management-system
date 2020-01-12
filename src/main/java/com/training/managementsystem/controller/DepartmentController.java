package com.training.managementsystem.controller;


import com.training.managementsystem.entity.Department;
import com.training.managementsystem.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping
    String getMessage(){
        return "Department";
    }


    @GetMapping("/departments/{departmentId}/departments")
    public Integer getDepartmentsByDepartmentId(@PathVariable(value = "departmentId") Integer departmentId) {
         return departmentService.countOfChildDepartments(departmentId);

    }




}
