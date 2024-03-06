package com.ebit.project.homeservice;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebit.project.homerepo.MyRepo;
import com.ebit.project.model.Employee;

@Service
public class MyService {
	
	@Autowired
	private MyRepo repo;


	public List<Employee> getEmployees() {
		return repo.findAll();
	}
	
	public Page<Employee> getEmployeePagination(Integer pageNumber, Integer pageSize, String sortProperty) {
        Pageable pageable = null;
        if(null!=sortProperty){
            pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC,sortProperty);
        }else {
            pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC,"firstName");
        }
        return repo.findAll(pageable);


}

	public Employee addEmployee(Employee emp) {
		if (emp == null) {
            throw new IllegalArgumentException("Employee cannot be null.");
        }
		return repo.save(emp);
	}

	public void deleteData() {
		repo.deleteAll();;
		
	}

}
