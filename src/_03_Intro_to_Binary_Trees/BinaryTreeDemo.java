package _03_Intro_to_Binary_Trees;

public class BinaryTreeDemo<T extends Comparable<T>> {
	private Node<T> root;
    /*
     * A Binary Tree is a data structure that makes use of nodes and references
     * like a LinkedList, but instead of the nodes pointing to a previous node
     * or next node in an unorderd list they each points to two child nodes that
     * are below them in the hierarchy.
     * 
     * Some important properties of BinaryTree are:
     * 
     * -The left node is always a smaller value than its parent and the right
     * node is always a larger value. This is a property you have seen in some
     * form already via Binary Search.
     * 
     * -Empty nodes are null references.
     * 
     * -The parent node at the very top of the tree is called the root.
     * 
     * 1. Read through the BinaryTree and Node classes.
     * 
     * 2. Create a BinaryTree of any type you like.
     * 
     * 3. Try using some BinaryTree methods to insert, search for, delete and
     * print elements.
     * 
     * 4. Save the root into a Node Object and use references to traverse
     * through the BinaryTree and perform an operation on every element(You may
     * choose to do this recursively or iteratively). Then print it out to see
     * if it worked.
     * 
     */
	public static void main(String[] args) {
		new BinaryTreeDemo().main2(args);
	}

    public void main2(String[] args) {
    	BinaryTree<Integer> bit = new BinaryTree<Integer>();
    	root = recursiveInsert(root, args);
    	
    	bit.insert(2);
    	bit.insert(4);
    	bit.insert(6);
    	bit.insert(9);
    	bit.insert(13);
//    	bit.search(6);
//    	bit.delete(2);
    	bit.printHorizontal();
    	bit.printVertical();
    	
    	for (int i = 0; i < args.length; i++) {
			
		}
    }
	private Node<T> recursiveInsert(Node<T> root2, String[] args) {
		// TODO Auto-generated method stub
		return null;
	}

}
