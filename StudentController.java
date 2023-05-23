package com.CRUDOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUDOperation.entities.Student;
import com.CRUDOperation.services.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	@PostMapping("/posts")
	public Student saveOneStudent(@RequestBody Student student)
	{
		Student student2 = service.createOneStudent(student);
		
		return student2;
	}
	
	
	@GetMapping("/gets")
	public List<Student> getAllStudent()
	{
		List<Student> allRecords = service.getAllRecords();
		
		return allRecords;
	}
	
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable("id")long id,
			                      @RequestBody Student student)
	{
		Student recods = service.updateRecods(id,student);
		
		return recods;
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id")long id)
	{
		service.deleteRecords(id);
		
		return "deleted successfully...!!";
	}

}
