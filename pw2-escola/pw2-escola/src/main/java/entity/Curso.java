package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import enums.ModalidadeCursoEnum;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table (name = "CURSO")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "IDCURSO")
	private Long idCurso;
	
	@Column (name = "NOME_CURSO")
	private String nameCurso;
	
	@Column (name = "MODALIDADE")
	private ModalidadeCursoEnum modalidade;
	
	@Column (name = "CARGA_HORARIA")
	private int cargaHoraria;
}
