package com.boys.connor.service;

import com.boys.connor.dao.ConnorRepositoryMongo;
import com.boys.connor.dao.ConnorRepositorySQL;
import com.boys.connor.model.ConnorMongo;
import com.boys.connor.model.ConnorSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConnorService
{
    private ConnorRepositoryMongo repositoryMongo;
    private ConnorRepositorySQL repositorySQL;

    @Autowired
    public ConnorService(ConnorRepositoryMongo repositoryMongo, ConnorRepositorySQL repositorySQL)
    {
        this.repositoryMongo = repositoryMongo;
        this.repositorySQL = repositorySQL;
    }

    public String saveMongo() {
        ConnorMongo connorMongo = new ConnorMongo();
        connorMongo.setName("connor");
        connorMongo.setAge(12);
        repositoryMongo.save(connorMongo);
        return "The Boy!";
    }

    public String saveSQL() {
        ConnorSQL connorSQL = new ConnorSQL();
        connorSQL.setName("connor");
        connorSQL.setAge(12);
        repositorySQL.save(connorSQL);
        return "The Boy!";
    }
}
