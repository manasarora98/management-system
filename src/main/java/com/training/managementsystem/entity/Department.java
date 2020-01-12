package com.training.managementsystem.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "DEPARTMENT", uniqueConstraints = {
        @UniqueConstraint(columnNames = "departmentCode")})
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer departmentId;
    private String departmentName;
    @Column(unique = true)
    private Character departmentCode;
    private Integer departmentParent;
    @ManyToOne
    private Organization organization;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
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

    public Integer getDepartmentParent() {
        return departmentParent;
    }

    public void setDepartmentParent(Integer departmentParent) {
        this.departmentParent = departmentParent;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

//    private Integer organizationId;

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }


}
