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
public class Hash<E extends Comparable<E>> implements Tree<E>{

    protected Map<String, String> map = new HashMap<>();

    /**
     * Agrega un nuevo elemento en el arbol
     *
     * @param newValue valor que se quiere agregar
     * @pre hay n cantidad de elementos en el arbol
     * @pos hay n + 1 cantidad de elementos en el arbol
     */
    public void add(E newValue) {
        Word<String> temp = (Word<String>) newValue;
        map.put(temp.getWord(), temp.getMeaning());
    }

    /**
     * Se encarga de buscar un valor
     *
     * @param soughtValue la llave que se quiere buscar
     * @return el valor de la llave buscada
     * @pos se tiene el valor de la llave buscada
     */
    public E get(E soughtValue) {
        if(contains(soughtValue)){
            Word<String> temp = (Word<String>) soughtValue;
            Word<String> aux = new Word<>(temp.getWord(), map.get(temp.getWord()));
            return (E) aux;
        }else {
            return null;
        }
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
        Word<String> temp = (Word<String>) soughtKey;
        return map.containsKey(temp.getWord());
    }
}
