package com.BarberShopAPI.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String senha;
	private Integer nivelacesso;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Long id, String nome, String senha, Integer nivelacesso) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.nivelacesso = nivelacesso;
	}

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getNivelacesso() {
		return nivelacesso;
	}

	public void setNivelacesso(Integer nivelacesso) {
		this.nivelacesso = nivelacesso;
	}
	
	
	
	
	
}
