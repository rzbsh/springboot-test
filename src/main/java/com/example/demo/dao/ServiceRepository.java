package com.example.demo.dao;

import com.example.demo.entity.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
public interface ServiceRepository extends JpaRepository<Service, Long> {

    // spring will execute similar to SELECT * FROM service WHERE category_id=?
    // and exposes endpoint .../api/services/search/findByCategoryId?id=2
    Page<Service> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
}
