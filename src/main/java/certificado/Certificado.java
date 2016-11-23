package certificado;

import javax.persistence.Embeddable;

@Embeddable
public class Certificado {
	private String nivel;
	private String desempenho;
	private String tipo;
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getDesempenho() {
		return desempenho;
	}
	public void setDesempenho(String desempenho) {
		this.desempenho = desempenho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
