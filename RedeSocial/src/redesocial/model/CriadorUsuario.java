package redesocial.model;

public class CriadorUsuario {

    public static Usuario criarUsuario(String nome, int cpf, String cidade, String telefone) {
        return new Usuario(nome, cpf, cidade, telefone);
    }
}
