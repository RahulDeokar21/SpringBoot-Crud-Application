package com.CRUDOperation.services;

import java.util.List;

import com.CRUDOperation.entities.Student;

public interface StudentService
{

	Student createOneStudent(Student student);

	List<Student> getAllRecords();

	Student updateRecods(long id, Student student);

	void deleteRecords(long id);
	

}
