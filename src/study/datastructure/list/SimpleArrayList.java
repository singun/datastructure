package study.datastructure.list;

public class SimpleArrayList<E> {
	private final int initSize = 10;
	private int point;
	
	private Object[] arrayList;
	
	public SimpleArrayList() {		
		if (arrayList == null)
			arrayList = new Object[this.initSize];
		this.point = 0;
	}
	
	public SimpleArrayList(int size) {
		arrayList = new Object[size];
		this.point = 0;
	}
	
	public int size() {
		return this.point;
	}
	
	public boolean add(E value) {
		arrayList[this.point++] = value;
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E) arrayList[index];
	}
	
	public String getInfo() {
		return arrayList[0].getClass().getName().toString();
	}
	
}