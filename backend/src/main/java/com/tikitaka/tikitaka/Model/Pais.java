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
@Table(name = "pais")
public class Pais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3)
	private String nome;
	
	private String continente;
	
	private String campeonatos;
	
	@OneToMany(mappedBy = "pais", cascade = CascadeType.REFRESH)
	@JsonIgnoreProperties("pais")
	private List<Time> time;

}
