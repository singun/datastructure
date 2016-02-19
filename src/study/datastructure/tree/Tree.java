package study.datastructure.tree;

public class Tree {
	public TreeNode rootNode;
	
	public void traversal(String type) {
		System.out.println();
		System.out.println("START " + type + "order");
		
		if ("pre".equals(type))
			preOrder(rootNode);
		else if ("in".equals(type))
			inOrder(rootNode);
		else if ("post".equals(type))
			postOrder(rootNode);
		
		System.out.println("END " + type + "order");
	}
	
	private void preOrder(TreeNode node) {
		if (node == null)
			return;
		
		System.out.println(node.value);
		preOrder(node.leftChild);
		preOrder(node.rightChild);
	}
	
	private void inOrder(TreeNode node) {
		if (node == null)
			return;
		
		inOrder(node.leftChild);
		System.out.println(node.value);
		inOrder(node.rightChild);
	}

	private void postOrder(TreeNode node) {
		if (node == null)
			return;
		
		postOrder(node.leftChild);
		postOrder(node.rightChild);
		System.out.println(node.value);
	}
}
