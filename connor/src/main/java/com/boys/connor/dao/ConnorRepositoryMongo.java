package com.boys.connor.dao;

import com.boys.connor.model.Connor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnorRepositoryMongo extends MongoRepository<Connor, String>
{
}
