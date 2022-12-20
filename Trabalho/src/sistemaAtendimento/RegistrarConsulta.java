package sistemaAtendimento;

public class RegistrarConsulta extends Consulta {
	
	public String nomeDoutor;
	public String nomePet;
	public double precoconsulta;
	
	public String getNomeDoutor() {
		return nomeDoutor;
	}
	public void setNomeDoutor(String nomeDoutor) {
		this.nomeDoutor = nomeDoutor;
	}
	public String getNomePet() {
		return nomePet;
	}
	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}
	public double getPrecoconsulta() {
		return precoconsulta;
	}
	public void setPrecoconsulta(double precoconsulta) {
		this.precoconsulta = precoconsulta;
	}
	
	@Override
	public String toString() {
		return "Registrarconsulta [nomeDoutor=" + nomeDoutor + ", nomePet=" + nomePet + ", precoconsulta="
				+ precoconsulta + "]";
	}
	
	
	
}
