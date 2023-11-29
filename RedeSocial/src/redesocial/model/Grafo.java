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
    }

    public void imprimirGrafo() {
        for (Map.Entry<Integer, LinkedList<Caminho>> entry : minhasConexoes.entrySet()) {
            int cpf = entry.getKey();
            Usuario objUsuario = Dados.getUsuario(cpf);
            LinkedList<Caminho> conexoes = entry.getValue();
            System.out.print(objUsuario.getNome() + " -> ");
            for (Caminho objAtual : conexoes) {
                System.out.print(objAtual.objUsuario.getNome()+ " ");
            }
            System.out.println();
        }
    }

}
