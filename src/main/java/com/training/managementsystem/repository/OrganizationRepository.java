package com.training.managementsystem.repository;

import com.training.managementsystem.entity.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization,Integer> {
}
