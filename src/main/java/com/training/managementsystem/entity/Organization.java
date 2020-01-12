package com.training.managementsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "ORGANIZATION")
class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer organizationId;

    private String organizationName;

    @Column(unique=true)
    private Character organizationCode;

    private String organizationAddress;


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
