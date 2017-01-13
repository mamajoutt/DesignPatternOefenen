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
public class CountCommand implements ICommand{
    
    
    @Override
    public void execute() {
        String SQL = "SELECT COUNT(*) FROM DATETABLE;";
		ArrayList<String> lst = DBConnection.executeSelectSQL(SQL);
		
		if(lst != null && lst.size() > 0) {
			System.out.println("COUNT : " + lst.get(0));
		}
    }

    @Override
    public void undo() {
        //EMPTY
    }

    @Override
    public void redo() {
        String SQL = "SELECT COUNT(*) FROM DATETABLE;";
		ArrayList<String> lst = DBConnection.executeSelectSQL(SQL);
		
		if(lst != null && lst.size() > 0) {
			System.out.println("COUNT : " + lst.get(0));
		}
    }
    
}
