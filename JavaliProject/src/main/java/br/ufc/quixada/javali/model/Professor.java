package br.ufc.quixada.javali.model;

import javax.persistence.Entity;

@Entity(name="Professors")
public class Professor extends User{
	private int siape;
}
