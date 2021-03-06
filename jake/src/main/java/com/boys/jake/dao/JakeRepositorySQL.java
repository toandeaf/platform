package com.boys.jake.dao;

import com.boys.jake.model.JakeSQL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JakeRepositorySQL extends JpaRepository<JakeSQL, String>
{
}
