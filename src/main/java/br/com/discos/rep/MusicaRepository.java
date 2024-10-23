package br.com.discos.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.discos.mdl.Musica;

@Repository
public interface MusicaRepository extends JpaRepository<Musica ,Long> {
	
}
