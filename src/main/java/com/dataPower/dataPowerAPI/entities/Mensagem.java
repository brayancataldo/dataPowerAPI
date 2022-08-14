package com.dataPower.dataPowerAPI.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="mensagem")
public class Mensagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mensagem_id")
	private Integer id;

	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "data_msg")
	private Date dataMensagem;
	
	@Column(name = "usuario_origem")
	private Integer usuarioOrigem;

	@Column(name = "usuario_destino")
	private Integer usuarioDestino;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataMensagem() {
		return dataMensagem;
	}

	public void setDataMensagem(Date dataMensagem) {
		this.dataMensagem = dataMensagem;
	}

	public Integer getUsuarioOrigem() {
		return usuarioOrigem;
	}

	public void setUsuarioOrigem(Integer usuarioOrigem) {
		this.usuarioOrigem = usuarioOrigem;
	}

	public Integer getUsuarioDestino() {
		return usuarioDestino;
	}

	public void setUsuarioDestino(Integer usuarioDestino) {
		this.usuarioDestino = usuarioDestino;
	}

	
	
	
	
}
