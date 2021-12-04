package com.boys.jake.dao;

import com.boys.jake.model.Jake;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JakeRepositoryMongo extends MongoRepository<Jake, String>
{
}
