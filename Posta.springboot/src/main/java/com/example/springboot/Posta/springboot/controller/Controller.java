package com.example.springboot.Posta.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.springboot.Posta.springboot.model.*;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/index")
	public ModelAndView getIndex() {
		Cliente cliente=new Cliente();
		Coda coda=new Coda();
		coda.aggiungiCliente(cliente);
		coda.totaleCoda();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index"); 
		modelAndView.addObject("cliente",cliente);
		modelAndView.addObject("coda", coda);
		
		return modelAndView;
	}
	@GetMapping("/coda1")
	public ModelAndView getCoda1() {
		Cliente cliente=new Cliente();
		Coda coda=new Coda();
		
		coda.aggiungiCliente(cliente);
		coda.totaleCoda();

		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("coda1"); 
		modelAndView.addObject("cliente",cliente);
		modelAndView.addObject("coda", coda);

		
		return modelAndView;
	}
	@GetMapping("/coda2")
	public ModelAndView getCoda2() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("coda2");
		
		return modelAndView;
	}
	@GetMapping("/coda3")
	public ModelAndView getCoda3() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("coda3"); 
		
		return modelAndView;
	}
	@GetMapping("/coda4")
	public ModelAndView getCoda4() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("coda4");
		
		return modelAndView;
	}

}
