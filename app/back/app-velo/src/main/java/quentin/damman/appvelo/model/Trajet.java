package quentin.damman.appvelo.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Trajet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	String nom;

	String depart;

	String arrive;

	int distance;

	Date temps;

}
