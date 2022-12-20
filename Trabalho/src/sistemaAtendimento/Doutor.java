package sistemaAtendimento;

public class Doutor extends Cadastro{
    
    private String nomeDoutor;
    private String especialidade = "Médico veterinário";

    public void setNomeDoutor(String nomeDoutor) {
        this.nomeDoutor = nomeDoutor;
    }

    public String getNomeDoutor() {
            return nomeDoutor;
    }

    public String getEspecialidade() {
            return especialidade;
    }

    public void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
    }

    //Métodos da classe	
    public String consultarDoutor() {
        return nomeDoutor;
    }

    @Override
    public String toString() {
        return "Doutor{" + "nomeDoutor=" + nomeDoutor + ", especialidade=" + especialidade + '}';
    }
 
}