package quentin.damman.appvelo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quentin.damman.appvelo.model.Trajet;

@Repository
public interface TrajetRepository extends CrudRepository<Trajet, String> {

}
