package sistemaVendas;

public class RegistrarVenda extends Vendas {
    
	String produto;
	double preco;

	public String getProduto() {
		return produto;
	};

	public void setProduto(String produto) {
		this.produto = produto;
	};

	public double getPreco() {
		return preco;
	};

	public void setPreco(double preco) {
		this.preco = preco;
	};
	
    public void registrarVenda(String produto, double preco) {
		this.produto = "";
		this.preco = 0;
	};
	
	public String toString() {
		return "RegistrarVenda[ Produto : " + this.produto + "Preço : " + this.preco + "]";
	};
}
