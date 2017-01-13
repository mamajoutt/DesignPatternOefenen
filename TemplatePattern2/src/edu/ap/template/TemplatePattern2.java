package edu.ap.template;

public class TemplatePattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckArraySorter sorter = new DuckArraySorter();
		
		Duck d1 = new Duck("Duck1", 5);
		Duck d2 = new Duck("Duck2", 1);
		Duck d3 = new Duck("Duck3", 3);
		Duck d4 = new Duck("Duck4", 7);
		
		sorter.addObject(d1);
		sorter.addObject(d2);
		sorter.addObject(d3);
		sorter.addObject(d4);
		
		System.out.println("Before sort");
		sorter.printArray();
		
		System.out.println("******************");
		System.out.println("After sort");
		sorter.sort();
		sorter.printArray();
	}

}
