package com.ebit.myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.myproject.model.Student;
import com.ebit.myproject.repo.MyRepo;

@Service
public class MyService {

	@Autowired
	private MyRepo myRepo;

	public List<Student> getData() {
		return myRepo.findAll();
	}

	public Student enterdata(Student stu) {
		return myRepo.save(stu);
	}

	public Student addstudent(int id) {
		return myRepo.findStudentById(id);
	}

	public Student updateData(int id, Student stu) {
		Student data = myRepo.findStudentById(id);

		if (data != null) {
			data.setName(stu.getName());
			data.setAddress(stu.getAddress());
		}
		return myRepo.save(data);

	}

	public String deleteData(int id) {
		myRepo.deleteById(id);
		return "data deleted";

	}

	public String deleteAllData() {
		myRepo.deleteAll();
		return "data deleted";

	}

}
