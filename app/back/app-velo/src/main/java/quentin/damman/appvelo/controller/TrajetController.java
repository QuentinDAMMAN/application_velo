package quentin.damman.appvelo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import quentin.damman.appvelo.model.Trajet;
import quentin.damman.appvelo.serviceimplementation.TrajetServiceImplementation;

@RestController
public class TrajetController {

	@Autowired
	private TrajetServiceImplementation trajetService;

	@PostMapping("/trajets")
	public Trajet addTrajet(@RequestBody Trajet trajet) {
		return trajetService.create(trajet);
	}

	@GetMapping("/trajets")
	public List<Trajet> findAllTrajet() {
		return trajetService.getAll();
	}

	@GetMapping("/trajets/find/id/{id}")
	public Trajet findtrajetsById(@PathVariable int id) {
		return trajetService.getById(id);
	}

	@PutMapping("trajets")
	public Trajet updateTrajet(@RequestBody Trajet trajet) {
		return trajetService.update(trajet);
	}

	@DeleteMapping("trajets/delete/id/{id}")
	public String deleteTrajet(@PathVariable int id) {
		return trajetService.deleteById(id);
	}

}
