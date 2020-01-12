package com.training.managementsystem.services.impl;

import com.training.managementsystem.repository.DepartmentRepository;
import com.training.managementsystem.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;
    

}
