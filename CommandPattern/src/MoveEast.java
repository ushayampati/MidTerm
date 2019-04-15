public class MoveEast implements Command {
    Player player;
    public MoveEast(Player player){
        this.player = player;
    }

    public void execute(){
        player.setxCoord(1);
        player.setyCoord(0);
        System.out.println("Player moved East : New Cordinates are (1,0)");
    }

    public boolean undo(){
        return false;
    }
}
