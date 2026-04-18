public class CalculadoraSalarioPessoaJuridica implements CalculadoraSalario {
    @Override
    public float calcular(float valorNota) {
        return valorNota * 0.95f;
    }
}