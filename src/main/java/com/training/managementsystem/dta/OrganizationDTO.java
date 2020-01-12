package com.training.managementsystem.dta;

public class OrganizationDTO {

    Integer organizationId;
    String organizationName;
    Character organizationCode;
    String organizationAddress;

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Character getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(Character organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }



}
