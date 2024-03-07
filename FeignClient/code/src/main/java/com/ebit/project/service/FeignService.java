package com.ebit.project.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient( value = "FeignDemo", url = "http://localhost:3008")
public interface FeignService {

	
    @GetMapping("/a")
    String getUserA();

    @GetMapping("/b")
    String getUserB();

    @GetMapping("/c")
    String getUserC();
	
}
