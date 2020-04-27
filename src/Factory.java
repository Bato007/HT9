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
    public static Tree<String, String> factory(String option){
		if(option.equals("1"))
			return new Hash<String, String>();
		else if(option.equals("2"))
			return new RBT<String, String>();
		else return null; 
    }

}
