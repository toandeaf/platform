package com.boys.mcnab.service;

import com.boys.mcnab.dao.McNabRepositoryMongo;
import com.boys.mcnab.dao.McNabRepositorySQL;
import com.boys.mcnab.model.McNab;
import com.boys.mcnab.model.McNabMongo;
import com.boys.mcnab.model.McNabSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class McNabService
{
    private McNabRepositoryMongo repositoryMongo;
    private McNabRepositorySQL repositorySQL;

    @Autowired
    public McNabService(McNabRepositoryMongo repositoryMongo, McNabRepositorySQL repositorySQL)
    {
        this.repositoryMongo = repositoryMongo;
        this.repositorySQL = repositorySQL;
    }

    public String saveMongo() {
        McNabMongo mcNabMongo = new McNabMongo();
        mcNabMongo.setName("McNab");
        mcNabMongo.setAge(12);
        repositoryMongo.save(mcNabMongo);
        return "The Boy!";
    }

    public String saveSQL() {
        McNabSQL mcNabSQL = new McNabSQL();
        mcNabSQL.setName("McNab");
        mcNabSQL.setAge(12);
        repositorySQL.save(mcNabSQL);
        return "The Boy!";
    }
}
