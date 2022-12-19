package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product () {   //contrutor padrão
		
	}
	public Product (String name, double price, int quantity) { //construtor
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product (String name, double price) { //construtor de sobrecarga
		this.name = name;
		this.price = price;
		//this.quantity = 0; //linha opcional pois obrigatoriamente ja vai começar com 0
		//quantity = 0; // palavra this tb é opcional.
	}
	
	//get e set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return name;
	}
	public void setName(double price) {
		this.price = price;
	}
	public int getQuantity() { //pela regra de negocio, só pode ser alterada pela entrada e saida de produtos, não é um valor maleável  
		return quantity;
	}
	
	//metodos
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
