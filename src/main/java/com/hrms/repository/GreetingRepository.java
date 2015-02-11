package com.hrms.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hrms.entity.Greeting;

@RepositoryRestResource(collectionResourceRel = "greeting", path = "greeting")
public interface GreetingRepository extends PagingAndSortingRepository<Greeting, Long> {

    List<Greeting> findByContent(@Param("content") String content);
}
