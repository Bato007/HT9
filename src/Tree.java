/**
 * María José Morales 19145
 * Brandon Hernández 19376
 * @since 20-04-2020
 * @version 24-04-2020
 *
 * Se encarga de mandar instancias a los programas que lo deseen
 */
public interface Tree<E extends Comparable<E>> {

    /**
     * Agrega un nuevo elemento en el arbol
     * @pre hay n cantidad de elementos en el arbol
     * @pos hay n + 1 cantidad de elementos en el arbol
     * @param newValue valor que se quiere agregar
     */
    public void add(E newValue);

    /**
     * Se encarga de buscar un valor
     * @pos se tiene el valor de la llave buscada
     * @param soughtValue la llave que se quiere buscar
     * @return el valor de la llave buscada
     */
    public E get(E soughtValue);

    /**
     * Busca en el arbol la llave deseada
     * @pre no se sabe si esta ya en el diccionario
     * @pos se sabe si esta en el diccionario
     * @param soughtKey la llave que se quiere buscar
     * @return true si esta, false si no esta
     */
    public boolean contains(E soughtKey);
}
