package edu.ap.state;

public class Patient {
	private State state;
	private int prozacLevel;
	
	public Patient(){
		state = new NormaalState(this);
		prozacLevel = 10;
	}
	
	public void lowerProzacLevel(){
		prozacLevel--;
	}
	
	public void higherProzacLevel(){
		prozacLevel++;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getProzacLevel() {
		return prozacLevel;
	}

	public void setProzacLevel(int prozacLevel) {
		this.prozacLevel = prozacLevel;
	}
	
	

}
