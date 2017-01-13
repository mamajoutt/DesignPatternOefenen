package edu.ap.state;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p = new Patient();
		p.setProzacLevel(20);
		for (int i = 0; i < 30; i++) {
			p.getState().werk();
		}
		
		

	}

}
