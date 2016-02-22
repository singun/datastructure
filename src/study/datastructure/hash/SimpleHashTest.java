package study.datastructure.hash;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleHashTest {
	public SimpleHash sh = null;
	
	@Before
	public void setUp() {
		this.sh = new SimpleHash();
		this.sh.initHash(3);
		this.sh.add(1);
		this.sh.add(2);
		this.sh.add(3);
		this.sh.add(4);
		this.sh.add(5);
		this.sh.add(6);
		this.sh.add(7);
		this.sh.add(8);
		this.sh.add(9);	
		this.sh.add(11);	
	}
	
	@Test
	public void test() {
		this.sh.print();
	}
	
	@Test
	public void isContainsTest() {
		assertTrue(this.sh.isContains(11));
	}
	
	@Test
	public void isNotContainsTest() {
		assertFalse(this.sh.isContains(0));
	}

}
