package com.training.managementsystem.services.impl;

import com.training.managementsystem.entity.Department;
import com.training.managementsystem.entity.Employee;
import com.training.managementsystem.repository.DepartmentRepository;
import com.training.managementsystem.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Integer countOfChildDepartments(Integer departmentId) {

        Optional<Department> department = departmentRepository.findById(departmentId);
        Department tempDepartment = department.get();
        List<Department> children = new ArrayList<>();
        addChildren(tempDepartment,children);

        return children.size();
    }

    private void addChildren(Department parent, List<Department> children) {
        if(null != parent.getDepartments()) {
            for(Department child : parent.getDepartments()) {
                System.out.println(child.getDepartmentName());
                children.add(child);
                addChildren(child, children);
            }
        }
    }

    @Override
    public void countOfEmployeesAtChildDepartments(Integer departmentId) {
        Optional<Department> department = departmentRepository.findById(departmentId);
        Department tempDepartment = department.get();
        List<Department> children = new ArrayList<>();
        getChildrenEmployees(tempDepartment,children);
    }

    private void getChildrenEmployees(Department parent, List<Department> children) {
        if(null != parent.getDepartments()) {
            for(Department child : parent.getDepartments()) {

                Set<Employee> employees = child.getEmployees();
                System.out.println("---------------------------");
                System.out.println(child.getDepartmentName());
                System.out.println(employees.size());
                System.out.println("---------------------------");

                children.add(child);
                getChildrenEmployees(child, children);
            }
        }
    }
}
