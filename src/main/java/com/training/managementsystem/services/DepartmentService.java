package com.training.managementsystem.services;

import com.training.managementsystem.entity.Department;

import java.util.List;

public interface DepartmentService {
    Integer countOfChildDepartments(Integer departmentId);
}
