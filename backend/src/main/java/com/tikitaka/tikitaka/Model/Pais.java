package com.tikitaka.tikitaka.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "pais")
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 3)
	private String nome;

	@NotNull
	@Size(min = 3)
	private String bandeira;

	@ManyToOne
	@JsonIgnoreProperties("pais")
	private Continente continente;

	@OneToMany(mappedBy = "pais", cascade = CascadeType.REFRESH)
	@JsonIgnoreProperties("pais")
	private List<Campeonato_Nacional> campeonato;

	@OneToMany(mappedBy = "pais", cascade = CascadeType.REFRESH)
	@JsonIgnoreProperties("pais")
	private List<Time> time;

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

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public Continente getContinente() {
		return continente;
	}

	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	public List<Campeonato_Nacional> getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(List<Campeonato_Nacional> campeonato) {
		this.campeonato = campeonato;
	}

	public List<Time> getTime() {
		return time;
	}

	public void setTime(List<Time> time) {
		this.time = time;
	}

}
