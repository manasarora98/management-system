package com.training.managementsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "DEPARTMENT", uniqueConstraints = {
        @UniqueConstraint(columnNames = "departmentCode")})
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer departmentId;
    private String departmentName;
    @Column(unique = true)
    private Character departmentCode;
    //private Integer departmentParent;


    @ManyToOne
    @JoinColumn(name = "department_parent")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @OneToMany(mappedBy = "department")
    private Set<Department> departments;

    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Character getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(Character departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
