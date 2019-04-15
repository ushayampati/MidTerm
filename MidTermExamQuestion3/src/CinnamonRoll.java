
import java.util.Date;

public class CinnamonRoll implements BakedGoods {
    public int getPrice(){
        return 15;
    }

    public String getDescription(){
        return "A cinnamon roll is a sweet roll consists of cinnamon and sugar";
    }

    public String getSellByDate(){
        return String.valueOf(new Date());
    }
}
