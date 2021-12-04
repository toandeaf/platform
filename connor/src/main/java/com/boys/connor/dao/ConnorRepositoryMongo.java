package com.boys.connor.dao;

import com.boys.connor.model.ConnorMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnorRepositoryMongo extends MongoRepository<ConnorMongo, String>
{
}
