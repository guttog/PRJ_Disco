package com.musicas.svr;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musicas.mdl.Musica;
import com.musicas.rep.MusicaRepository;

@Service
public class MusicaService {
	
	@Autowired
	MusicaRepository musicaRepository;
	
	public List<Musica> getAll(){
		return musicaRepository.findAll();	
		}

	public Musica createMusica(Musica musica) {
	
		Musica msc_create = musicaRepository.save(musica);
		return msc_create;
	}
	
	public void deleteMusica(Long id) {
		musicaRepository.deleteById(id);
	}
	
	public Optional<Musica> getById(long id) {
		return musicaRepository.findById(id);
	}
	
	public Musica save(Musica musica) {
		return musicaRepository.save(musica);
	}
	
	public List<Musica> getAllCurtidas(){
		return musicaRepository.findByCurtidaTrue();
	}
}
