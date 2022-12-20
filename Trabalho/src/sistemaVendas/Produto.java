package sistemaVendas;

public class Produto{
	
	
	public double preço;
	public String nome;
	
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		return "Produto [preço=" + preço + ", nome=" + nome + "]";
	}
	
}