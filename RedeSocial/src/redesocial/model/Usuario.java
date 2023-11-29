package redesocial.model;

public class Usuario {

    private String nome;
    private int cpf;
//    private String dataNascimento;
//    private String telefone;
//    private String interesse;

    public Usuario(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

}
