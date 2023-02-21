package com.example.demo1.service.facility;

import com.example.demo1.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IFacilityService {
    Page<Facility> findAll(Pageable pageable);

    void add(Facility facility);

    void delete(int id);

    Optional<Facility> findById(int id);

    List<Facility> search(String name,String facilityType);
}
