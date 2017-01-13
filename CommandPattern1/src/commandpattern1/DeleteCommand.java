/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern1;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DeleteCommand implements ICommand{
    String previousDate = "";
    
    @Override
    public void execute() {
        String SQL = "SELECT MAX(DateField) FROM DATETABLE;";
		ArrayList<String> lst = DBConnection.executeSelectSQL(SQL);
		
		if(lst != null && lst.size() > 0) {
			String dateToDelete = lst.get(0);
			previousDate = dateToDelete;
			SQL = "DELETE FROM DATETABLE WHERE DATEFIELD = '" + dateToDelete + "';";
			DBConnection.executeUpdateSQL(SQL);
		}
    }

    @Override
    public void undo() {
        //EMPTY
    }

    @Override
    public void redo() {
        if(!previousDate.equals("")) {
			String SQL = "INSERT INTO DATETABLE VALUES('" + previousDate + "');";
			DBConnection.executeUpdateSQL(SQL);
		}
    }
    
}
