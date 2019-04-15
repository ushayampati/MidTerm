
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class InventoryTest {
    Inventory inventory = new Inventory();


    @Test
    public void testAddItemToInventory(){
        InventoryItem inventoryItem =new InventoryItem("Hardware", 120, "bolts", 10);
        inventory.addItemToInventory(inventoryItem);
        int weight = inventory.getWeight();
        Assert.assertEquals(120,weight);
    }

    @Test
    public void testDropItemToInventory(){
        InventoryItem inventoryItem =new InventoryItem("Hardware", 120, "bolts", 10);
        inventory.addItemToInventory(inventoryItem);
        int count = inventory.getCount();
        Assert.assertEquals(1,count);
    }

    @Test
    public void testAddItemToInventoryWithSpy(){
        List<InventoryItem> spyList = Mockito.spy(new ArrayList<InventoryItem>());
        InventoryItem inventoryItem =new InventoryItem("Hardware", 120, "bolts", 10);
        spyList.add(inventoryItem);
        Boolean result = inventory.addItemToInventory(spyList.get(0));
        Assert.assertEquals(true,result);
    }

    @Test
    public void testAddItemToInventoryWithMock(){
        List<InventoryItem> mockedList = Mockito.mock(ArrayList.class);
        InventoryItem inventoryItem =new InventoryItem("Hardware", 120, "bolts", 10);
        mockedList.add(inventoryItem);
        Boolean result = inventory.addItemToInventory(inventoryItem);
        Assert.assertEquals(true,result);
    }

}
