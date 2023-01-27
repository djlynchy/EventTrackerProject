package com.skilldistillery.eventtracker.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.eventtracker.entities.Reload;
import com.skilldistillery.eventtracker.services.ReloadService;

@RestController
@RequestMapping("api")
public class ReloadController {

	@GetMapping("ping")
	public String ping() {
		return "pong";
	}

		
		@Autowired
		private ReloadService svc;
		
		
		@GetMapping("reload/search")
		public List<Reload> listAll() {
			return (List<Reload>) svc.listAll();
		}


		@PostMapping("reload")
		public Reload createReload(@RequestBody Reload reload, HttpServletResponse resp, HttpServletRequest req) {
			reload = svc.createReload(reload);
				resp.setStatus(201);
				StringBuffer url = req.getRequestURL();
				url.append("/").append(reload.getId());
				String location = url.toString();
				resp.setHeader("Location", location);
				
				return reload;
		}

		@GetMapping("reload/{id}")
		public Reload getById(@PathVariable int id, HttpServletResponse resp) {
			Reload reload = svc.findById(id);
			if (reload == null) {
				resp.setStatus(204);
				
			}
				return svc.findById(id);
			}


		@DeleteMapping("reload/{id}")
		public void deleteReload(@PathVariable int id, HttpServletResponse resp) {
			try {
				if(svc.deleteReload(id)) {
					resp.setStatus(204);
				}else {
					resp.setStatus(404);
				}
			} catch (Exception e) {
				resp.setStatus(400);
				e.printStackTrace();
			}
		}

		@PutMapping("reload/{id}")
		public Reload updateReload(@RequestBody Reload reload, @PathVariable int id) {
			return svc.updateReload(reload, id);

}
}