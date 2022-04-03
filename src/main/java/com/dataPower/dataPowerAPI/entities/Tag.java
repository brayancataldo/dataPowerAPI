package com.dataPower.dataPowerAPI.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tags")
public class Tag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "total_qtd_arquivos")
	private Integer totalQtdArquivos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getTotalQtdArquivos() {
		return totalQtdArquivos;
	}

	public void setTotalQtdArquivos(Integer totalQtdArquivos) {
		this.totalQtdArquivos = totalQtdArquivos;
	}

	public Integer getId() {
		return id;
	}
	
}
