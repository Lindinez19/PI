package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventoController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	@RequestMapping(value = "/formulariook", method = RequestMethod.POST)
	public String salvar(String nome, String local, String data, String horario) {
		
		System.out.println("Nome:" + nome);
		System.out.println("data:" + data);
		System.out.println("local:" + local);
		System.out.println("horario:" + horario);
		return "formConcluido";
	}
}