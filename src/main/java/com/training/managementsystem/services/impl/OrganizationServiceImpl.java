package com.training.managementsystem.services.impl;

import com.training.managementsystem.entity.Organization;
import com.training.managementsystem.repository.OrganizationRepository;
import com.training.managementsystem.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    OrganizationRepository organizationRepository;

    @Override
    public Integer findAllDepartments() {
        List<Organization> organizations = organizationRepository.findAll();
        System.out.println(organizations);
        return organizations.size();
    }
}
