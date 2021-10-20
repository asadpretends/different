package LinkedListTesting;
import org.junit.Assert;
import Assignment1.LinkedList.LinkedListSwapNodes;
import org.junit.Test;

public class LinkedListSwapNodesCases
{
    LinkedListSwapNodes list;
    @Test
    public void SwapNodes()
    {
    list = new LinkedListSwapNodes();
    list.pushFront(10);
    Assert.assertEquals(10,list.gethead().getkey());
    list.pushBack(12);
    Assert.assertEquals(12,list.gethead().getnext().getkey());
    list.pushFront(8);
    Assert.assertEquals(8,list.gethead().getkey());
    list.pushFront(6);
    Assert.assertEquals(6,list.gethead().getkey());

    list.display();
    list.swap();
    list.display();
    }
}
