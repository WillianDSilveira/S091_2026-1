import java.util.*;

public interface BancoDados {
    public void salvar(Pessoa p);
    public void remover(Integer id);
    Pessoa buscar(Pessoa p);
    List<Pessoa> buscar();
}