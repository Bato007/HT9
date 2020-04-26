/**
 * María José Morales 19145
 * Brandon Hernández 19376
 * @since 26-04-2020
 * @version 26-04-2020
 *
 * Guarda la informacion de un arbol
 */
public class TreeNode<E> {
    // Atributos de de clase
    protected E data;
    protected TreeNode<E> parent;
    protected TreeNode<E>  leftSon, rightSon;

    /**
     * Constructor del nodo del arbol
     * @param newData valor que se le va a agregar al nodo
     */
    public TreeNode(E newData){
        this.data = newData;
        this.parent = null;
        this.leftSon = this.rightSon = null;
    }

    // SETTERS
    public void setLeftSon(TreeNode<E> leftSon) {
        this.leftSon = leftSon;
        this.leftSon.setParent(this.rightSon);
    }

    public void setRightSon(TreeNode<E> rightSon) {
        this.rightSon = rightSon;
        this.setParent(this.rightSon);
    }

    private void setParent(TreeNode<E> newSon) {
        newSon.parent = this;
    }

    // GETTERS
    public TreeNode<E> getLeftSon() {
        return leftSon;
    }

    public TreeNode<E> getRightSon(){
        return rightSon;
    }

    public E getData() {
        return data;
    }
}
