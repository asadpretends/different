package LinkedListTesting;
import Assignment1.LinkedList.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest
{
    LinkedList list;

    @Test
    public void linked()
    {
        list = new LinkedList();
        
        list.pushFront(10);
        list.pushBack(12);
        list.pushFront(8);
        list.pushFront(6);
        list.pushBack(20);

        list.pop(3);
        list.display();
        Assert.assertEquals(8, list.getHead().getNext().getKey());
        Assert.assertEquals(6,list.getHead().getKey());
        list.popFront();
        Assert.assertEquals(8,list.getHead().getKey());
        list.display();
        list.popBack();
        Assert.assertEquals(8,list.getHead().getKey());


    }


}
