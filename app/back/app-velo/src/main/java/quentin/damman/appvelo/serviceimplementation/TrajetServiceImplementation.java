package quentin.damman.appvelo.serviceimplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import quentin.damman.appvelo.model.Trajet;
import quentin.damman.appvelo.repository.TrajetRepository;
import quentin.damman.appvelo.service.TrajetService;

@Service
public class TrajetServiceImplementation implements TrajetService {

	@Autowired
	private TrajetRepository trajetRepository;

	public List<Trajet> getAll() {
		List<Trajet> listTrajet = new ArrayList<>();
		trajetRepository.findAll().forEach(listTrajet::add);
		return listTrajet;
	}

	public Trajet create(Trajet trajet) {
		return trajetRepository.save(trajet);
	}

	public Trajet getById(int id) {
		return trajetRepository.findById(id).orElse(null);
	}

//	public Trajet getByName(String nom) {
//		return trajetRepository.findByNom(nom).orElse(null);
//	}

	public String deleteById(int id) {
		try {
			trajetRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
		}
		return "trajet retiré !! " + id;
	}

	public Trajet update(Trajet trajet) {
		Trajet trajetExistant = trajetRepository.findById(trajet.getId()).orElse(null);

		trajetExistant.setNom(trajet.getNom());
		trajetExistant.setDepart(trajet.getDepart());
		trajetExistant.setArrive(trajet.getArrive());
		trajetExistant.setDistance(trajet.getDistance());
		trajetExistant.setTemps(trajet.getTemps());

		return trajetRepository.save(trajetExistant);
	}

}
