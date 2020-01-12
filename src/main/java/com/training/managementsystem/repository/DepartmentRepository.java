package com.training.managementsystem.repository;

import com.training.managementsystem.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends CrudRepository<Department,Integer> {

}
