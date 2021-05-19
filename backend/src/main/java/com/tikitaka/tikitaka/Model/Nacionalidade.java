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
@Table(name = "nacionalidade")
public class Nacionalidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 3)
	private String pais;

	@NotNull
	@Size(min = 3)
	private String bandeira;

	@OneToMany(mappedBy = "nacionalidade", cascade = CascadeType.REFRESH)
	@JsonIgnoreProperties("nacionalidade")
	private List<Usuario> usuario;

	@OneToMany(mappedBy = "nacionalidade", cascade = CascadeType.REFRESH)
	@JsonIgnoreProperties("nacionalidade")
	private List<Jogador> jogador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public List<Jogador> getJogador() {
		return jogador;
	}

	public void setJogador(List<Jogador> jogador) {
		this.jogador = jogador;
	}

}
