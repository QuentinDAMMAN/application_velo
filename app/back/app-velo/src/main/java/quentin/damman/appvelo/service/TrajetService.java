package quentin.damman.appvelo.service;

import java.util.List;

import quentin.damman.appvelo.model.Trajet;

public interface TrajetService {

	void create(Trajet trajet);

	List<Trajet> getAll();

}
