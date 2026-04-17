import java.util.Scanner;

public class Main {
    private static PessoaService service;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTAO PESSOAL ===");
        inicializarSistema();
        executarMenu();
    }

    private static void inicializarSistema() {
        System.out.println("Selecione a forma de armazenamento:\n1. Lista\n2. Mapa");
        String escolha = scanner.nextLine();
        
        if ("2".equals(escolha)) {
            service = new PessoaServiceImpl(new BancoDadosMapa());
            System.out.println("Modo Mapa ativado.");
        } else {
            service = new PessoaServiceImpl(new BancoDadosLista());
            System.out.println("Modo Lista ativado.");
        }
    }

    private static void executarMenu() {
        while (true) {
            System.out.println("\n1. Cadastrar PF\n2. Cadastrar PJ\n3. Salarios\n4. Remover\n5. Sair");
            String opcao = scanner.nextLine();
            
            if ("5".equals(opcao)) break;

            try {
                processarOpcao(opcao);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private static void processarOpcao(String opcao) throws Exception {
        if (opcao.equals("1")) {
            cadastrarPF();
        } else if (opcao.equals("2")) {
            cadastrarPJ();
        } else if (opcao.equals("3")) {
            System.out.println(service.calculaSalario());
        } else if (opcao.equals("4")) {
            removerPessoa();
        } else {
            System.out.println("Opcao invalida");
        }
    }

    private static void cadastrarPF() throws Exception {
        PessoaFisica pf = new PessoaFisica();
        System.out.print("Nome: "); pf.setNome(scanner.nextLine());
        System.out.print("Endereco: "); pf.setEndereco(scanner.nextLine());
        System.out.print("CPF: "); pf.setCpf(scanner.nextLine());
        System.out.print("Salario: "); pf.setSalario(Float.parseFloat(scanner.nextLine()));
        service.salva(pf);
    }

    private static void cadastrarPJ() throws Exception {
        PessoaJuridica pj = new PessoaJuridica();
        System.out.print("Nome: "); pj.setNome(scanner.nextLine());
        System.out.print("Endereco: "); pj.setEndereco(scanner.nextLine());
        System.out.print("CNPJ: "); pj.setCnpj(scanner.nextLine());
        service.salva(pj);
    }

    private static void removerPessoa() throws Exception {
        System.out.print("ID para remover: ");
        int id = Integer.parseInt(scanner.nextLine());
        service.remover(id);
    }
}