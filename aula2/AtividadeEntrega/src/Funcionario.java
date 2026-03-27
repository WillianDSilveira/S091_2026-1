package aula2;

public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private String dataNascimento;
    private float salario;

    public Funcionario(String nome, int idade, String dataNascimento, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
                + ", salario=" + salario + "]";
    }

}