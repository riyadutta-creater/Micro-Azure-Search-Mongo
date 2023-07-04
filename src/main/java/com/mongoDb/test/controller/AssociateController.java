package com.mongoDb.test.controller;

import com.mongoDb.test.entity.Associate;
import com.mongoDb.test.repo.AssociateRepository;
import com.mongoDb.test.service.AssociateService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/skill-tracker/api/v1/admin")
public class AssociateController {

    @Autowired
    private AssociateService service;
    
    @Autowired
    private AssociateRepository repo;

    @GetMapping("/getAllAssociates")
    public List<Associate> getAllAssociates(){
        List<Associate> associateList = service.getAllAssociates();
        //log.info("Sending data back to the Browser");
        return associateList;
    }
    
    @PostMapping("/addAssociates")
    public Associate save(@RequestBody Associate associate) {
    	return repo.save(associate);
    }
    

}
