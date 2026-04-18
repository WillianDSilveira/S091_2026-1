public class CalculadoraSalarioPessoaFisica implements CalculadoraSalario {
    @Override
    public float calcular(float salario) {
        if (salario < 1000) return salario * 1.02f;
        if (salario < 3000) return salario * 1.04f;
        return salario * 1.07f;
    }

}
