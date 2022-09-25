package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.DoctorEntity;
import com.example.Exception.DoctorExist;


@Service
public class DoctorImp implements DoctorService
{		
		@Autowired
		private com.example.Repository.DoctorRepository DoctorsRepository;
		
		@Override
		public String addDoctors(DoctorEntity Doctor) {
			DoctorEntity clearDoctorsData = DoctorsRepository.findByName(Doctor.getName());
			if (clearDoctorsData == null)
			{
				DoctorsRepository.save(Doctor);
				return "New Doctor Added to the Database";
				}
			else 
				throw new DoctorExist ("Doctor Data Already Existed in the Database");
		}

		@Override
		public DoctorEntity updateDoctor(DoctorEntity Doctor, int id)
		{
			java.util.Optional<DoctorEntity> ed = DoctorsRepository.findById(id);
			DoctorEntity eda = ed.get();
			eda.setName(Doctor.getName());
			eda.setSalary(Doctor.getSalary());
			eda.setSpecialist(Doctor.getSpecialist());
			DoctorsRepository.save(eda);
			return eda;}
		
		@Override
		public List<DoctorEntity> getDoctor()
		{
			return DoctorsRepository.findAllBySalary();
			}
		
	}

