package com.boys.jake.service;

import com.boys.jake.dao.JakeRepositoryMongo;
import com.boys.jake.dao.JakeRepositorySQL;
import com.boys.jake.model.JakeMongo;
import com.boys.jake.model.JakeSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JakeService
{
    private JakeRepositoryMongo repositoryMongo;
    private JakeRepositorySQL repositorySQL;

    @Autowired
    public JakeService(JakeRepositoryMongo repositoryMongo, JakeRepositorySQL repositorySQL)
    {
        this.repositoryMongo = repositoryMongo;
        this.repositorySQL = repositorySQL;
    }

    public String saveMongo() {
        JakeMongo jakeMongo = new JakeMongo();
        jakeMongo.setName("Jake");
        jakeMongo.setAge(12);
        repositoryMongo.save(jakeMongo);
        return "The Boy!";
    }

    public String saveSQL() {
        JakeSQL jakeSQL = new JakeSQL();
        jakeSQL.setName("Jake");
        jakeSQL.setAge(12);
        repositorySQL.save(jakeSQL);
        return "The Boy!";
    }
}
