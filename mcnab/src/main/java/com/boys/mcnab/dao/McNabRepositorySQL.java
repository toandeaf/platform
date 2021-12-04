package com.boys.mcnab.dao;

import com.boys.mcnab.model.McNab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface McNabRepositorySQL extends JpaRepository<McNab, String>
{
}
