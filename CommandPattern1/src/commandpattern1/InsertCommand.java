/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern1;

import java.util.Date;

/**
 *
 * @author HP
 */
public class InsertCommand implements ICommand{
    String previousDate = "";
    
    @Override
    public void execute() {
        String date = (new Date()).toString();
		previousDate = date;
		String SQL = "INSERT INTO DATETABLE VALUES('" + date + "');";
		DBConnection.executeUpdateSQL(SQL);
    }

    @Override
    public void undo() {
    if(!previousDate.equals("")) {
			String SQL = "DELETE INTO DATETABLE WHERE DATE = '" + previousDate + "';";
			DBConnection.executeUpdateSQL(SQL);
		}    }

    @Override
    public void redo() {
    if(!previousDate.equals("")) {
			String SQL = "INSERT INTO DATETABLE VALUES('" + previousDate + "');";
			DBConnection.executeUpdateSQL(SQL);
		}    }
    
}
