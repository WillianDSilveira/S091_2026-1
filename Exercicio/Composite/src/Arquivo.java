public class Arquivo implements ComponenteSistemaArquivos {
    private String nome;
    private long tamanhoBytes;

    public Arquivo(String nome, long tamanhoBytes) {
        this.nome = nome;
        this.tamanhoBytes = tamanhoBytes;
    }

    @Override
    public void listar(String indentacao) {
        System.out.println(indentacao + "- Arquivo: " + nome + " (" + tamanhoBytes + " bytes)");
    }

    @Override
    public long obterTamanhoBytes() {
        return tamanhoBytes;
    }
}