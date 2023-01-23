package com.skilldistillery.eventtracker.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.eventtracker.repositories.ReloadRepository;
import com.skilldistillery.eventtracker.services.ReloadService;

@RestController
@RequestMapping("api")
@CrossOrigin({"*","http:localhost:8085"})
public class ReloadController<Reload, repo> {

	@GetMapping("ping")
	public String ping() {
		return "pong";
	}
		
		@Autowired
		private ReloadService svc;
		@Autowired
		private ReloadRepository repo;
		
		@GetMapping("reload/search")
		public List<Reload> getAll() {
			return svc.findAll();
		}


		@PostMapping("reload")
		public Reload createReload(@RequestBody Reload reload, HttpServletResponse resp, HttpServletRequest req) {
			try {
				resp.setStatus(201);
				StringBuffer url = req.getRequestURL();
				url.append("/").append(reload.getId());
				resp.addHeader("Location", url.toString());
				return repo.saveAndFlush(reload);
			} catch (Exception e) {
				resp.setStatus(400);
				e.printStackTrace();
				return null;
			}
		}

		@GetMapping("reload/{id}")
		public Reload getById(@PathVariable int id, HttpServletResponse resp) {
			Optional<Reload> opt = repo.findById(id);
			if (opt.isPresent()) {
				Reload reload = opt.get();
				return reload;
			} else {
				return null;
			}
		}

		@DeleteMapping("reload/{id}")
		public void deleteReload(@PathVariable int id, HttpServletResponse resp) {
			try {
				Optional<Reload> opt = repo.findById(id);
				if (opt.isPresent()) {
					Reload reload = opt.get();
					repo.delete(reload);
					resp.setStatus(204);
				}
			} catch (Exception e) {
				resp.setStatus(404);
				e.printStackTrace();
			}
		}

		@PutMapping("reload/{id}")
		public Reload updateReload(@RequestBody Reload reload, @PathVariable int id, HttpServletResponse resp) {
			Reload reloadUpdate;
			try {
				System.out.println(reload);
				reloadUpdate = svc.updateReload(id, reload);
				if (reload == null) {
					resp.setStatus(404);
				}
			} catch (Exception e) {
				resp.setStatus(400);
				reloadUpdate = null;
				e.printStackTrace();
			}
			return reloadUpdate;
		}

}
