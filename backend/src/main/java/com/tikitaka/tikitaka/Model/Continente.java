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
@Table(name = "continente")
public class Continente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 3)
	private String nome;

	@ManyToOne
	@JsonIgnoreProperties("continente")
	private Mundo mundo;

	@OneToMany(mappedBy = "continente", cascade = CascadeType.REFRESH)
	@JsonIgnoreProperties("continente")
	private List<Pais> pais;

	@OneToMany(mappedBy = "continente", cascade = CascadeType.REFRESH)
	@JsonIgnoreProperties("continente")
	private List<Selecao> selecao;

	@OneToMany(mappedBy = "continente", cascade = CascadeType.REFRESH)
	@JsonIgnoreProperties("continente")
	private List<Campeonato_Continental> campeonato;

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

	public Mundo getMundo() {
		return mundo;
	}

	public void setMundo(Mundo mundo) {
		this.mundo = mundo;
	}

	public List<Pais> getPais() {
		return pais;
	}

	public void setPais(List<Pais> pais) {
		this.pais = pais;
	}

	public List<Selecao> getSelecao() {
		return selecao;
	}

	public void setSelecao(List<Selecao> selecao) {
		this.selecao = selecao;
	}

	public List<Campeonato_Continental> getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(List<Campeonato_Continental> campeonato) {
		this.campeonato = campeonato;
	}

}
