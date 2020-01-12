package com.training.managementsystem.services.impl;

import com.training.managementsystem.entity.Department;
import com.training.managementsystem.repository.DepartmentRepository;
import com.training.managementsystem.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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

    void addChildren(Department parent, List<Department> children) {
        if(null != parent.getDepartments()) {
            for(Department child : parent.getDepartments()) {
                System.out.println(child.getDepartmentName());
                children.add(child);
                addChildren(child, children);
            }
        }
    }


}
