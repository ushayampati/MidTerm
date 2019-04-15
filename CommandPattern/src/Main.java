import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int max=4;
        int min=1;
        Player player = new Player();
        CommanInvoker commanInvoker =new CommanInvoker();
        Random random =new Random();
        for(int i=1; i<=50 ; i++){
            if(i == 50){
                commanInvoker.finish();
                System.out.println("\n\nFinal Destination of Player");
                System.out.println("Player Cordinates (0,0)");
            }
            int move = random.nextInt((max - min) + 1) + min;
            switch (move){
                case 1 :
                    Command moveNorth =new MoveNorth(player);
                    commanInvoker.setCommand(moveNorth);
                    commanInvoker.moveLocation();
                    break;
                case 2 :
                    Command moveEast = new MoveEast(player);
                    commanInvoker.setCommand(moveEast);
                    commanInvoker.moveLocation();
                    break;
                case 3 :
                    Command moveSouth = new MoveSouth(player);
                    commanInvoker.setCommand(moveSouth);
                    commanInvoker.moveLocation();
                    break;
                case 4 :
                    Command moveWest = new MoveWest(player);
                    commanInvoker.setCommand(moveWest);
                    commanInvoker.moveLocation();
                    break;
            }
        }



    }
}
