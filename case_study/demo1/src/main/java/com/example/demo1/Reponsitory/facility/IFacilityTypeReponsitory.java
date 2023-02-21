package com.example.demo1.Reponsitory.facility;

import com.example.demo1.model.facility.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacilityTypeReponsitory extends JpaRepository<FacilityType,Integer> {
}
