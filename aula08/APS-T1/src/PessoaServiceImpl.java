public class PessoaServiceImpl implements PessoaService {

    private final BancoDados bancoDados;
    private final SalarioService salarioService;
    private static int contadorID = 1;

    public PessoaServiceImpl(BancoDados bancoDados, SalarioService salarioService) {
        this.bancoDados = bancoDados;
        this.salarioService = salarioService;
    }

    @Override
    public void salvar(Pessoa pessoa) throws Exception {
        PessoaValidator.validar(pessoa);
        pessoa.setId(contadorID++);
        bancoDados.salvar(pessoa);
    }

    @Override
    public void remover(Integer id) throws Exception {
        bancoDados.remover(id);
    }

    @Override
    public Pessoa buscar(Integer id) {
        PessoaFisica p = new PessoaFisica();
        p.setId(id);
        return bancoDados.buscar(p);
    }

    @Override
    public String calcularSalario() {
        return salarioService.gerarRelatorioSalarios(bancoDados.buscar());
    }
}