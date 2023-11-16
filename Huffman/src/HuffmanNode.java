
class HuffmanNode extends HuffmanTree {

    public final HuffmanTree hfTreeEsquerda;
    public final HuffmanTree hfTreeDireita;

    public HuffmanNode(HuffmanTree hfTreeEsquerda, HuffmanTree hfTreeDireita) {
        super(hfTreeEsquerda.frequencia + hfTreeDireita.frequencia);
        this.hfTreeEsquerda = hfTreeEsquerda;
        this.hfTreeDireita = hfTreeDireita;
    }
}
