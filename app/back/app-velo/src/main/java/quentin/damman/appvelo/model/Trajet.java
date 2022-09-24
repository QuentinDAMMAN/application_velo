package quentin.damman.appvelo.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Trajet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String nom;
	private String depart;
	private String arrive;
	private int distance;
	private Date temps;

}
