package edu.ap.state;

public class NormaalState implements State {
	Patient patient;
	
	public NormaalState(Patient p) {
		// TODO Auto-generated constructor stub
		patient = p;
	}
	
	@Override
	public void begroet() {
		// TODO Auto-generated method stub
		System.out.println("Normale begroeting:");
		patient.higherProzacLevel();
		
	}

	@Override
	public void werk() {
		// TODO Auto-generated method stub
		System.out.println("Normale werkhouding:");
        patient.lowerProzacLevel();
		if(patient.getProzacLevel() < 10) {
            patient.setState(new DepressieState(patient));
        }
        if(patient.getProzacLevel() >= 15) {
            patient.setState(new ManieState(patient));
        }
		
	}

}
