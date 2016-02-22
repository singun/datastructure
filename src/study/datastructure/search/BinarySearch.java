package study.datastructure.search;

public class BinarySearch {
	public int[] arr = null;
	
	public boolean isContains (int[] input, int wanted) {
		this.arr = input;
		return binarySearch(0, input.length, wanted);
	}
	
	public boolean binarySearch (int startIndex, int endIndex, int findValue) {
		int mid = (startIndex + endIndex) / 2;
		
		if (mid == startIndex || mid == endIndex) {
			if (this.arr[mid] != findValue)
				return false;
		}
		System.out.println("mid val " + mid);
		
		if (this.arr[mid] == findValue)
			return true;
		
		if (this.arr[mid] > findValue)
			return binarySearch(startIndex, mid, findValue);
		else
			return binarySearch(mid, endIndex, findValue);
	}
}
