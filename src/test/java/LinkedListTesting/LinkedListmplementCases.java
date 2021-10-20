package LinkedListTesting;
import org.junit.Assert;
import Assignment1.LinkedList.LinkedListImplement;
import org.junit.Test;

public class LinkedListmplementCases
{
LinkedListImplement nextPointer;
@Test
    public void linkImplement() throws Exception {
 nextPointer = new LinkedListImplement();
 nextPointer.add(10);
 nextPointer.popFront();
 nextPointer.add(12);
 nextPointer.display();
 nextPointer.pushFront(22);
 nextPointer.display();
 Assert.assertEquals(22,nextPointer.topFront());
 nextPointer.display();
 nextPointer.add(14);
 nextPointer.display();
 nextPointer.add(16);
 nextPointer.display();
 Assert.assertEquals(4, nextPointer.getsize());
 Assert.assertEquals(22,nextPointer.topFront());
 nextPointer.popFront();
 nextPointer.display();

 Assert.assertEquals(16,nextPointer.topBack());
 nextPointer.pushBack(24);

 nextPointer.add(18);

 nextPointer.pushFront(20);
 nextPointer.getsize();
 Assert.assertEquals(6,nextPointer.getsize());
 nextPointer.display();

}

}
