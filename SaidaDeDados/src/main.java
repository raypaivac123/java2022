import java.util.Locale;

public class main {
	public static void main(String[] args) {
		
		double x = 10.3578;
		String nome = "Rayssa";
		int idade = 21;
		double renda = 1000.0;
		System.out.println("Olá mundo!"); //println quebra a linha, só print não quebra a linha.
		System.out.println("Bom dia!");
		System.out.println(x);
		System.out.printf("%.2f%n", x); //Para imprimir apenas 2 casas decimais (separado por virgula)
		Locale.setDefault(Locale.US); //Para separar por ponto
		System.out.printf("%.2f%n", x); //separado por ponto
		
		//Concatenação 
		System.out.println("resultado "+ x +" metros"); 
		System.out.printf("resulado = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}
} 
