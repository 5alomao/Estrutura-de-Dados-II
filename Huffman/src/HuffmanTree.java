
abstract class HuffmanTree implements Comparable<HuffmanTree> {

    public final int frequencia;

    public HuffmanTree(int frequencia) {
        this.frequencia = frequencia;
    }

    public int compareTo(HuffmanTree hfTree) {
        return this.frequencia - hfTree.frequencia;
    }
}
