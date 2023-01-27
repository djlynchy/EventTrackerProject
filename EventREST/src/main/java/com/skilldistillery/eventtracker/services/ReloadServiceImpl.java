package com.skilldistillery.eventtracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.eventtracker.entities.Reload;
import com.skilldistillery.eventtracker.repositories.ReloadRepository;


@Service
public class ReloadServiceImpl implements ReloadService {


	@Autowired
	ReloadRepository repo;

	@Override
	public List<Reload> listAll() {
		return repo.findAll();
	}

	@Override
	public Reload createReload(Reload reload) {
		reload = repo.saveAndFlush(reload);
		return reload;
	}

	@Override
	public boolean deleteReload(Integer id) {
		boolean deleted = false;
		Optional<Reload> reload = repo.findById(id);
		if (reload != null) {
			repo.deleteById(id);
			deleted = true;
		}
		return deleted;
	}

	@Override
	public Reload updateReload(Integer id, Reload reload) {
		Optional<Reload> optReload = repo.findById(id);
		if (optReload.isPresent()) {
			reload.setId(id);
			repo.saveAndFlush(reload);
		}
		return reload;
	}

	@Override
	public Reload findById(Integer id) {
		Reload reload = null;
		Optional<Reload> findReload = repo.findById(id);
		if (findReload.isPresent()) {
			reload = findReload.get();
		}
		
		return reload;
	}

	@Override
	public List<Reload> findAll() {
		return repo.findAll();
	}

	@Override
	public Reload updateReload(Reload reload, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reload updateReload(Reload reload, int id) {
		// TODO Auto-generated method stub
		return null;
	}

 }
