package study.datastructure.tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	public TreeNode rootNode;
	private String travelResult;;

	public void insertNode(int n) {
		if (alreadyExistValue(n))
			return;
		
		TreeNode node = new TreeNode(n);
		
		if (this.rootNode == null)
			this.rootNode = node;
		else {
			insertChild(node);
		}
	}
	
	@Deprecated
	private boolean alreadyExistValue(int n) {
		TreeNode current = rootNode;
		
		while(current != null) {
			if (current.value == n) return true;
			else if (current.value > n)	current = current.rightChild;
			else current = current.leftChild;
		}
		
		return false;
	}

	private void insertChild(TreeNode node) {
		TreeNode current = rootNode;
		TreeNode parent;
		
		while (true) {
			parent = current;
			
			if (current.value > node.value) {
				current = current.leftChild;
				if (current == null) {
					parent.leftChild = node;
					return;
				}
			} else if (current.value < node.value) {
				current = current.rightChild;
				if (current == null) {
					parent.rightChild = node;
					return;
				}
			} else {
				return;
			}
		}
	}
	
	public boolean search(int n) {
		TreeNode current = rootNode;
		
		while (current != null) {
			if (current.value < n) current = current.rightChild;
			else if (current.value > n) current = current.leftChild;
			else return true;
		}
		
		return false;
	}
	
	/*******************
	 * 
	 * Tree Traversal
	 * 
	 *******************/
	
	public String traversal(String type) {
		this.travelResult = new String();
		System.out.println(type + "-order start");
		
		if ("pre".equals(type))
			preOrder(this.rootNode);
		else if ("in".equals(type))
			inOrder(this.rootNode);
		else if ("post".equals(type))
			postOrder(this.rootNode);
		
		System.out.println(type + "-order end");
		System.out.println();
		
		return this.travelResult;
	}
	
	private void preOrder(TreeNode node) {
		if (node == null)
			return;
		
		System.out.println(node.value);
		this.travelResult += node.value;
		preOrder(node.leftChild);
		preOrder(node.rightChild);
	}
	
	private void inOrder(TreeNode node) {
		if (node == null)
			return;
		
		inOrder(node.leftChild);
		System.out.println(node.value);
		this.travelResult += node.value;
		inOrder(node.rightChild);
	}

	private void postOrder(TreeNode node) {
		if (node == null)
			return;
		
		postOrder(node.leftChild);
		postOrder(node.rightChild);
		System.out.println(node.value);
		this.travelResult += node.value;
	}
}
