package com.jwt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.model.Libro;
import com.jwt.repository.LibroDAO;

@Service
@Transactional
public class LibroServiceImpl implements LibroService {
	@Autowired
	private LibroDAO libroDAO;
	
	@Override
	@Transactional
	public List <Libro> findAll(){
		return libroDAO.findAll();
	}
	
	@Override
	@Transactional
	public void deleteLibro(Integer id_libro) {
		libroDAO.deleteLibro(id_libro);
	}
	
	@Override
	@Transactional
	public Libro getLibro(int id_libro) {
		return libroDAO.getLibro(id_libro);
	}
	
	@Override
	@Transactional
	public Libro updateLibro(Libro libro) {
		return libroDAO.updateLibro(libro);
	}
	
	@Override
	@Transactional
	public void aggiungiLibro(Libro libro) {
		libroDAO.aggiungiLibro(libro);
	}
}
