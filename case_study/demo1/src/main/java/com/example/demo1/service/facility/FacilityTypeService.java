package com.example.demo1.service.facility;

import com.example.demo1.Reponsitory.facility.IFacilityTypeReponsitory;
import com.example.demo1.model.facility.FacilityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeService implements IFacilityTypeService {

    @Autowired
    private IFacilityTypeReponsitory facilityTypeReponsitory;

    @Override
    public List<FacilityType> findAll() {
        return facilityTypeReponsitory.findAll();
    }
}
