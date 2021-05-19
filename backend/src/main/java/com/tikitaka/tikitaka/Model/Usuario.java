package com.tikitaka.tikitaka.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 3)
	private String nome;

	@NotNull
	private String email;

	@Size(min = 5)
	private String biografia;

	@NotNull
	@Size(min = 1, max = 120)
	private Long idade;

	@NotNull
	private String senha;

	private String foto;

	@ManyToOne
	@JsonIgnoreProperties("usuario")
	private Nacionalidade nacionalidade;

	@ManyToMany(mappedBy = "usuario", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("usuario")
	private List<Time> time;

	@ManyToMany(mappedBy = "usuario", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("usuario")
	private List<Selecao> selecao;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public List<Time> getTime() {
		return time;
	}

	public void setTime(List<Time> time) {
		this.time = time;
	}

	public List<Selecao> getSelecao() {
		return selecao;
	}

	public void setSelecao(List<Selecao> selecao) {
		this.selecao = selecao;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

}
