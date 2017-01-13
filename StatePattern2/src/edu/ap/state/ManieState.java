package edu.ap.state;

public class ManieState implements State {
	Patient patient;
	
	public ManieState(Patient p) {
		// TODO Auto-generated constructor stub
		patient = p;
	}
	
	@Override
	public void begroet() {
		// TODO Auto-generated method stub
		System.out.println("Manische begroeting:");
		patient.higherProzacLevel();
		
	}

	@Override
	public void werk() {
		// TODO Auto-generated method stub
		System.out.println("Manische werkhouding:");
        patient.lowerProzacLevel();
        if(patient.getProzacLevel() < 15) {
            patient.setState(new NormaalState(patient));
        }
	}

}
