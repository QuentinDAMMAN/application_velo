package quentin.damman.appvelo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import quentin.damman.appvelo.exception.TrajetNotFoundException;
import quentin.damman.appvelo.model.Trajet;
import quentin.damman.appvelo.serviceimplementation.TrajetServiceImplementation;

@RestController
public class TrajetController {

	@Autowired
	private TrajetServiceImplementation trajetService;

	@RequestMapping(value = "/trajets", method = RequestMethod.GET)
	public List<Trajet> getAllTrajets() {
		return trajetService.getAll();
	}

	@RequestMapping(value = "/trajets", method = RequestMethod.POST)
	public void addUser(@RequestBody Trajet trajet) {
		trajetService.create(trajet);
	}

}
