package com.hrms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hrms.entity.CaptchaData;

@RepositoryRestResource(collectionResourceRel = "captchaData", path = "captchaData")
public interface CaptchaDataRepository extends PagingAndSortingRepository<CaptchaData, Long> {

}
