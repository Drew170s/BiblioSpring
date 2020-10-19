package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Libro;
import com.jwt.service.LibroService;

@Controller
public class LibroController {
	
	public LibroController() {
		System.out.println("LibroController()");
	}
	@Autowired
	private LibroService libroservice;
	
	@RequestMapping(value = "/")
	public ModelAndView listaLibro (ModelAndView model) throws IOException {
		List<Libro> listaLibro = libroservice.findAll();
		model.addObject("listaLibro", listaLibro);
		model.setViewName("home");
		return model;
	}
	@RequestMapping(value = "/newLibro" , method = RequestMethod.GET)
	public ModelAndView newLibro(ModelAndView model) {
		Libro libro = new Libro();
		model.addObject("Libro", libro);
		model.setViewName("LibroForm");
		return model;
	}
	 @RequestMapping(value = "/saveLibro", method = RequestMethod.POST)
	    public ModelAndView saveLibro(@ModelAttribute Libro libro) {
	        if (libro.getId_libro() == 0) { 
	            libroservice.aggiungiLibro(libro);
	        } else {
	           libroservice.updateLibro(libro);
	        }
	        return new ModelAndView("redirect:/");
	    }
	 @RequestMapping(value = "/deleteLibro", method = RequestMethod.GET)
	    public ModelAndView deleteLibro(HttpServletRequest request) {
	        int id_libro = Integer.parseInt(request.getParameter("id"));
	        libroservice.deleteLibro(id_libro);
	        return new ModelAndView("redirect:/");
	    }
	
	 @RequestMapping(value = "/editLibro", method = RequestMethod.GET)
	    public ModelAndView editContact(HttpServletRequest request) {
	        int id_libro = Integer.parseInt(request.getParameter("id"));
	        Libro libro = libroservice.getLibro(id_libro);
	        ModelAndView model = new ModelAndView("LibroForm");
	        model.addObject("Libro", libro);
	 
	        return model;
	    }
}
