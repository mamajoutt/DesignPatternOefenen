package edu.ap.state;

public class DepressieState implements State{
	Patient patient;
	
	public DepressieState(Patient p) {
		// TODO Auto-generated constructor stub
		patient = p;
	}
	
	@Override
	public void begroet() {
		System.out.println("Depressieve begroeting:");
		patient.higherProzacLevel();
		
	}

	@Override
	public void werk() {
		// TODO Auto-generated method stub
		System.out.println("Depressieve werkhouding");
        patient.lowerProzacLevel();
        if(patient.getProzacLevel() < 5) {
            patient.setState(new CatatonieState(patient));
        }
        if(patient.getProzacLevel() >= 10) {
            patient.setState(new NormaalState(patient));
        }
	}

}
