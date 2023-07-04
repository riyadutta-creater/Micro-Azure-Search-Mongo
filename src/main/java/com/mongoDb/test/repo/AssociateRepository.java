package com.mongoDb.test.repo;

import com.mongoDb.test.entity.Associate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociateRepository extends MongoRepository<Associate, String> {
	

}
