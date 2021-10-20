package DoublyLinkedListCases;
import Assignment1.DoublyLinkedList.DoublyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class DoublyLinkedListCases
{
    DoublyLinkedList list;
    @Test
    public void Double() {
        list= new DoublyLinkedList();
        list.pushFront(10);
        Assert.assertEquals(10,list.getHead().getKey());
        list.pushBack(12);
        Assert.assertEquals(12,list.getTail().getKey());
        list.pushFront(8);
        Assert.assertEquals(8,list.getHead().getKey());
        list.pushBack(14);
        Assert.assertEquals(14,list.getTail().getKey());
        list.displayF();
        list.displayB();

        list.popFront();
        Assert.assertEquals(10,list.getHead().getKey());
        list.displayF();
        list.displayB();
        list.popBack();
        Assert.assertEquals(12,list.getTail().getKey());
        list.displayF();
        list.displayB();

        list.popFront();
        Assert.assertEquals(12,list.getHead().getKey());
        list.displayB();
        list.popFront();
        //Assert.assertEquals(null,list.getHead().getKey());
        //Slist.displayF();
    }
}
