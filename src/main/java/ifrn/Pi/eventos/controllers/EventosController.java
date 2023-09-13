package ifrn.Pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {

	@RequestMapping
	public String form() {
		return "formEvento";
	}
	
}
