
import java.util.Date;

public class Cookie implements BakedGoods {
    public int getPrice(){
        return 10;
    }

    public String getDescription(){
        return "Chewier biscuits are sometimes called cookies";
    }

    public String getSellByDate(){
        return String.valueOf(new Date());
    }
}