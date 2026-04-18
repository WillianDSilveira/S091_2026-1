public class PessoaValidator {

    public static void validar(Pessoa pessoa) {
        validarCamposObrigatorios(pessoa);

        if (pessoa instanceof PessoaFisica) {
            validarSalario((PessoaFisica) pessoa);
        }
    }

    private static void validarCamposObrigatorios(Pessoa p) {
        if (p == null) throw new IllegalArgumentException("Dados invalidos");
        if (estaVazio(p.getNome())) throw new IllegalArgumentException("Nome obrigatorio");
        if (estaVazio(p.getEndereco())) throw new IllegalArgumentException("Endereco obrigatorio");
    }

    private static void validarSalario(PessoaFisica pf) {
        if (pf.getSalario() == null || pf.getSalario() < 0) {
            throw new IllegalArgumentException("Salario invalido");
        }
    }

    private static boolean estaVazio(String s) {
        return s == null || s.trim().isEmpty();
    }
}