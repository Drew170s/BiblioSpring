package com.jwt.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.jwt.model.Libro;

@Repository
public class LibroDAO implements LibroRepository {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Libro> findAll() {
		 return sessionFactory.getCurrentSession().createQuery("from Libro").list();
    }
	
	@Override
    public void deleteLibro(Integer id_libro) {
        Libro libro = (Libro) sessionFactory.getCurrentSession().load(
                Libro.class, id_libro);
        if (null != libro) {
            this.sessionFactory.getCurrentSession().delete(libro);
        }
	}	
	@Override
    public Libro getLibro(int id_libro) {
            return (Libro) sessionFactory.getCurrentSession().get(Libro.class, id_libro);
	}   
    @Override
    public Libro updateLibro(Libro libro) {
        sessionFactory.getCurrentSession().update(libro);
        return libro;
    }
    @Override
    public void aggiungiLibro(Libro libro) {
    	sessionFactory.getCurrentSession().saveOrUpdate(libro);
    }
}
