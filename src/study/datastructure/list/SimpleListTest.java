package study.datastructure.list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleListTest {
	private SimpleArrayList<String> strList = null;
	private SimpleArrayList<Integer> intList = null;
	
	@Before
	public void init() {
		strList = new SimpleArrayList<String>();
		strList.add(new String("Singun"));
		
		intList = new SimpleArrayList<Integer>();
		intList.add(1);
	}
	
	@Test
	public void strSimpleArrayListTest() {
		String expectedClass = String.class.getName().toString();
		int expectedSize = 1;
		String expectedValue = "Singun";
		
		assertEquals(expectedSize, this.strList.size());
		assertEquals(expectedValue, this.strList.get(0));
		assertEquals(expectedClass, this.strList.getInfo());
		assertNotEquals(expectedValue, this.strList.get(1));
	}
	
	@Test
	public void intSimpleArrayListTest() {
		String expectedClass = Integer.class.getName().toString();
		int expectedSize = 1;
		Integer expectedValue = 1;
		
		assertEquals(expectedSize, this.intList.size());
		assertEquals(expectedValue, this.intList.get(0));
		assertEquals(expectedClass, this.intList.getInfo());
		assertNotEquals(expectedValue, this.intList.get(1));
	}
}
