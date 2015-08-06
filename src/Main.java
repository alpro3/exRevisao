import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            array.add(revisao.sorteiaNumero());
        }

        for (int i = 0; i < 10; i++) {
            array2.add(revisao.sorteiaNumero());
        }

        System.out.println("Array 1\n" + array.toString());
        System.out.println("Array 2\n" + array2.toString());

        //a
        System.out.println("\na) Método que retorna quantas ocorrências do elemento 1 estão no Array 1");
        System.out.println(revisao.nOcorrencias(array, 1));

        //b
        System.out.println("\nb) Método que retorna true se o Array 1 contém tem elementos repetidos");
        System.out.println(revisao.hasRepeat(array));

        //c
        System.out.println("\nc) Método que retorna o número de elementos repetidos no Array 1");
        System.out.println(revisao.nroRepeat(array));

        //d
        System.out.println("\nd) Método que retorna uma lista de elementos repetidos no Array 1");
        System.out.println(revisao.listRepeat(array));

        //e
        System.out.println("\ne) Método que retorna a união de Array 1 e Array 2");
        System.out.println(revisao.union(array, array2));

        //f
        System.out.println("\nf) Método que retorna a intersecção de Array 1 e Array 2");
        System.out.println(revisao.interseccao(array, array2));
    }

}