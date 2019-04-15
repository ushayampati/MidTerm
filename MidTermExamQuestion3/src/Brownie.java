
import java.util.Date;

public class Brownie implements BakedGoods {
    public int getPrice(){
        return 20;
    }

    public String getDescription(){
        return "A chocolate brownie (commonly referred to as simply brownie) is a square, baked, chocolate dessert";
    }

    public String getSellByDate(){
        return String.valueOf(new Date());
    }
}
