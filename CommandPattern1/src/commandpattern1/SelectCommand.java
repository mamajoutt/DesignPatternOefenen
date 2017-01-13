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
public class SelectCommand implements ICommand{

    @Override
    public void execute() {
        String SQL = "SELECT * FROM DATETABLE;";
		ArrayList<String> lst = DBConnection.executeSelectSQL(SQL);
		
		if(lst != null && lst.size() > 0) {
			for(String s : lst) {
				System.out.println(s);
			}
		}
    }

    @Override
    public void undo() {
        //EMPTY
    }

    @Override
    public void redo() {
        String SQL = "SELECT * FROM DATETABLE;";
		ArrayList<String> lst = DBConnection.executeSelectSQL(SQL);
		
		if(lst != null && lst.size() > 0) {
			for(String s : lst) {
				System.out.println(s);
			}
		}
    }
    
}
