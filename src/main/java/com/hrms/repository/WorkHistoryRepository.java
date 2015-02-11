package com.hrms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hrms.entity.WorkHistory;

@RepositoryRestResource(collectionResourceRel = "workHistory", path = "workHistory")
public interface WorkHistoryRepository extends PagingAndSortingRepository<WorkHistory, Long> {

}
