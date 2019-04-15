public class MoveSouth implements Command {
    Player player;
    public MoveSouth(Player player){
        this.player = player;
    }

    public void execute(){
        player.setxCoord(0);
        player.setyCoord(-1);
        System.out.println("Player moved South : New Cordinates are (0,-1)");
    }

    public boolean undo(){
        return false;
    }
}
