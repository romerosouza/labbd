package simulado;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import certificado.Certificado;
import professor.Professor;
import questionario.Questionario;

@Embeddable
public class Simulado {
	
	private Date data;
	@Embedded
	private Professor professor;
	@Embedded
	private Certificado certificado;
	@Embedded
	private Questionario questionario;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Certificado getCertificado() {
		return certificado;
	}
	public void setCertificado(Certificado certificado) {
		this.certificado = certificado;
	}
	public Questionario getQuestionario() {
		return questionario;
	}
	public void setQuestionario(Questionario questionario) {
		this.questionario = questionario;
	}
	
}
