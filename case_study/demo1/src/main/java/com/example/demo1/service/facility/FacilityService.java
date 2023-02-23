package com.example.demo1.service.facility;

import com.example.demo1.Reponsitory.facility.IFacilityReponsitory;
import com.example.demo1.model.facility.Facility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityService implements IFacilityService{

    @Autowired
    private IFacilityReponsitory facilityReponsitory;



    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return facilityReponsitory.findAll(pageable);
    }

    @Override
    public List<Facility> findAll1() {
        return facilityReponsitory.findAll();
    }

    @Override
    public void add(Facility facility) {
        facilityReponsitory.save(facility);
    }

    @Override
    public void delete(int id) {
        facilityReponsitory.deleteById(id);
    }

    @Override
    public Optional<Facility> findById(int id) {
        return facilityReponsitory.findById(id);
    }

    @Override
    public List<Facility> search(String name, String facilityType) {
        return facilityReponsitory.search(name,facilityType);
    }
}
