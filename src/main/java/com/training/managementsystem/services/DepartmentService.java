package com.training.managementsystem.services;

public interface DepartmentService {
    Integer countOfChildDepartments(Integer departmentId);
    void countOfEmployeesAtChildDepartments(Integer departmentId);
}
