package study.datastructure.search;

import study.datastructure.tree.BinarySearchTree;
import study.datastructure.tree.TreeNode;

public class BinaryTreeSearch{
	public Integer binaryTreeSearch(BinarySearchTree bst, int value) {
		return search(bst.rootNode, value);
	}
	
	public Integer search(TreeNode n, int value) {
		if (n == null)
			return null;
		
		if (n.value == value)
			return value;
		else {
			if (n.value > value)
				return search(n.leftChild, value);
			else if (n.value < value)
				return search(n.rightChild, value);
		}
		return null;
	}
}
