package study.datastructure.tree;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TreeJTest {
	public BinarySearchTree bst;
	
	@Before
	public void setUp() throws Exception {
		this.bst = new BinarySearchTree();
		bst.insertNode(2);
		bst.insertNode(1);
		bst.insertNode(3);
	}
	
	@BeforeClass
	public static void SetUpBeforeClass (){
	}
	
	@Test
	public void searchTest1() {
		assertTrue(bst.search(2));
	}
	
	@Test
	public void saerchTest3() {
		assertFalse(bst.search(5));
	}
	
	@Test
	public void inOrderTest() {
		String expected = "123";
		assertEquals(expected, bst.traversal("in"));
	}
	
	@Test
	public void preOrderTest() {
		String expected = "213";
		assertEquals(expected, bst.traversal("pre"));
	}
	
	@Test
	public void postOrderTest() {
		String expected = "132";
		assertEquals(expected, bst.traversal("post"));
	}
	
}
