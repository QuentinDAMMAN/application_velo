package quentin.damman.appvelo.serviceimplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	public void create(Trajet trajet) {
		trajetRepository.save(trajet);    
	}

}
