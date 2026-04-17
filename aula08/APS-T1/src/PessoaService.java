public interface PessoaService {
    void salva(Pessoa p) throws Exception;

    void remover(Integer id) throws Exception;

    Pessoa busca(Integer id);

    String calculaSalario();
}