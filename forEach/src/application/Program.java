package application;

public class Program {
	public static void main(String[] args) {
		String[] vect = new String []  {"Maria", "Bob", "Alex"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("----------------------");
		//Laço for each
		for (String obj: vect) { //1 tipo - String; 2 apelido - obj; 3 coleção - vect;
			System.out.println(obj);
		}
		
	}
}
