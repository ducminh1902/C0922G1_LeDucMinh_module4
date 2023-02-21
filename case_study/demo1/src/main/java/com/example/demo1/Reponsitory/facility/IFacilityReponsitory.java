package com.example.demo1.Reponsitory.facility;

import com.example.demo1.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IFacilityReponsitory extends JpaRepository<Facility,Integer> {
    @Query(value = "select * from facility where name like concat('%',:name,'%') and facility_type_id like concat('%',:facilityTypeId,'%') ",nativeQuery = true)
    List<Facility> search(@Param("name")String name,@Param("facilityTypeId")String facilityTypeId);
    Page<Facility> findAll(Pageable pageable);
}
