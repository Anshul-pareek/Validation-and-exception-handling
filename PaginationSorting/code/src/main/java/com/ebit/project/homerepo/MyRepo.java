package com.ebit.project.homerepo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebit.project.model.Employee;


@Repository
public interface MyRepo extends JpaRepository<Employee, Integer>{

	Page<Employee> findAll(Pageable pageable);


	

}
