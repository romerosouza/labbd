import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import simulado.Simulado;
import aluno.Aluno;


public class TesteDeCadastro {

	@Test
	public void test() {
		
		Date data = null;
		
		Simulado simulado = new Simulado();
		simulado.setData(data);
		/*simulado.setCertificado(certificado);
		simulado.setProfessor(professor);
		simulado.setQuestionario(questionario);*/
		
		Aluno aluno = new Aluno();
		aluno.setMatricula(123);
		aluno.setNome("Phulano de Tal");
		aluno.setLogin("phulanodetal");
		aluno.setSenha("123");
		aluno.setNota(10.0);
		aluno.setSimulado(simulado);
	}

}
