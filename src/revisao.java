import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class revisao {

    /*
    a) Método que retorna quantas ocorrências de um elemento estào na lista
     */
    public static int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int count = 0;
        for (Integer das : l) {
            if (das==(el)) {
                count++;
            }
        }
        return count;
    }

    /*
    b) Método que retorna true se l tem elementos repetidos
     */
    public static boolean hasRepeat(ArrayList<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i)==(l.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
    c) Método que retorna o número de elementos repetidos em l
     */
    public static int nroRepeat(ArrayList<Integer> l) {
        int count = 0;
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i)==(l.get(j))) {
                    count++;
                    a.add(l.get(i));
                }
            }
        }
        return a.size();
    }

    /*
    d) Método que retorna uma lista de elementos repetidos de l
     */
    public static Set<Integer> listRepeat(ArrayList<Integer> l1) {
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < l1.size(); i++) {
            for (int j = i+1; j < l1.size(); j++) {
                if (l1.get(i)==(l1.get(j))) {
                    a.add(l1.get(i));
                }
            }
        }
        return a;
    }

    /*
    e) Método que retorna a união de l1 e l2
     */
    public static Set<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        Set<Integer> a = new HashSet<>();
        a.addAll(l1);
        a.addAll(l2);
        return a;
    }

    /*
    f) Método que retorna a intersecção de l1 e l2
     */
    public static Set<Integer> interseccao(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        Set<Integer> a = new HashSet<>();
        a.addAll(l1);
        a.retainAll(l2);
        return a;
    }

    /*
    Gerador de numeros
     */
    public static Integer sorteiaNumero(){
        Random rn = new Random();
        return rn.nextInt(10)+1;
    }

}