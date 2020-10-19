package com.jwt.service;

import java.util.List;

import com.jwt.model.Libro;

public interface LibroService {
	List <Libro> findAll();
	void deleteLibro(Integer id_libro);
	Libro getLibro(int id_libro);
	Libro updateLibro(Libro libro);
	void aggiungiLibro(Libro libro);
}




