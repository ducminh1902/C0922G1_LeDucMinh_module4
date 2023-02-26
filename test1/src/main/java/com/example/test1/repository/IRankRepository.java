package com.example.test1.repository;

import com.example.test1.model.Rank1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRankRepository extends JpaRepository<Rank1,Integer> {
}
