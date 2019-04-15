public class MoveNorth implements Command {
    Player player;
    public MoveNorth(Player player){
        this.player = player;
    }

    public void execute(){
        player.setxCoord(0);
        player.setyCoord(1);
        System.out.println("Player moved North : New Cordinates are (0,1)");
    }

    public boolean undo(){
        return false;
    }
}
