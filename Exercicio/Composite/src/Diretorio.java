import java.util.ArrayList;
import java.util.List;

public class Diretorio implements ComponenteSistemaArquivos {
    private String nome;
    private List<ComponenteSistemaArquivos> filhos;

    public Diretorio(String nome) {
        this.nome = nome;
        this.filhos = new ArrayList<>();
    }

    public void adicionar(ComponenteSistemaArquivos componente) {
        filhos.add(componente);
    }

    public void remover(ComponenteSistemaArquivos componente) {
        filhos.remove(componente);
    }

    @Override
    public void listar(String indentacao) {
        System.out.println(indentacao + "+ Diretório: " + nome);
        for (ComponenteSistemaArquivos filho : filhos) {
            filho.listar(indentacao + "  ");
        }
    }

    @Override
    public long obterTamanhoBytes() {
        long tamanhoTotal = 0;
        for (ComponenteSistemaArquivos filho : filhos) {
            tamanhoTotal += filho.obterTamanhoBytes();
        }
        return tamanhoTotal;
    }
}