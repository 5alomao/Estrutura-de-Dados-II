package redesocial.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Grafo {

    private Map<Integer, LinkedList<Caminho>> minhasConexoes;

    public Grafo() {
        this.minhasConexoes = new HashMap<>();
    }

    public void adicionarUsuario(Usuario objUsuario) {
        if (!minhasConexoes.containsKey(objUsuario.getCpf())) {
            minhasConexoes.put(objUsuario.getCpf(), new LinkedList<>());
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

//        if (!minhasConexoes.containsKey(objUsuarioOrigem.getCpf()) || !minhasConexoes.containsKey(objUsuarioDestino.getCpf())) {
//            throw new IllegalArgumentException("Os Usuários de origem e destino devem existir no Grafo.");
//        }
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

}
