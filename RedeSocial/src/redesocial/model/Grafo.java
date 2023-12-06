package redesocial.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Grafo {

    private Map<Integer, LinkedList<Caminho>> minhasConexoes;

    public Grafo() {
        this.minhasConexoes = new HashMap<>();
    }

    public void adicionarUsuario(Usuario objUsuario) {
        if (!minhasConexoes.containsKey(objUsuario.getCpf())) {
            minhasConexoes.put(objUsuario.getCpf(), new LinkedList<>());
            Dados.adicionarDado(objUsuario);
        }
    }

    public void adicionarConexao(Usuario objUsuarioOrigem, Usuario objUsuarioDestino, int peso) {

        if (!minhasConexoes.containsKey(objUsuarioOrigem.getCpf()) || !minhasConexoes.containsKey(objUsuarioDestino.getCpf())) {
            throw new IllegalArgumentException("Os Usuários de origem e destino devem existir no Grafo.");
        }

        minhasConexoes.get(objUsuarioOrigem.getCpf()).add(new Caminho(objUsuarioDestino, peso));
        minhasConexoes.get(objUsuarioDestino.getCpf()).add(new Caminho(objUsuarioOrigem, peso));
    }

    public void removerConexao(Usuario objUsuarioOrigem, Usuario objUsuarioDestino) {
        if (!minhasConexoes.containsKey(objUsuarioOrigem.getCpf()) && !minhasConexoes.containsKey(objUsuarioDestino.getCpf())) {
            throw new IllegalArgumentException("Os Usuários de origem e destino devem existir no Grafo.");
        }

        LinkedList<Caminho> conexoesOrigem = minhasConexoes.get(objUsuarioOrigem.getCpf());
        LinkedList<Caminho> conexoesDestino = minhasConexoes.get(objUsuarioDestino.getCpf());

        conexoesOrigem.removeIf(caminho -> caminho.objUsuario.equals(objUsuarioDestino));
        conexoesDestino.removeIf(caminho -> caminho.objUsuario.equals(objUsuarioOrigem));
    }

    public void imprimirGrafo() {
        for (Map.Entry<Integer, LinkedList<Caminho>> entry : minhasConexoes.entrySet()) {
            int cpf = entry.getKey();

            Usuario objUsuario = Dados.getUsuario(cpf);

            System.out.println("Usuário: " + objUsuario.getNome());
            System.out.println("CPF: " + objUsuario.getCpf());
            System.out.println("Cidade: " + objUsuario.getCidade());
            System.out.println("Telefone: " + objUsuario.getTelefone());

            LinkedList<Caminho> conexoes = entry.getValue();

            System.out.print("Conexões: ");
            for (Caminho objAtual : conexoes) {
                System.out.print(objAtual.objUsuario.getNome() + ";");
            }
            System.out.println("\n--------------");
        }
    }

    public void verificarConexoes(int cpf) {
        LinkedList<Caminho> conexoes = minhasConexoes.get(cpf);

        System.out.print("Conexões: ");
        for (Caminho objAtual : conexoes) {
            System.out.print(objAtual.objUsuario.getNome() + ";");
        }
        System.out.println("\n");
    }

    public boolean alcance(int cpfOrigem, int cpfDestino) {
        ArrayList visitados = new ArrayList();
        return existeCaminho(cpfOrigem, cpfDestino, visitados);
    }

    private boolean existeCaminho(int cpfAtual, int cpfDestino, ArrayList visitados) {
        if (cpfAtual == cpfDestino) {

            System.out.println("Existe conexão através de " + visitados);
            return true;
        }
        visitados.add(cpfAtual);
        LinkedList<Caminho> adjacencias = minhasConexoes.get(cpfAtual);

        if (adjacencias != null) {
            for (Caminho adjacente : adjacencias) {
                if (!visitados.contains(adjacente.objUsuario.getCpf()) && existeCaminho(adjacente.objUsuario.getCpf(), cpfDestino, visitados)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void salvarGrafo() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("grafo2.txt"))) {
            for (Map.Entry<Integer, LinkedList<Caminho>> entry : minhasConexoes.entrySet()) {
                int cpf = entry.getKey();
                Usuario objUsuario = Dados.getUsuario(cpf);
                LinkedList<Caminho> conexoes = entry.getValue();

                for (Caminho objAtual : conexoes) {
                    // Utilize um formato que faça sentido para você
                    String peso = Integer.toString(objAtual.peso);
                    String linha = String.format("%s %s %s", objUsuario.toString(), objAtual.objUsuario.toString(), peso);
                    writer.println(linha);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void carregarGrafo() {
        try (Scanner sc = new Scanner(new File("grafo.txt"))) {
            while (sc.hasNext()) {
                String[] dados = sc.nextLine().split(";");
                int cpfOrigem = 0, cpfDestino = 0, peso = 0;

                if (!dados[3].isEmpty()) {
                    cpfOrigem = Integer.parseInt(dados[3]);
                }

                if (!dados[7].isEmpty()) {
                    cpfDestino = Integer.parseInt(dados[7]);
                }

                if (!dados[8].isEmpty()) {
                    peso = Integer.parseInt(dados[8]);
                }

                Usuario objUsuarioOrigem = new Usuario(dados[0], cpfOrigem, dados[1], dados[2]);
                Usuario objUsuarioDestino = new Usuario(dados[4], cpfDestino, dados[5], dados[6]);
                adicionarUsuario(objUsuarioOrigem);
                adicionarUsuario(objUsuarioDestino);
                adicionarConexao(objUsuarioOrigem, objUsuarioDestino, peso);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
