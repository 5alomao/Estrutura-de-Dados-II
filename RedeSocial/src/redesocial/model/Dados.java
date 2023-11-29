package redesocial.model;

import java.util.HashMap;
import java.util.Map;

public class Dados {

    public static Map<Integer, Usuario> usuarios = new HashMap<>();

    public static void adicionarDado(Usuario objUsuario) {
        usuarios.put(objUsuario.getCpf(), objUsuario);
    }

    public static Usuario getUsuario(int cpf) {
        return usuarios.get(cpf);
    }
}
