package DoublyLinkedListImplementation;
import org.junit.Assert;
import Assignment1.DoublyLinkedListImplementation.DoublyLinkedList;
import org.junit.Test;

public class DoublyLinkedListImplementationCases
{
DoublyLinkedList list;
@Test
    public void doubleList() throws Exception
{
    list= new DoublyLinkedList();
    list.pushBack(10);
    Assert.assertEquals(10,list.topFront());
    list.pushBack(20);
    Assert.assertEquals(20,list.topBack());
    list.pushFront(8);
    Assert.assertEquals(8,list.topFront());
    list.pushFront(6);
    Assert.assertEquals(6,list.topFront());
    list.pushBack(22);
    Assert.assertEquals(22,list.topBack());
    list.pushBack(16);
    Assert.assertEquals(16,list.topBack());

    Assert.assertEquals(6,list.size());

    list.forwardDisplay();

    list.remove(6);
    Assert.assertEquals(5,list.size());
   list.reverseDisplay();
    Assert.assertTrue(list.Find(8));

    list.popFront();
    Assert.assertEquals(4,list.size());

    list.forwardDisplay();
    list.popBack();
    Assert.assertTrue(list.Find(20));
    Assert.assertEquals(3,list.size());

    list.reverseDisplay();
    list.popFront();
    Assert.assertEquals(2 ,list.size());
    list.forwardDisplay();


}
}
