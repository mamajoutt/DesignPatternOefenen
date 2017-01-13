/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern1;

/**
 *
 * @author HP
 */
public class CommandPattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SQLInvoker sqlinvoker = new SQLInvoker();
        InsertCommand command1 = new InsertCommand();
        sqlinvoker.setCommand(command1);
        
        DeleteCommand command2 = new DeleteCommand();
        sqlinvoker.setCommand(command2);
        
        SelectCommand command3 = new SelectCommand();
        sqlinvoker.setCommand(command3);
        
        CountCommand command4 = new CountCommand();
        sqlinvoker.setCommand(command4);
        
        InsertCommand command5 = new InsertCommand();
        sqlinvoker.setCommand(command5);
        
        DeleteCommand command6 = new DeleteCommand();
        sqlinvoker.setCommand(command6);
        
        SelectCommand command7 = new SelectCommand();
        sqlinvoker.setCommand(command7);
        
        CountCommand command8 = new CountCommand();
        sqlinvoker.setCommand(command8);
        
        InsertCommand command9 = new InsertCommand();
        sqlinvoker.setCommand(command9);
        
        DeleteCommand command10 = new DeleteCommand();
        sqlinvoker.setCommand(command10);
        
        
        sqlinvoker.execute();
        sqlinvoker.undo();
        sqlinvoker.redo();
        
    }
    
}
