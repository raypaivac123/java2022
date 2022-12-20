package sistemaAtendimento;

public abstract class Cliente {
	
    public String nomeCliente;
    public Float cpf;

    public String getNomeCliente() {
            return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
    }
    public Float getCpf() {
            return cpf;
    }
    public void setCpf(Float cpf) {
            this.cpf = cpf;
    }
    
    //Métodos da classe
    public String consultarNomeCliente() {		
            return this.nomeCliente;
    }

    public Float consultarCpfCliente() {		
            return this.cpf;
    }

    @Override
    public String toString() {
            return "Cliente [nome=" + nomeCliente + ", cpf=" + cpf + ", consultarNomeCliente()="
                            + consultarNomeCliente() + ", consultarCpfCliente()=" + consultarCpfCliente() + "]";
    }
	
}
