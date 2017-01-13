package edu.ap.state;

public class CatatonieState implements State {
	Patient patient;
	
	public CatatonieState(Patient p) {
		// TODO Auto-generated constructor stub
		patient = p;
	}
	
	@Override
	public void begroet() {
		// TODO Auto-generated method stub
		System.out.println("Catatonische begroeting:");
		patient.higherProzacLevel();
		
	}

	@Override
	public void werk() {
		// TODO Auto-generated method stub
		System.out.println("Catatonische werkhouding");
		patient.lowerProzacLevel();
        if(patient.getProzacLevel() > 5) {
            patient.setState(new DepressieState(patient));
        }
		
	}

}
