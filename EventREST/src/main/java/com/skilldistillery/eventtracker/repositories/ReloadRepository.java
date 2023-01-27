package com.skilldistillery.eventtracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.eventtracker.entities.Reload;

public interface ReloadRepository extends JpaRepository<Reload, Integer> {

	
}
