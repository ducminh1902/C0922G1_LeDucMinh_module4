package com.example.demo1.model.facility;

import com.example.demo1.model.Contract.Contract;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int area;
    private double cost;
    private int max_people;
    private String standard_room;
    private String descriptionOtherConvience;
    private double poolArea;
    private int numberOfFloor;
    private String facilityFree;

   @ManyToOne
    @JoinColumn(name = "facility_type_id", referencedColumnName = "id")
    private FacilityType facilityType;

   @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "id")
    private RentType rentType;

   @OneToMany(mappedBy = "facility")
    private Set<Contract> contractSet;
}
