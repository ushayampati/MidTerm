
import java.util.ArrayList;
import java.util.List;

public class ExamQ3Interface {

    public static void main(String[] args) {
        List<Object> objectsList = new ArrayList<>();
        CinnamonRoll cinnamonRoll = new CinnamonRoll();
        CinnamonRoll cinnamonRoll1 = new CinnamonRoll();        
        CinnamonRoll cinnamonRoll2 = new CinnamonRoll();
        Cookie cookie = new Cookie();
        Cookie cookie1 = new Cookie();
        Cookie cookie2 = new Cookie();
        Brownie brownie = new Brownie();
        Brownie brownie1 = new Brownie();
        Brownie brownie2 = new Brownie();
        
        objectsList.add(cookie.getPrice());
        objectsList.add(cookie.getDescription());
        objectsList.add(cookie.getSellByDate());
        objectsList.add(cookie1.getPrice());
        objectsList.add(cookie1.getDescription());
        objectsList.add(cookie1.getSellByDate());
        objectsList.add(cookie2.getPrice());
        objectsList.add(cookie2.getDescription());
        objectsList.add(cookie2.getSellByDate());
        objectsList.add(cinnamonRoll.getPrice());
        objectsList.add(cinnamonRoll.getDescription());
        objectsList.add(cinnamonRoll.getSellByDate());
        objectsList.add(cinnamonRoll1.getPrice());
        objectsList.add(cinnamonRoll1.getDescription());
        objectsList.add(cinnamonRoll1.getSellByDate());
        objectsList.add(cinnamonRoll2.getPrice());
        objectsList.add(cinnamonRoll2.getDescription());
        objectsList.add(cinnamonRoll2.getSellByDate());
 
        objectsList.add(brownie.getPrice());
        objectsList.add(brownie.getDescription());
        objectsList.add(brownie.getSellByDate());
        objectsList.add(brownie1.getPrice());
        objectsList.add(brownie1.getDescription());
        objectsList.add(brownie1.getSellByDate());
        objectsList.add(brownie2.getPrice());
        objectsList.add(brownie2.getDescription());
        objectsList.add(brownie2.getSellByDate());

        for(int i=0; i<objectsList.size();i++){
            if(i % 9 == 0){
                System.out.println("Baked Item "+ i/9 );
            }
            System.out.println(objectsList.get(i));
        }
    }
}
