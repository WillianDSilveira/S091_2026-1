public class PessoaServiceImpl implements PessoaService {

    private final BancoDados bancoDados;
    private static int contadorID = 1;

    public PessoaServiceImpl(BancoDados bancoDados) {
        this.bancoDados = bancoDados;
    }

    @Override
    public void salva(Pessoa pessoa) throws Exception {
        validarCamposObrigatorios(pessoa);

        if (pessoa instanceof PessoaFisica) {
            validarSalario((PessoaFisica) pessoa);
        }

        pessoa.setId(contadorID++);
        bancoDados.salvar(pessoa);
    }

    private void validarCamposObrigatorios(Pessoa p) {
        if (p == null) throw new IllegalArgumentException("Dados invalidos");
        if (estaVazio(p.getNome())) throw new IllegalArgumentException("Nome obrigatorio");
        if (estaVazio(p.getEndereco())) throw new IllegalArgumentException("Endereco obrigatorio");
    }

    private boolean estaVazio(String s) {
        return s == null || s.trim().isEmpty();
    }

    private void validarSalario(PessoaFisica pf) {
        if (pf.getSalario() == null || pf.getSalario() < 0) {
            throw new IllegalArgumentException("Salario invalido");
        }
    }

    @Override
    public void remover(Integer id) throws Exception {
        bancoDados.remover(id);
    }

    @Override
    public Pessoa busca(Integer id) {
        PessoaFisica p = new PessoaFisica();
        p.setId(id);
        return bancoDados.buscar(p);
    }

    @Override
    public String calculaSalario() {
        StringBuilder relatorio = new StringBuilder("--- Relatorio de Salarios ---\n");
        for (Pessoa p : bancoDados.buscar()) {
            if (p instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) p;
                float salarioComBonus = calcularBonus(pf.getSalario());
                relatorio.append(pf.getNome())
                        .append(": R$ ")
                        .append(String.format("%.2f", salarioComBonus))
                        .append("\n");
            }
        }
        return relatorio.toString();
    }

    private float calcularBonus(float salario) {
        if (salario < 1000) return salario * 1.02f;
        if (salario < 3000) return salario * 1.04f;
        return salario * 1.07f;
    }
}