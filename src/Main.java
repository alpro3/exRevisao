import java.util.ArrayList;

public class Main<A> {

    public static void main(String[] args) {

    }

    //a
    public int nOcorrencias(ArrayList<A> l, A el) {
        int count = 0;
        for (A das : l) {
            if (das.equals(el)) {
                count++;
            }
        }
        return count;
    }

    //b
    public boolean hasRepeat(ArrayList<A> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j))) {

                    return true;
                }
            }
        }
        return false;
    }

    //c
    public int nroRepeat(ArrayList<A> l) {
        int count = 0;
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.size(); i++) {
                if (l.get(i).equals(l.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    //d
    public ArrayList<A> listRepeat(ArrayList<A> l1, ArrayList<A> l2) {
        ArrayList<A> l3 = new ArrayList<A>();
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (l1.get(i).equals(l2.get(j))) {
                    l3.add(l1.get(i));
                }
            }
        }
        return l3;
    }

    //e
    public ArrayList<A> union(ArrayList<A> l1, ArrayList<A> l2) {
        ArrayList<A> l3 = new ArrayList<A>();
        for (int i = 0; i < l1.size(); i++) {
            l3.add(l1.get(i));
        }
        for (int i = 0; i < l1.size(); i++) {
            l3.add(l2.get(i));
        }
        for (int i = 0; i < l3.size(); i++) {
            for (int j = 0; i < l3.size(); i++) {
                if (l3.get(i).equals(l3.get(j))) {
                    l3.remove(j);
                }
            }
        }
        return l3;
    }

    //f
    public ArrayList<A> intersect(ArrayList<A> l1, ArrayList<A> l2) {
        ArrayList<A> l3 = new ArrayList<A>();
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (l1.get(i).equals(l2.get(j))) {
                    l3.add(l1.get(i));
                }
            }
        }
        for (int i = 0; i < l3.size(); i++) {
            for (int j = i + 1; j < l3.size(); j++) {
                if (l3.get(i).equals(l3.get(j))) {
                    l3.remove(i);
                }
            }
        }
        return l3;
    }
<<<<<<< HEAD
  
=======

>>>>>>> 2eb5b36012fffc21e90183d4bfbc2bd977b6315a
}