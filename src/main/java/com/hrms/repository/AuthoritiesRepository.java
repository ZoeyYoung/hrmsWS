package com.hrms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hrms.entity.Authorities;

@RepositoryRestResource(collectionResourceRel = "authorities", path = "authorities")
public interface AuthoritiesRepository extends PagingAndSortingRepository<Authorities, Long> {

}
