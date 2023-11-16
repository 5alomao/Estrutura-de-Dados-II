
public class Main {

    public static void main(String[] args) {
        String palavra = "ABRACADABRA";

        int[] charFreqs = new int[256];
        for (char c : palavra.toCharArray()) {
            charFreqs[c]++;
        }

        HuffmanTree hfTree = HuffmanCode.createBinaryTree(charFreqs);

        System.out.println("TABELA DE CÓDIGOS");
        System.out.println("SÍMBOLO\tQUANTIDADE\tHUFFMAN CÓDIGO");
        HuffmanCode.printCodes(hfTree, new StringBuffer());

        String compressão = HuffmanCode.compression(hfTree, palavra);

        System.out.println("TEXTO COMPACTADO");
        System.out.println(compressão);

        System.out.println("TEXTO DECODIFICADO");
        System.out.println(HuffmanCode.expansion(hfTree, compressão));

    }

}
