package aula2;

public class CalculadoraPag {

    private float resultado;

    public CalculadoraPag(Funcionario funcionario) {

        if (!validaFuncionario(funcionario)) {
            throw new IllegalArgumentException("Erro na validação do funcionário");
        }

        this.resultado = calcularSalario(funcionario);
    }

    private boolean validaFuncionario(Funcionario f) {
        return f.getNome() != null && !f.getNome().isEmpty() && f.getIdade() > 0;
    }

    private float calcularSalario(Funcionario f) {

        float salario = f.getSalario();

        if (salario <= 1000) {
            return salario + (salario * 0.1f);
        } else {
            return salario + (salario * 0.2f);
        }
    }

    public float retornaCalculoFuncionario() {
        return resultado;
    }
}