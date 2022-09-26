package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "ALUNO")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "IDALUNO")
	private Long idAluno;
	
	@Column (name = "NOME_ALUNO")
	private String nome;
	
	@Column (name = "CELULAR_ALUNO")
	private String celular;
	
	@Column (name = "CPF_ALUNO")
	private String cpf;
	
	@ManyToOne
	@JoinColumn (name = "ID_CURSO")
	private Curso idCurso;
}
