package javatrees;

public class BinarySearchTree<T extends Comparable<T>> {

    Node raiz = null;

    public void add(T novoDado) {
        Node<T> novoNo = new Node<T>(novoDado);
        raiz = inserir(raiz, novoNo);
    }

    private Node<T> inserir(Node<T> raiz, Node<T> novoNo) {
        if (raiz == null) {
            return novoNo;
        }

        if (novoNo.dado.compareTo(raiz.dado) > 0) {
            raiz.direita = inserir(raiz.direita, novoNo);
        } else {
            raiz.esquerda = inserir(raiz.esquerda, novoNo);
        }

        return raiz;
    }

    public void preOrder() {
        preOrder(raiz);
    }

    private void preOrder(Node<T> raiz) {
        if (raiz != null) {
            System.out.print(raiz.dado+"| ");
            preOrder(raiz.esquerda);
            preOrder(raiz.direita);
        }
    }
    
    public void inOrder(){
        inOrder(raiz);
    }
    
    public void inOrder(Node<T> raiz) {
        if (raiz != null) {
            inOrder(raiz.esquerda);
            System.out.print(raiz.dado+"| ");
            inOrder(raiz.direita);
        }
    }
    
    public void postOrder(){
        postOrder(raiz);
    }
    
    public void postOrder(Node<T> raiz) {
        if (raiz != null) {
            postOrder(raiz.esquerda);
            postOrder(raiz.direita);
            System.out.print(raiz.dado+"| ");
        }
    }
}
