package edu.miracosta.cs113;

import java.io.Serializable;
import java.util.Scanner;
import java.io.*;

public class BinaryTree<E> implements Serializable {

	//Data Fields
		protected Node<E> root;
	
	//Constructors
		
		/**No Parameter Constructor;
		 * 
		 */
		
		public BinaryTree() {
			root =  null;
		}
		
		/**Creates a tree with a give node at the root
		 *@param Node<E> root 
		 */
		
		protected BinaryTree(Node<E> root) {
			this.root = root;
		}
		/**Creates a tree from a data value and two trees;
		 * 
		 * @param data
		 * @param leftTree
		 * @param rightTree
		 */
		public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
			root = new Node<E>(data);
			
			if (leftTree != null){
				root.left = leftTree.root;
			}else {
				root.left = null;
			}
			
			if(rightTree != null) {
				root.right = rightTree.root;
			}else {
				root.right  = null;
			}
		}
	//End Contructors
		
	//Methods
		
		/**Return leftSubTree
		 * 
		 * @return tree
		 */
		public BinaryTree<E> getLeftSubtree(){
			if (root != null && root.left != null) {
				return new BinaryTree<E>(root.left);
			}else {
				return null;
			}
		}
		
		/**Returns rightSubTree
		 * 
		 * @return rightSubTree
		 */
		
		public BinaryTree<E> getRightSubtree(){
			if (root != null && root.right != null) {
				return new BinaryTree<E>(root.right);
			}else {
				return null;
			}
		}
		
		/**Check if node is a leaf
		 * 
		 * @return boolean
		 */
		public boolean isLeaf() {
			return (root.left == null & root.right == null);
		}
		
		/**Traverse  tree preorderley
		 * 
		 * @param node
		 * @param depth
		 * @param sb
		 */
		private void preOrderTraverse(Node<E> node, int depth,StringBuilder sb){
			for (int i = 1; i < depth; i++) {
				sb.append(" ");
			}
			if(node == null) {
				sb.append("null\n");
			}else {
				sb.append(node.toString());
				sb.append("\n");
				preOrderTraverse(node.left, depth + 1, sb);
				preOrderTraverse(node.right, depth + 1 , sb);
			}
		}
		
		/** ToString to representing a preorder traversal
		 * 
		 */
		public String toString() {
			StringBuilder sb =  new StringBuilder();
			preOrderTraverse(root,1,sb);
			return sb.toString();
			
		}
		
		public static BinaryTree<String> readBinaryTree(Scanner scan){
			
			if(scan.hasNextLine() == false) {
				return null;
			}else {
				String data = scan.nextLine().trim();
				BinaryTree<String> leftTree =  readBinaryTree(scan);
				BinaryTree<String> rightTree =  readBinaryTree(scan);
				return new BinaryTree<String>(data,leftTree,rightTree);
			}
			
		}
		
			//Inner Class for node of Binary tree.
				protected static class Node<E> implements Serializable{
					//Data Fields
					protected E data;
					
					protected Node<E> left;
					protected Node<E> right;
					
					public Node(E data) {
						this.data = data;
						this.left = null;
						this.right = null;
						
					}
					
					public String toString() {
						return data.toString();
					}
				}
	
}
