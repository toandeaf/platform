package com.boys.mcnab.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("mcnab")
public class McNabMongo extends McNab
{
    @MongoId
    public String getId()
    {
        return this.id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Field("name")
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Field("age")
    public Integer getAge()
    {
        return this.age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }
}
