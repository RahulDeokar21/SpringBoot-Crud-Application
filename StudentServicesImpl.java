package com.CRUDOperation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUDOperation.entities.Student;
import com.CRUDOperation.repository.StudentRepository;
@Service
public class StudentServicesImpl implements StudentService
{

	@Autowired
	private StudentRepository repository;
	
	
	@Override
	public Student createOneStudent(Student student)
	{
		
		return repository.save(student);
	}


	@Override
	public List<Student> getAllRecords() 
	{
		
		return repository.findAll();
	}


	@Override
	public Student updateRecods(long id, Student student)
	{
		Student student1=repository.findById(id).get();
		student1.setFirstName(student.getFirstName());
		student1.setLastName(student.getLastName());
		student1.setEmail(student.getEmail());
		student1.setMobile(student.getMobile());
		
		
		return repository.save(student1);
	}


	@Override
	public void deleteRecords(long id) 
	{
		repository.deleteById(id);
		
	}
	
	

}
