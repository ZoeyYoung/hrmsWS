package com.hrms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hrms.entity.MasterType;

@RepositoryRestResource(collectionResourceRel = "masterType", path = "masterType")
public interface MasterTypeRepository extends PagingAndSortingRepository<MasterType, Long> {

}
