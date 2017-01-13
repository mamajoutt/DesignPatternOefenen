package edu.ap.template;

public class DuckArraySorter extends ArraySorter {

	@Override	  
	public int compareTo(Object d1, Object d2) {
 
		Duck duck1 = (Duck)d1;
		Duck duck2 = (Duck)d2;
		
		if (duck1.weight < duck2.weight) {
			return -1;
		} 
		else if (duck1.weight == duck2.weight) {
			return 0;
		} 
		else { // duck1.weight > duck2.weight
			return 1;
		}
	}
}
