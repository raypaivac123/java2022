package sistemaAtendimento;

public class Consulta extends Doutor{
    
    public void cadastrarConsulta(String nomePet, String nomeDoutor, String esp, Float peso){
        
        System.out.println("----------- CADASTRO REALIZADO COM SUCESSO -----------\n");
        
        System.out.println("Nome do pet = " + nomePet + "\n" + "Nome do doutor/cliente = " 
                + nomeDoutor + "\n" + "especie = " + esp + "\n" + "Peso do animal = " + peso + "\n");
    }
    
    public void realizarConsulta(String nomePet, String nomeDoutor){
        
        System.out.println("-------------- DADOS DA CONSULTA ---------------\n");
        System.out.println("Nome do pet = " + nomePet + "\n" + "Nome do doutor = " 
                + nomeDoutor + "\n" + "Data da consulta = " + "12/05/2022\n");
    }
            
}
