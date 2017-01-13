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
public class SQLInvoker {
    ICommand[] commandsList;
    int capacity = 10;
    int filled = 0;

    public SQLInvoker() {
        commandsList = new ICommand[capacity];
    }
    
    public void setCommand(ICommand command){
        commandsList[filled] = command;
        filled ++;
    }
    
    public void execute(){
        for (ICommand commandsList1 : commandsList) {
            commandsList1.execute();
        }
    }
    
    public void redo(){
        for (ICommand commandsList1 : commandsList) {
            commandsList1.redo();
        }
    }
    
    public void undo(){
        for (ICommand commandsList1 : commandsList) {
            commandsList1.undo();
        }
    }
    
    
    
}
