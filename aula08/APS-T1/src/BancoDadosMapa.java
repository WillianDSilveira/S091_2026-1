import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BancoDadosMapa implements BancoDados {
    private Map<Integer, Pessoa> mapa = new HashMap<>();

    @Override
    public void salvar(Pessoa p) {
        mapa.put(p.getId(), p);
    }

    @Override
    public void remover(Integer id) {
        mapa.remove(id);
    }

    @Override
    public Pessoa buscar(Pessoa p) {
        return mapa.get(p.getId());
    }

    @Override
    public List<Pessoa> buscar() {
        return new ArrayList<>(mapa.values());
    }
}