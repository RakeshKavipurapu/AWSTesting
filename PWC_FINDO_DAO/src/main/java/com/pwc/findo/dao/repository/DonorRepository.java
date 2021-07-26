package com.pwc.findo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pwc.findo.dao.entities.Donor;
@Repository
public interface DonorRepository extends JpaRepository<Donor,Integer> {

}
