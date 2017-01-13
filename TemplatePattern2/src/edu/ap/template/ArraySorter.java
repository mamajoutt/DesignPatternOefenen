package edu.ap.template;

public abstract class ArraySorter {

	private Object[] objects;
	private int pointer = 0;
	
	public ArraySorter() {
		
		objects = new Object[10];
	}
	
	public void addObject(Object d) {
		
		objects[pointer] = d;
		pointer++;
	}
	
	public final void sort() {
		Object aux[] = objects.clone();
		mergesort(aux, objects, 0, pointer, 0);
	}
	
	public final void mergesort(Object src[], Object dest[], int low, int high, int off) {
		
		Object temp;
		
		for (int i = low; i < high; i++) {
			for (int j = i; j > low && (compareTo(dest[j-1], dest[j]) > 0); j--) {
				// implement the swap method
				temp = dest[j - 1];
				dest[j - 1] = dest[ j ];
				dest[j] = temp;
			}
		}
	}
	
	public void printArray() {
		
		for(int i = 0; i < pointer; i++) {
			System.out.println(objects[i].toString());
		}
	}
	
	abstract public int compareTo(Object d1, Object d2);
}
