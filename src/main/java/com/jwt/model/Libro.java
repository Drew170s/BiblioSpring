package com.jwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Libro")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_libro;
	@Column
	private String nome;
	@Column
	private String genere;
	@Column
	private int annopubblicazione;
	
	public Libro() {
	}
	
	public Libro(int id_libro, String nome, String genere, int annopubblicazione) {
		this.id_libro = id_libro;
		this.nome = nome;
		this.genere = genere;
		this.annopubblicazione = annopubblicazione;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getAnnopubblicazione() {
		return annopubblicazione;
	}

	public void setAnnopubblicazione(int annopubblicazione) {
		this.annopubblicazione = annopubblicazione;
	}

	@Override
	public String toString() {
		return "Libro [id_libro=" + id_libro + ", nome=" + nome + ", genere=" + genere + ", annopubblicazione="
				+ annopubblicazione + "]";
	}	
}
