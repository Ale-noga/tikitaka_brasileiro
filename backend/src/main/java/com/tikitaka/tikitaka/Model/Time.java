package com.tikitaka.tikitaka.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "time")
public class Time {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3)
	private String nome;
	
	@NotNull
	@Size(min = 3)
	private String cidade;
	
	@Size(min = 3)
	private String estado;
	
	@ManyToOne
	@JsonIgnoreProperties("time")
	private Pais pais;
	
	private String titulos;
	
	private String jogadores;
	
	private String tecnico;
	
	@ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinTable(name = "times_usuarios", joinColumns = @JoinColumn(name = "time_id"), inverseJoinColumns = @JoinColumn(name = "usuario_id"))
	@JsonIgnoreProperties("time")
	private List<Usuario> usuario;
	
}
