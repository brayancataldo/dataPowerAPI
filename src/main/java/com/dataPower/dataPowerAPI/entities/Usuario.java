package com.dataPower.dataPowerAPI.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuario_id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "nome_usuario")
	private String nomeUsuario;

	@Column(name = "senha")
	private String senha;

	
	@Column(name = "email")
	private String email;

	@Column(name = "foto")
	private String foto;

	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@Column(name = "bio")
	private String bio;
	
	@Column(name = "seguidores")
	private Integer seguidores;
	
	@Column(name = "seguindo")
	private Integer seguindo;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "latitude")
	private String latitude;
	
	@Column(name = "longitude")
	private String longitude;

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Integer getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(Integer seguidores) {
		this.seguidores = seguidores;
	}

	public Integer getSeguindo() {
		return seguindo;
	}

	public void setSeguindo(Integer seguindo) {
		this.seguindo = seguindo;
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade (String cidade) {
		this.cidade = cidade;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
