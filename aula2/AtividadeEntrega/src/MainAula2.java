package aula2;

public class MainAula2 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
                "Maria",
                30,
                "26/06/1990",
                500
        );

        CalculadoraPag calculadora = new CalculadoraPag(funcionario);

        float resultado = calculadora.retornaCalculoFuncionario();

        System.out.println("Salário final: " + resultado);
    }
}