package aluno;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import simulado.Simulado;

@Entity
@Table(name="alunos")
public class Aluno {
	private int matricula;
	private String nome;
	private String login;
	private String senha;
	private Double nota;
	
	@Embedded
	private Simulado simulado;
	
	public Aluno() {
		super();
	}
	public Aluno(int matricula, String nome, String login, String senha,
			Double nota, Simulado simulado) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.nota = nota;
		this.simulado = simulado;
	}
	@Id
	@Column(name="matricula_aluno")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public Simulado getSimulado() {
		return simulado;
	}
	public void setSimulado(Simulado simulado) {
		this.simulado = simulado;
	}
	
}
