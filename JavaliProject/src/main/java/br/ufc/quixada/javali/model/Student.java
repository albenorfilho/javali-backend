package br.ufc.quixada.javali.model;

import javax.persistence.Entity;

@Entity(name="Students")
public class Student extends User {
	private int matricula;
}
