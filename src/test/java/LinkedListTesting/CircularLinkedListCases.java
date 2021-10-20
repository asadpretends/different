package LinkedListTesting;
import org.junit.Assert;
import Assignment1.LinkedList.CircularLinkedList;
import org.junit.Test;

public class CircularLinkedListCases
{
    CircularLinkedList list;
    @Test
    public void circular()
    {
        list = new CircularLinkedList();
        list.pushFront(10);
        Assert.assertEquals(10,list.getHead().getKey());
        list.pushBack(12);
        Assert.assertEquals(10,list.getHead().getKey());
        list.pushFront(8);
        Assert.assertEquals(8,list.getHead().getKey());
        list.pushBack(14);
        Assert.assertEquals(8,list.getHead().getKey());

        list.display();

        list.popFront();
        Assert.assertEquals(10,list.getHead().getKey());
        list.display();

        list.popBack();
        Assert.assertEquals(12,list.getHead().getNext().getKey());
        list.display();
        list.popFront();
        Assert.assertEquals(12,list.getHead().getKey());
        list.popBack();
        //Assert.assertEquals(null, list.getHead().getKey());
        list.display();
    }


}
