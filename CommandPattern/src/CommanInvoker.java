public class CommanInvoker {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void moveLocation(){
        command.execute();
    }
    public void finish(){
        command.undo();
    }
}
