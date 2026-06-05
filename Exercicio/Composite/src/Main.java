public class Main {
    public static void main(String[] args) throws Exception {
        ComponenteSistemaArquivos arquivo1 = new Arquivo("nota_fiscal.pdf", 1500);
        ComponenteSistemaArquivos arquivo2 = new Arquivo("foto_perfil.png", 50000);
        ComponenteSistemaArquivos arquivo3 = new Arquivo("planilha_financeira.xlsx", 12000);
        ComponenteSistemaArquivos arquivo4 = new Arquivo("config.json", 450);

        Diretorio root = new Diretorio("Raiz");
        Diretorio dirDocumentos = new Diretorio("Documentos");
        Diretorio dirImagens = new Diretorio("Imagens");
        Diretorio dirSubProjetos = new Diretorio("Projetos_Antigos");

        root.adicionar(arquivo4);
        root.adicionar(dirDocumentos);
        root.adicionar(dirImagens);

        dirDocumentos.adicionar(arquivo1);
        dirDocumentos.adicionar(dirSubProjetos);
        
        dirSubProjetos.adicionar(arquivo3);
        dirImagens.adicionar(arquivo2);

        System.out.println("### Estrutura do Sistema de Arquivos ###");
        root.listar("");
        
        System.out.println("\n### Cálculo de Tamanhos Totais ###");
        System.out.println("Tamanho de '" + dirSubProjetos.getClass().getSimpleName() + " " + dirSubProjetos.obterTamanhoBytes() + " bytes'");
        System.out.println("Tamanho total da Raiz: " + root.obterTamanhoBytes() + " bytes");
    
    }
}
