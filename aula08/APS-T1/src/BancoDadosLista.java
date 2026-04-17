import java.util.*;

public class BancoDadosLista implements BancoDados {
    private List<Pessoa> lista = new ArrayList<>();

    @Override
    public void salvar(Pessoa p) {
        lista.add(p);
    }

    @Override
    public void remover(Integer id) {
        lista.removeIf(p -> p.getId().equals(id));
    }

    @Override
    public Pessoa buscar(Pessoa p) {
        return lista.stream().filter(x -> x.getId().equals(p.getId())).findFirst().orElse(null);
    }

    @Override
    public List<Pessoa> buscar() {
        return new ArrayList<>(lista);
    }
}