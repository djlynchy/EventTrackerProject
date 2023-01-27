package com.skilldistillery.eventtracker.services;

import java.util.List;

import com.skilldistillery.eventtracker.entities.Reload;

public interface ReloadService {
	
	List<Reload> findAll();

	Reload createReload(Reload reload);

	Reload findById(Integer id);
	
	boolean deleteReload(Integer id);
	
	Reload updateReload(Reload reload, Integer id);

	List<Reload> listAll();

	Reload updateReload(Reload reload, int id);

	Reload updateReload(Integer id, Reload reload);


	


}
