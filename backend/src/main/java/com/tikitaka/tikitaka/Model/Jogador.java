package com.tikitaka.tikitaka.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "jogador")
public class Jogador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3)
	private String nome;
	
	@NotNull
	@Size(min = 1, max = 120)
	private Long idade;
	
	@Size(min = 3)	
	private String historico;	


	private Time time;
	
	private Pais pais;

}
