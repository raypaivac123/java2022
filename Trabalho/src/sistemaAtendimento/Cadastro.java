/*
Grupo 04 

Rayssa Paiva Carvalho - 26122448 

Victor Emanuel Fernandes Queiroz - 26443601 

Felipe Massashi Cabral Rodrigues Hashimoto - 27217931 

Elismar Silva dos Santos - 25894323 

Humberto Eduardo Ribeiro da Silva  - 26184672 

 * */


package sistemaAtendimento;

public class Cadastro extends Cliente {
    
    private String nomePet;
    private String especie;
    private float peso;

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
            return "Cadastro [nomePet=" + nomePet + ", especie=" + especie +  ", peso=" + peso + "]";
    }		


}