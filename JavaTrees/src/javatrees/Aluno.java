package javatrees;

public class Aluno implements Comparable<Aluno> {
    private int matricula;
    private String nome;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    
    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Aluno outroAluno) {
        return Integer.compare(this.matricula, outroAluno.matricula);
    }
    
    @Override
    public String toString() {
        return "Matricula:"+this.matricula+" Nome:"+this.nome;
    }
    
}
