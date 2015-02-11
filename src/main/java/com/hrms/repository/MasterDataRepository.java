package com.hrms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hrms.entity.MasterData;

@RepositoryRestResource(collectionResourceRel = "masterData", path = "masterData")
public interface MasterDataRepository extends PagingAndSortingRepository<MasterData, Long> {

}
