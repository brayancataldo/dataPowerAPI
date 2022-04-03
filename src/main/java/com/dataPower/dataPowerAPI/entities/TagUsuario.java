package com.dataPower.dataPowerAPI.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="relacao_usuario_tag")
public class TagUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "rut_sequence" )
	@SequenceGenerator(name= "rut_sequence", sequenceName = "rut_sequence", initialValue = 1, allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Column(name = "usuario_id")
	private Integer usuarioId;
	
	@Column(name = "tag_id")
	private Integer tagId;

}
