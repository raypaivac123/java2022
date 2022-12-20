package sistemaVendas;

public class Vendas {
	
	String nomeProduto;
	double precoProduto;
	
	
	public String getNomeProduto() {
		return nomeProduto;
	};
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	};
	public double getPrecoProduto() {
		return precoProduto;
	};
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	};
	
    public void realizarVenda(String nomeProduto, double precoProduto) {
	  this.nomeProduto = "Vet vit C";
	  this.precoProduto = 50.00;
    	
 };
 public String toString() {
		return " Venda [ nomeProduto : " + this.nomeProduto + "Preço : " + this.precoProduto + "]";
	};
 
}