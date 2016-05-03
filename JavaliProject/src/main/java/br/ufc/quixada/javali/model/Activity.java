package br.ufc.quixada.javali.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="Activities")
public class Activity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id;
	private String name;
	private String description;
}
