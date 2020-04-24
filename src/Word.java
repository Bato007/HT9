/**
 * María José Morales 19145
 * Brandon Hernández 19376
 * @since 24-04-2020
 * @version 24-04-2020
 *
 * Representa una palabra deldiccionario
 */
public class Word<E extends Comparable<E>> implements Comparable<Word<E>> {

    // Atributos de un objeto
    private E word, meaning;

    /**
     * Constructor cuando se quiere solo para buscar
     * @pos se tiene un objeto que se puede comparar, pero no cuenta con definicion
     * @param word la palabra que se le asigna al objeto
     */
    public Word(E word){
        this.word = word;
    }

    /**
     * Constructor para almacenar en memoria
     * @pos se tiene un objeto con una palabra y su significado
     * @param word la palabra que se quiere agregar
     * @param meaning el significado de la palabra
     */
    public Word(E word, E meaning){
        this.word = word;
        this.meaning = meaning;
    }

    /**
     * Se encarga de comparar las palabras de dos objetos
     * @pos se sabe si son la misma palabra o no
     * @param that objeto con que se quiere comparar
     * @return 0 si son iguales, -1 si that es mayor, 1 si this.word es mayor
     */
    public int compareTo(Word<E> that) {
        return this.word.compareTo(that.word);
    }

    /**
     * Obtiene el significado de una palabra
     * @pos se cuenta con el significado de la palabra
     * @return el significado de la palabra
     */
    public E getMeaning() {
        return meaning;
    }

}
