package sistemaAtendimento;

public class Teste {
	  public static void main(String[] args) {
	       
	       Consulta teste1 = new Consulta();
	       
	       // declaração de valores para as variavéis
	       teste1.setNomeCliente("Felipe");
	       teste1.setCpf(764636f);
	       teste1.setNomePet("Wilson");
	       teste1.setNomeDoutor("Dorisgleisson");
	       teste1.setEspecie("Leao de asas brancas");
	       teste1.setPeso(15.8f);
	       
	       // testando os métodos da classe Consulta
	       teste1.cadastrarConsulta(teste1.getNomePet(), teste1.getNomeCliente(), teste1.getEspecie(), teste1.getPeso());
	       teste1.realizarConsulta(teste1.getNomePet(), teste1.getNomeDoutor());
	       
	    }
}
