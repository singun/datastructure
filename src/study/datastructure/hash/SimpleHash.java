package study.datastructure.hash;

import java.util.ArrayList;
import java.util.List;

public class SimpleHash {
	public List<Integer>[] hash = null;
	public int hashSize;
	
	@SuppressWarnings("unchecked")
	public void initHash(int hashSize) {
		this.hash = new ArrayList[hashSize];
		this.hashSize = hashSize;
	}
	
	public void add(Integer value) {
		int index = value % this.hashSize;
		
		if(this.hash[index] == null) {
			this.hash[index] = new ArrayList<>();
		}
		
		this.hash[index].add(value);
	}
	
	public boolean isContains (int input) {
		boolean result = false;
		
		List<Integer> items = this.hash[input % this.hashSize];
		
		if (items == null)
			return result;
		
		for (Integer item : items) {
			if (item == input) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	public void print() {
		System.out.println("hash size : " + this.hash.length);
		
		for (int i = 0; i < this.hash.length; i++) {
			if (this.hash[i] == null)
				continue;
			
			System.out.print(i + " :: ");
			for (int j = 0; j < this.hash[i].size(); j++) {
				System.out.print(this.hash[i].get(j) + " ");
			}
			System.out.println();
		}
	}
}

