/**
 * María José Morales 19145
 * Brandon Hernández 19376
 * @since 20-04-2020
 * @version 24-04-2020
 *
 * Se encarga de mandar instancias a los programas que lo deseen
 */
public class Factory {

    /**
     * Se encarga de mandar uns instancia, que el usuario quiere
     * @pos se tiene una instancia de un Tree
     * @param option identificador de la instancia deseada
     * @return la instancia deseada
     */
    public static Tree<Word<String>> factory(String option){
        return new SlayTree<Word<String>>();
    }

}
