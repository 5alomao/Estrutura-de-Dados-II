package redesocial.model;

public class Caminho {

    Usuario objUsuario;
    int peso;

    public Caminho(Usuario objUsuario, int peso) {
        this.objUsuario = objUsuario;
        this.peso = peso;
    }

    public Usuario getObjUsuario() {
        return objUsuario;
    }

    public int getPeso() {
        return peso;
    }
    
}
