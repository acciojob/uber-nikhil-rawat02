package com.driver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.driver.model.Cab;

@Repository
public interface CabRepository extends JpaRepository<Cab, Integer> {

//    @Modifying
//    @Query("delete from cab c where c.id=:cabId")
//    void deleteCab(int cabId);
}
