package com.example.demo.dao;

import com.example.demo.entity.ServiceCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "serviceCategory", path = "service-category") // Name of JSON entity, /service-category
public interface ServiceCategoryRepository extends JpaRepository<ServiceCategory, Long> { //Entity, Primary Key
}
