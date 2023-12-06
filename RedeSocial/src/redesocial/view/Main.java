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
        int option, cpfOrigem, cpfDestino, cpf;
        Usuario objUsuarioOrigem;
        Usuario objUsuarioDestino;
        minhasConexoes.carregarGrafo();
        do {
            option = menuOptions();
            switch (option) {
                case 1:
                    System.out.println("*** Cadastrar Usuário ***");

                    System.out.println("Nome de Usuário:");
                    String nome = sc.nextLine();

                    System.out.println("CPF:");
                    cpf = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Cidade:");
                    String cidade = sc.nextLine();

                    System.out.println("Telefone:");
                    String telefone = sc.nextLine();

                    Usuario objUsuario = CriadorUsuario.criarUsuario(nome, cpf, cidade, telefone);

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
                    System.out.println("Digite o CPF para ver Conexões:");
                    cpf = sc.nextInt();
                    minhasConexoes.verificarConexoes(cpf);
                    break;
                case 5:
                    System.out.println("Digite os cpf de origem e destino:");
                    cpfOrigem = sc.nextInt();
                    cpfDestino = sc.nextInt();
                    minhasConexoes.alcance(cpfOrigem, cpfDestino);
                    break;
                case 6:
                    minhasConexoes.imprimirGrafo();
                    break;
                case 0:
                    System.out.println("Saindo");
                    minhasConexoes.salvarGrafo();
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        } while (option != 0);
    }

    public static int menuOptions() {
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("1-Adicionar Usuário");
        System.out.println("2-Adicionar Conexão");
        System.out.println("3-Remover Conexões");
        System.out.println("4-Verificar Conexões");
        System.out.println("5-Verificar Caminho");
        System.out.println("6-Imprimir Conexões");
        System.out.println("0-Sair");
        option = sc.nextInt();
        return option;
    }
}
