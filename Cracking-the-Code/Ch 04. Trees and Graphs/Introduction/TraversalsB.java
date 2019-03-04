package Introduction;

import CtCILibrary.TreeNode;

/**
 * @author x049709
 * 
 *Here's the structure of the tree:
       5               
      / \       
     /   \      
    /     \     
   /       \    
   2       8       
  / \     / \   
 /   \   /   \  
 1   3   6   9   
      \   \   \ 
      4   7   10 
 */
public class TraversalsB {
	public static void visit(TreeNode node) {
		if (node != null) {
			System.out.println(node.data);
		}
	}
	/*
	 * This (inOrderTraversal) is called recursively, starting from root(5)
	 * Dont know how to explain it; just run and follow the trace
	 * Same method is called in pre- and post- traversals
	 * 
	 */	
	public static void inOrderTraversal(TreeNode node) {
		if (node == null) System.out.println(" null:");
		if (node != null) {
			System.out.println(" left:" + node.data);
			inOrderTraversal(node.left);
			System.out.println(" visit:"  + node.data);
			visit(node);
			System.out.println(" right:" + node.data);
			inOrderTraversal(node.right);
		}
	}
	
	public static void preOrderTraversal(TreeNode node) {
		if (node != null) {
			visit(node);
			inOrderTraversal(node.left);
			inOrderTraversal(node.right);
		}
	}
	
	public static void postOrderTraversal(TreeNode node) {
		if (node != null) {
			inOrderTraversal(node.left);
			inOrderTraversal(node.right);
			visit(node);
		}
	}	
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// We needed this code for other files, so check out the code in the library
		TreeNode root = TreeNode.createMinimalBST(array);
		root.print();
		//inOrderTraversal(root);
		//preOrderTraversal(root);
		postOrderTraversal(root);
	}

}
