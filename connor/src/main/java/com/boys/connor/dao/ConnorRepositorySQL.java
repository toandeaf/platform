package com.boys.connor.dao;

import com.boys.connor.model.Connor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnorRepositorySQL extends JpaRepository<Connor, String>
{
}
