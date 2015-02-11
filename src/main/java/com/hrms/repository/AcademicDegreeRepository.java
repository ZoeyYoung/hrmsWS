package com.hrms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hrms.entity.AcademicDegree;

@RepositoryRestResource(collectionResourceRel = "academicDegree", path = "academicDegree")
public interface AcademicDegreeRepository extends PagingAndSortingRepository<AcademicDegree, Long> {

}
