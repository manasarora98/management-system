package com.training.managementsystem.repository;

import com.training.managementsystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
