package com.ebit.project.homecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.project.homeservice.MyService;
import com.ebit.project.model.Employee;

@RestController
@RequestMapping("/api")
public class MyController {

	@Autowired
	private MyService service;
	
	@GetMapping("/employee")
    public List<Employee> getEmployees(){
        return service.getEmployees();
    }
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
    @GetMapping(value = "/pagingAndShortingEmployees/{pageNumber}/{pageSize}")
    public Page<Employee> employeePagination(@PathVariable Integer pageNumber, @PathVariable Integer pageSize){

        return service.getEmployeePagination(pageNumber,pageSize, null);
    }

    @DeleteMapping("/employee")
    public String deleteData() {
    	service.deleteData();
    	return "data deleted";
    }
}
