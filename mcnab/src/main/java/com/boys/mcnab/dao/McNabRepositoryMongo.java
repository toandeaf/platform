package com.boys.mcnab.dao;

import com.boys.mcnab.model.McNabMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface McNabRepositoryMongo extends MongoRepository<McNabMongo, String>
{
}
