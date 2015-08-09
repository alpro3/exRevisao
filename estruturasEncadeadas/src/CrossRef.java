import java.util.List;

public interface CrossRef {

    /*
    se a palavra já está na lista, acrescenta mais um número de linha;
    Se a palavra não está na lista, acrescenta a palavra com um  primeiro número de linha
    */
    public void addWord(String palavra, int linha);

    /*
     * retorna uma lista ordenada das linhas onde a palavra ocorre
    */
    public List<Integer> getRef(String pal);

}