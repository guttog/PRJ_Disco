package br.com.discos.crt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.discos.mdl.Musica;

@RequestMapping("/music/")
@RestController
public class MusicasController {

	@GetMapping
	public String testEnd() {
		Musica m = new Musica();
		String titulo = "Rosenrot";
		m.setTitulo(titulo);
		
		return m.getTitulo();
	}
}
