package quentin.damman.appvelo.service;

import java.util.List;

import quentin.damman.appvelo.model.Trajet;

public interface TrajetService {

	Trajet create(Trajet trajet);

	List<Trajet> getAll();

	Trajet getById(int id);

	String deleteById(int id);

	Trajet update(Trajet product);

}
