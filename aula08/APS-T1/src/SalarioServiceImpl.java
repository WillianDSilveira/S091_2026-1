import java.util.List;

public class SalarioServiceImpl implements SalarioService {

    private final CalculadoraSalarioPessoaFisica calculadoraPF = new CalculadoraSalarioPessoaFisica();

    @Override
    public String gerarRelatorioSalarios(List<Pessoa> pessoas) {
        StringBuilder relatorio = new StringBuilder("--- Relatorio de Salarios ---\n");
        
        for (Pessoa p : pessoas) {
            Float valorBase = p.getValorParaRelatorio();
            
            if (valorBase != null) {
                // Usa a calculadora independente injetada ou instanciada
                float salarioComBonus = calculadoraPF.calcular(valorBase);
                
                relatorio.append(p.getNome())
                        .append(": R$ ")
                        .append(String.format("%.2f", salarioComBonus))
                        .append("\n");
            }
        }
        return relatorio.toString();
    }

    @Override
    public float calcularBonus(float salario) {
        return calculadoraPF.calcular(salario);
    }
}