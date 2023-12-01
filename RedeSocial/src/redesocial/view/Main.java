package redesocial.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import redesocial.model.CriadorUsuario;
import redesocial.model.Dados;
import redesocial.model.Grafo;
import redesocial.model.Usuario;

public class Main {

    public static void main(String[] args) {

        Grafo minhasConexoes = new Grafo();
        Map<Integer, Usuario> usuarios = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int option, cpfOrigem, cpfDestino;
        Usuario objUsuarioOrigem;
        Usuario objUsuarioDestino;
        //minhasConexoes.carregarGrafo();
        do {
            option = menuOptions();
            switch (option) {
                case 1:
                    System.out.println("*** Cadastrar Usuário ***");

                    System.out.println("Nome de Usuário:");
                    String nome = sc.nextLine();

                    System.out.println("CPF:");
                    int cpf = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Cidade:");
                    String cidade = sc.nextLine();

                    System.out.println("Telefone:");
                    String telefone = sc.nextLine();

                    Usuario objUsuario = CriadorUsuario.criarUsuario(nome, cpf, cidade, telefone);
                    Dados.adicionarDado(objUsuario);

                    minhasConexoes.adicionarUsuario(objUsuario);
                    break;
                case 2:
                    System.out.println("Conectar Usuários:");

                    System.out.println("CPF Usuario-Origem:");
                    cpfOrigem = sc.nextInt();
                    objUsuarioOrigem = Dados.getUsuario(cpfOrigem);

                    System.out.println("CPF Usuario-Destino:");
                    cpfDestino = sc.nextInt();
                    objUsuarioDestino = Dados.getUsuario(cpfDestino);

                    System.out.println("Peso:");
                    int peso = sc.nextInt();

                    minhasConexoes.adicionarConexao(objUsuarioOrigem, objUsuarioDestino, peso);
                    break;
                case 3:
                    System.out.println("Desconectar Usuários:");

                    System.out.println("CPF Usuario-Origem:");
                    cpfOrigem = sc.nextInt();
                    objUsuarioOrigem = Dados.getUsuario(cpfOrigem);

                    System.out.println("CPF Usuario-Destino:");
                    cpfDestino = sc.nextInt();
                    objUsuarioDestino = Dados.getUsuario(cpfDestino);

                    minhasConexoes.removerConexao(objUsuarioOrigem, objUsuarioDestino);
                    break;
                case 4:
                    minhasConexoes.imprimirGrafo();
                    break;
//                case 4:
//                    System.out.println("Vertices:");
//                    System.out.println("Origem:");
//                    origem = scanner.nextInt();
//                    System.out.println("Destino:");
//                    destino = scanner.nextInt();
//                    if (grafo.alcance(origem, destino)) {
//                        System.out.println("Existe caminho.");
//                    } else {
//                        System.out.println("Não existe caminho.");
//                    }
//                    break;
//                case 5:
//                    System.out.println("DFS:");
//                    System.out.println("Origem:");
//                    origem = scanner.nextInt();
//
//                    System.out.println(grafo.buscaProfundidade(origem));
//                    break;
//                case 0:
//                    System.out.println("Saindo");
//                    grafo.salvarGrafo();
//                    break;
            }
        } while (option != 0);
    }

    public static int menuOptions() {
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("1-Adicionar Usuário");
        System.out.println("2-Adicionar Conexão");
        System.out.println("3-Remover Conexões");
        System.out.println("4-Imprimir Conexões");
        System.out.println("0-Sair");
        option = sc.nextInt();
        return option;
    }
}
