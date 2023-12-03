package ifrn.Pi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.Pi.eventos.models.Evento;
import ifrn.Pi.eventos.repositoreis.EventoREpository;

@Controller
public class EventosController {

	
	@Autowired
	private EventoREpository er;
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "eventos/formEvento";
	}
	
	@PostMapping("/eventos")
	public String adicionar( Evento evento) {
		
		System.out.println(evento);
		er.save(evento);
		
		return "eventos/evento-adicionar";
	}
	
}
