package com.musicas.ctr;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musicas.mdl.Musica;
import com.musicas.svr.MusicaService;

@RestController
@RequestMapping("/msc/")
public class MusicaController {
	
	@Autowired
	MusicaService musicaService;
	
	@GetMapping("teste")
	public String testEndPoint() {
		return "Estou funcionando!";
	}
	
	@PostMapping("add-musica")
	public ResponseEntity<Musica> addMusica(@RequestBody Musica musica) {
		
		Musica msc = musicaService.createMusica(musica);
		return new ResponseEntity<>(msc,HttpStatus.CREATED);
	}
	
	@GetMapping("todas-musicas")
	public List<Musica> getAll(){
		List<Musica> lista_musica = musicaService.getAll();
		return lista_musica;
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteById(@PathVariable long id){
		Optional<Musica> musicaOp = musicaService.findMusicaById(id);
		
		
		if(musicaOp.isPresent()) {
			
		//Pegando o OBJ Musica
		Musica musica = musicaOp.get();
		String titulo = musica.getTitulo();
			
		musicaService.deleteMusicaById(id);
		
		return "Deletado a musica:" + titulo;
		
		}
		return "Musica não encontrada!";
		
	}
}
