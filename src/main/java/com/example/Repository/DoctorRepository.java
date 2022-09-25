package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.DoctorEntity;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer>{

	public DoctorEntity findByName(String name);

	public List<DoctorEntity> findAllBySalary();

}
