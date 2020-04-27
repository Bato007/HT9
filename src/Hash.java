import java.util.HashMap;
import java.util.Map;
/**
 * María José Morales 19145
 * Brandon Hernández 19376
 * @since 20-04-2020
 * @version 24-04-2020
 *
 * Mapeo del hash
 */
public class Hash<E extends Comparable<E>, V> implements Tree<E, V>{

    protected Map<E, V> map = new HashMap<>();

    /**
     * Agrega un nuevo elemento en el arbol
     *
     * @param newValue valor que se quiere agregar
     * @pre hay n cantidad de elementos en el arbol
     * @pos hay n + 1 cantidad de elementos en el arbol
     */
    public void add(Word<E,V> newValue) {
        map.put(newValue.getWord(), newValue.getMeaning());
    }

    /**
     * Se encarga de buscar un valor
     *
     * @param soughtValue la llave que se quiere buscar
     * @return el valor de la llave buscada
     * @pos se tiene el valor de la llave buscada
     */
    public V get(E soughtValue) {
        return map.get(soughtValue);
    }

    /**
     * Busca en el arbol la llave deseada
     *
     * @param soughtKey la llave que se quiere buscar
     * @return true si esta, false si no esta
     * @pre no se sabe si esta ya en el diccionario
     * @pos se sabe si esta en el diccionario
     */
    public boolean contains(E soughtKey) {
        return map.containsKey(soughtKey);
    }
}
