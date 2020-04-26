/**
 * María José Morales 19145
 * Brandon Hernández 19376
 * @since 24-04-2020
 * @version 24-04-2020
 *
 * Un splay tree
 */
public class SlayTree<E extends Comparable<E>> implements Tree<E> {

    private TreeNode<E> root;

    /**
     * Constructor del arbol
     * @pre la raiz no esta inicializada
     * @pos hay una instancia
     */
    public SlayTree(){
        root = null;
    }

    /**
     * Agrega un nuevo elemento en el arbol
     *
     * @param newValue valor que se quiere agregar
     * @pre hay n cantidad de elementos en el arbol
     * @pos hay n + 1 cantidad de elementos en el arbol
     */
    public void add(E newValue) {
        TreeNode<E> newNode = new TreeNode<>(newValue);

        // Observando si la raiz es null
        if(root == null){
            root = newNode;
        } else{
            TreeNode<E> aux = root;
            TreeNode<E> father;

            while(true){
                father = aux;

                if(newValue.compareTo(aux.getData()) < 0){ // Agregando al lado izquierdo
                    aux = aux.getLeftSon();
                    if(aux == null){
                        father.setLeftSon(newNode);
                        return;
                    }

                } else{
                    aux = aux.getRightSon();
                    if(aux == null){
                        father.setRightSon(newNode);
                        return;
                    }

                }

            }
        }

    }

    /**
     * Se encarga de buscar un valor
     *
     * @param soughtValue la llave que se quiere buscar
     * @return el valor de la llave buscada
     * @pos se tiene el valor de la llave buscada
     */
    public E get(E soughtValue) {
        TreeNode<E> aux = this.root;

        while (aux.getData() != soughtValue){

            if(soughtValue.compareTo(aux.getData()) < 0){
                aux = aux.getLeftSon();
            }else aux = aux.getRightSon();

            if(null == aux){
                return null;
            }
        }

        return aux.getData();
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
        TreeNode<E> aux = this.root;

        while (aux.getData() != soughtKey){

            if(soughtKey.compareTo(aux.getData()) < 0){
                aux = aux.getLeftSon();
            }else aux = aux.getRightSon();

            if(null == aux){
                return false;
            }
        }

        return true;
    }

}
