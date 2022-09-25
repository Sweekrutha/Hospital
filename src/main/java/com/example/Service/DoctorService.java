package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.DoctorEntity;
import com.example.Exception.DoctorExist;

@Service
public interface DoctorService {
	
		
		public String addDoctors(DoctorEntity Doctor) throws DoctorExist;
		
		public List<DoctorEntity> getDoctor();
		
		public DoctorEntity updateDoctor(DoctorEntity Doctor, int id) ;

	}

