
import java.util.PriorityQueue;

public class HuffmanCode {

    public static HuffmanTree createBinaryTree(int[] charFreqs) {

        PriorityQueue<HuffmanTree> binaryTrees = new PriorityQueue<HuffmanTree>();

        for (int i = 0; i < charFreqs.length; i++) {
            if (charFreqs[i] > 0) {
                binaryTrees.add(new HuffmanLeaf(charFreqs[i], (char) i));
            }
        }

        while (binaryTrees.size() > 1) {
            HuffmanTree hfTree1 = binaryTrees.remove();
            HuffmanTree hfTree2 = binaryTrees.remove();

            binaryTrees.add(new HuffmanNode(hfTree1, hfTree2));
        }

        return binaryTrees.remove();
    }

    public static String compression(HuffmanTree hfTree, String palavra) {

        if (hfTree == null) {
            return "Árvore Vazia!";
        }

        String palavraComprimida = "";
        for (char c : palavra.toCharArray()) {
            palavraComprimida += (getCodes(hfTree, new StringBuffer(), c));
        }
        return palavraComprimida;
    }

    public static String expansion(HuffmanTree hfTree, String palavra) {

        if (hfTree == null) {
            return "Árvore Vazia!";
        }

        String palavraDescomprimida = "";
        HuffmanNode hfNode = (HuffmanNode) hfTree;
        for (char codigo : palavra.toCharArray()) {
            if (codigo == '0') {
                if (hfNode.hfTreeEsquerda instanceof HuffmanLeaf) {
                    palavraDescomprimida += ((HuffmanLeaf) hfNode.hfTreeEsquerda).simbolo;
                    hfNode = (HuffmanNode) hfTree;
                } else {
                    hfNode = (HuffmanNode) hfNode.hfTreeEsquerda;
                }
            } else if (codigo == '1') {
                if (hfNode.hfTreeDireita instanceof HuffmanLeaf) {
                    palavraDescomprimida += ((HuffmanLeaf) hfNode.hfTreeDireita).simbolo;
                    hfNode = (HuffmanNode) hfTree;
                } else {
                    hfNode = (HuffmanNode) hfNode.hfTreeDireita;
                }
            }
        }
        return palavraDescomprimida;
    }

    public static void printCodes(HuffmanTree hfTree, StringBuffer palavraCodificada) {

        if (hfTree == null) {
            System.out.println("Árvore Vazia!");
        } else {
            if (hfTree instanceof HuffmanLeaf) {
                HuffmanLeaf hfLeaf = (HuffmanLeaf) hfTree;

                System.out.println(hfLeaf.simbolo + "\t" + hfLeaf.frequencia + "\t\t" + palavraCodificada);

            } else if (hfTree instanceof HuffmanNode) {
                HuffmanNode hfNode = (HuffmanNode) hfTree;

                palavraCodificada.append('0');
                printCodes(hfNode.hfTreeEsquerda, palavraCodificada);
                palavraCodificada.deleteCharAt(palavraCodificada.length() - 1);

                palavraCodificada.append('1');
                printCodes(hfNode.hfTreeDireita, palavraCodificada);
                palavraCodificada.deleteCharAt(palavraCodificada.length() - 1);
            }
        }

    }

    public static String getCodes(HuffmanTree hfTree, StringBuffer palavraCodificada, char letra) {

        if (hfTree == null) {
            return "Ávore Vazia!";
        }

        if (hfTree instanceof HuffmanLeaf) {
            HuffmanLeaf hfLeaf = (HuffmanLeaf) hfTree;

            if (hfLeaf.simbolo == letra) {
                return palavraCodificada.toString();
            }

        } else if (hfTree instanceof HuffmanNode) {
            HuffmanNode hfNode = (HuffmanNode) hfTree;

            palavraCodificada.append('0');
            String esquerda = getCodes(hfNode.hfTreeEsquerda, palavraCodificada, letra);
            palavraCodificada.deleteCharAt(palavraCodificada.length() - 1);

            palavraCodificada.append('1');
            String direita = getCodes(hfNode.hfTreeDireita, palavraCodificada, letra);
            palavraCodificada.deleteCharAt(palavraCodificada.length() - 1);

            if (esquerda == null) {
                return direita;
            } else {
                return esquerda;
            }
        }
        return null;
    }

}
