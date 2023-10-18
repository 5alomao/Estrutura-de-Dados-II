package javatrees;

import java.util.List;
import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable<T>> {

    Node raiz = null;
    private int comparacoes;
    List<Smartphone> listaPreOrder = new ArrayList<>();
    List<Smartphone> listaInOrder = new ArrayList<>();
    List<Smartphone> listaPostOrder = new ArrayList<>();

    public void add(T novoDado) {
        Node<T> novoNo = new Node<T>(novoDado);
        this.comparacoes = 0;
        raiz = inserir(raiz, novoNo);
    }

    public int getComparacoes() {
        return comparacoes;
    }

    private Node<T> inserir(Node<T> raiz, Node<T> novoNo) {
        comparacoes++;
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

    public List<Smartphone> preOrder() {
        preOrder(raiz);
        return listaPreOrder;
    }

    private void preOrder(Node<T> raiz) {
        if (raiz != null) {
            String line = raiz.dado.toString();
            String[] reader = line.split(",");
            listaPreOrder.add(new Smartphone(reader[0], reader[1], Double.parseDouble(reader[3]), Double.parseDouble(reader[4]), reader[2]));
            preOrder(raiz.esquerda);
            preOrder(raiz.direita);
        }
    }

    public List<Smartphone> inOrder() {
        inOrder(raiz);
        return listaInOrder;
    }

    public void inOrder(Node<T> raiz) {
        if (raiz != null) {
            inOrder(raiz.esquerda);
            String line = raiz.dado.toString();
            String[] reader = line.split(",");
            listaInOrder.add(new Smartphone(reader[0], reader[1], Double.parseDouble(reader[3]), Double.parseDouble(reader[4]), reader[2]));
            inOrder(raiz.direita);
        }
    }

    public List<Smartphone> postOrder() {
        postOrder(raiz);
        return listaPostOrder;
    }

    public void postOrder(Node<T> raiz) {
        if (raiz != null) {
            postOrder(raiz.esquerda);
            postOrder(raiz.direita);
            String line = raiz.dado.toString();
            String[] reader = line.split(",");
            listaPostOrder.add(new Smartphone(reader[0], reader[1], Double.parseDouble(reader[3]), Double.parseDouble(reader[4]), reader[2]));
        }
    }
}
