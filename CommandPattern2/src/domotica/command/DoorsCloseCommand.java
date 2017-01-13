package domotica.command;

import domotica.model.DomoticaObject;
import domotica.model.ElectricityException;

public class DoorsCloseCommand implements ICommand {
	DomoticaObject object;
	
	

	public DoorsCloseCommand(DomoticaObject object) {
		this.object = object;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		try {
			object.setDoorsClosed();
			
		} catch (ElectricityException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		try {
			object.setDoorsOpened();
		} catch (ElectricityException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	

}
