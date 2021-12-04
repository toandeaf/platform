package com.boys.jake.dao;

import com.boys.jake.model.Jake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JakeRepositorySQL extends JpaRepository<Jake, String>
{
}
