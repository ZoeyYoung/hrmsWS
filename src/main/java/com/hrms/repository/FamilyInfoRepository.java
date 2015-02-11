package com.hrms.repository;

import java.util.Collection;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hrms.entity.FamilyInfo;

@RepositoryRestResource(collectionResourceRel = "familyInfo", path = "familyInfo")
public interface FamilyInfoRepository extends PagingAndSortingRepository<FamilyInfo, Long> {
    Collection<FamilyInfo> findByEmployeeId(Long id);
}
