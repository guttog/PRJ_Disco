package com.musicas.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicas.mdl.Musica;

@Repository
public interface MusicaRepository extends JpaRepository<Musica ,Long> {
	
}
