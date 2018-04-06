import java.util.TreeMap;

public class BST extends TreeMap implements Tree{
    public boolean search(E element) {
        TreeNode<E> current = root;

        while(current != null) {
            if (element < current) current = current.left;
            else {
                if (element > current) current = current.right;
                else return true;
            }
        }
        return  false;
    }
}
