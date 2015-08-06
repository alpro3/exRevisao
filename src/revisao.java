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
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.size(); j++) {
                if (l.get(i)==(l.get(j))) {
                    count++;
                    a.add(i);
                }
            }
        }
        return a.size();
    }

    /*
    d) Método que retorna uma lista de elementos repetidos de l
     */
    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l1) {
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        for (int i = 0; i < l1.size(); i++) {
            for (int j = i+1; j < l1.size(); j++) {
                if (l1.get(i)==(l1.get(j))) {
                    l3.add(l1.get(i));
                }
            }
        }
        return l3;
    }

    /*
    e) Método que retorna a união de l1 e l2
     */
    public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        for (int i = 0; i < l1.size(); i++) {
            l3.add(l1.get(i));
        }
        for (int i = 0; i < l2.size(); i++) {
            l3.add(l2.get(i));
        }
        for (int i = 0; i < l3.size(); i++) {
            for (int j = i + 1; i < l3.size(); i++) {
                if (l3.get(i)==(l3.get(j))) {
                    l3.remove(j);
                }
            }
        }
        return l3;
    }

    /*
    f) Método que retorna a intersecção de l1 e l2
     */
    public static ArrayList<Integer> interseccao(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        for (int i = 0; i < l1.size() ; i++) {
            for (int j = 0; j < l2.size(); j++) {
                if(l1.get(i)==(l2.get(j))){
                    l3.add(l1.get(i));
                }
            }
        }
        return l3;
    }

    /*
    Gerador de numeros
     */
    public static Integer sorteiaNumero(){
        Random rn = new Random();
        return rn.nextInt(10)+1;
    }

}