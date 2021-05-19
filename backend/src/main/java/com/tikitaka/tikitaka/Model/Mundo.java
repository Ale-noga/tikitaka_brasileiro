package com.tikitaka.tikitaka.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "mundo")
public class Mundo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 3)
	private String nome;

	@OneToMany(mappedBy = "mundo", cascade = CascadeType.REFRESH)
	@JsonIgnoreProperties("mundo")
	private List<Continente> continente;

	@OneToMany(mappedBy = "mundo", cascade = CascadeType.REFRESH)
	@JsonIgnoreProperties("mundo")
	private List<Campeonato_Mundial> campeonato;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Continente> getContinente() {
		return continente;
	}

	public void setContinente(List<Continente> continente) {
		this.continente = continente;
	}

	public List<Campeonato_Mundial> getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(List<Campeonato_Mundial> campeonato) {
		this.campeonato = campeonato;
	}

}
