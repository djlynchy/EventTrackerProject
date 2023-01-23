package com.skilldistillery.eventtracker.services;

import java.util.List;

public interface ReloadService {
	
	List<Reload> findAll();

	List<Reload> findById(Integer id);
	
	boolean deleteReload(Integer id);
	
	Reload updateReload(Integer id, Reload reload);


}
