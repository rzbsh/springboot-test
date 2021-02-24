package com.example.demo.dao;

import com.example.demo.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ServiceRepository extends JpaRepository<Service, Long> {
}
