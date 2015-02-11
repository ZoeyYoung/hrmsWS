package com.hrms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hrms.entity.LanguagesLevel;

@RepositoryRestResource(collectionResourceRel = "languagesLevel", path = "languagesLevel")
public interface LanguagesLevelRepository extends PagingAndSortingRepository<LanguagesLevel, Long> {

}
