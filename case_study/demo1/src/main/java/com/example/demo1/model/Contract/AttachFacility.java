package com.example.demo1.model.Contract;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AttachFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double cost;
    private String unit;
    private String status;

    @OneToMany(mappedBy = "attachFacility")
    private Set<ContractDetail> contractDetailSet;

}
