package com.musicas.ctr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musicas.mdl.Musica;

@RestController
@RequestMapping("/msc/")
public class MusicaController {
	
	@GetMapping("teste")
	public String testEndPoint() {
		return "Estou funcionando!";
	}
	
	@GetMapping("teste-model")
	public String testeModel(){
		Musica m = new Musica();
		m.setAutor("Sou o César autor disto aqui");
		return m.getAutor();
	}
	
	@PostMapping("add-teste")
	public String addMusica(@RequestBody Musica musica) {
		return null;
	}
}
