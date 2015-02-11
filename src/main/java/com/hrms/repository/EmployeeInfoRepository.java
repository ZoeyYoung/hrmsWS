package com.hrms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hrms.entity.EmployeeInfo;

@RepositoryRestResource(collectionResourceRel = "employeeInfo", path = "employeeInfo")
public interface EmployeeInfoRepository extends PagingAndSortingRepository<EmployeeInfo, Long> {

}
