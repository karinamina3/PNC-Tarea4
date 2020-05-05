package com.uca.capas.modelo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.modelo.domain.Producto;

@Controller
public class Tarea4Controller {
	
	@RequestMapping("/producto")
	public ModelAndView index11() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("tareas/tarea4/index");
		return mav;
	}
	

	
	@RequestMapping("/procesarProd")
	public ModelAndView procesar2(@Valid @ModelAttribute Producto product, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView();
		
		if (result.hasErrors()) modelAndView.setViewName("tareas/tarea4/index");
		else {
			String mensaje = "Producto " + product.getNombre() +" guardado con éxito";
			modelAndView.addObject("mensaje", mensaje);
			modelAndView.setViewName("tareas/tarea4/resultado");
		}
		
		return modelAndView;
	}

}
