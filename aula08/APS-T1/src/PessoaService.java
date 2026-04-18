public interface PessoaService {
    public void salvar(Pessoa p) throws Exception;

    public void remover(Integer id) throws Exception;

    public Pessoa buscar(Integer id);

    public String calcularSalario();
}