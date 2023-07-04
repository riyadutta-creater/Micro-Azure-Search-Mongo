package com.mongoDb.test.service;

import com.mongoDb.test.entity.Associate;
import com.mongoDb.test.repo.AssociateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssociateService {

    @Autowired
    private AssociateRepository repo;

    public List<Associate> getAllAssociates() {
        List<Associate> associateList = repo.findAll();
        return associateList;
    }
}

