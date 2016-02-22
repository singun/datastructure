package study.datastructure.search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
	public BinarySearch bs = null;
	
	@Before
	public void setUp() {
		this.bs = new BinarySearch();
	}

	@Test
	public void binarySearchTest() {
		int[] arr = {1,2,3,4,5,6,7,8};
		assertTrue(this.bs.isContains(arr, 1));
		assertTrue(this.bs.isContains(arr, 2));
		assertTrue(this.bs.isContains(arr, 3));
		assertTrue(this.bs.isContains(arr, 4));
		assertTrue(this.bs.isContains(arr, 5));
		assertTrue(this.bs.isContains(arr, 6));
		assertTrue(this.bs.isContains(arr, 7));
		assertTrue(this.bs.isContains(arr, 8));
	}
	
	@Test
	public void binarySearchFailTest() {
		int[] arr = {1,2,3,4,5,6,7,8};
		assertFalse(this.bs.isContains(arr, 9));
	}

}
