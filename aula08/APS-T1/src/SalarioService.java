import java.util.List;

public interface SalarioService {
    String gerarRelatorioSalarios(List<Pessoa> pessoas);
    float calcularBonus(float salario);
}