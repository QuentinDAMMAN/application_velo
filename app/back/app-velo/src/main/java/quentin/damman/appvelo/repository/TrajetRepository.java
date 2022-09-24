package quentin.damman.appvelo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import quentin.damman.appvelo.model.Trajet;

@Repository
public interface TrajetRepository extends JpaRepository<Trajet,Integer> {

}
