
class HuffmanLeaf extends HuffmanTree {

    public final char simbolo; // A letra é atribuida a um nó folha 

    public HuffmanLeaf(int freq, char simbolo) {
        super(freq);
        this.simbolo = simbolo;
    }
}
