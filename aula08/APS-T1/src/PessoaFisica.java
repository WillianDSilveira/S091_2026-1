public class PessoaFisica extends Pessoa {
    private String cpf;
    private Float salario;

    @Override
    public Float getValorParaRelatorio() {
        return this.salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}