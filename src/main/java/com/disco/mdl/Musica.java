package com.disco.mdl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Musica {
	
	@Id
	private Long id;
	
	private String titulo;
	private String album;
	private String autor;
	private int ano;
	private String genero;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
