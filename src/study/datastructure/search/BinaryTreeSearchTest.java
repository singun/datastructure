package study.datastructure.search;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import study.datastructure.tree.BinarySearchTree;

public class BinaryTreeSearchTest {
	public BinarySearchTree bst = null;
	public BinaryTreeSearch s = null;
	
	@Before
	public void setUp() throws Exception {
		this.bst = new BinarySearchTree();
		this.bst.insertNode(4);
		this.bst.insertNode(2);
		this.bst.insertNode(6);
		this.bst.insertNode(1);
		this.bst.insertNode(3);
		this.bst.insertNode(7);
		this.bst.insertNode(5);
		
		this.s = new BinaryTreeSearch();
	}
	
	@Test
	public void searchTest(){
		Integer expected = 7;
		Integer result = this.s.binaryTreeSearch(this.bst, 7);
		
		assertEquals(expected, result);
	}

	@Test
	public void searchEmptyTest() {
		Integer expected = null;
		Integer result = this.s.binaryTreeSearch(this.bst, 8);
		
		assertEquals(expected, result);
	}
	
	@Test
	public void traversalTest() {
		String expected = "1234567";
		String result = this.bst.traversal("in");
		
		assertEquals(expected, result);
	}
}
