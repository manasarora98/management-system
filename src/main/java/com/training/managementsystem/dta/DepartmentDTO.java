package com.training.managementsystem.dta;

public class DepartmentDTO {

    /*
    *
    * ID
    * Name
    * Code
    * ParentDepartment
    * Organization Id
    *
    * */

    Integer departmentId;
    String departmentName;
    Character departmentCode;
    Integer departmentParent;
    Integer organizationId;

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

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }
}
