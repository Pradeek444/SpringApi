package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo stu;
	
	public Student saveDetails(Student s) {
		return stu.save(s);
	}
	public List<Student> getAllDetails()
	{
		return stu.findAll();
	}
	public boolean deleteStudentById(int id) {
		try {
			stu.deleteById(id);
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public Student updateStudentById(int id,Student s) {
		Student ss=stu.findById(id).orElse(null);
		
		ss.setId(s.getId());
		ss.setName(s.getName());
		ss.setDept(s.getDept());
		return stu.save(ss);
		
		
	}
	
}
