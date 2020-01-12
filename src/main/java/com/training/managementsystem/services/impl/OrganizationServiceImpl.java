package com.training.managementsystem.services.impl;

import com.training.managementsystem.repository.OrganizationRepository;
import com.training.managementsystem.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    OrganizationRepository organizarionRepository;



}
