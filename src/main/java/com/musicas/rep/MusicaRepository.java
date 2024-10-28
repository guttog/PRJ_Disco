package com.musicas.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicas.mdl.Musica;

@Repository
public interface MusicaRepository extends JpaRepository<Musica ,Long> {
	List<Musica> findByCurtidaTrue(); 
}
