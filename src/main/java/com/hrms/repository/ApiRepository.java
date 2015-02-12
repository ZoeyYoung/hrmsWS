package com.hrms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hrms.entity.Api;

@RepositoryRestResource(collectionResourceRel = "apis", path = "apis")
public interface ApiRepository extends PagingAndSortingRepository<Api, Long> {

}
