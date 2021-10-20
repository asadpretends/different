package QueueCases;

import Assignment1.Queue.QueueLinkedList;
import org.junit.Assert;
import org.junit.Test;
public class QueueLinkedListTest {
    QueueLinkedList queue = new QueueLinkedList();

    @Test
    public void QueueLinkedListTest() {
        queue.enqueue(10);
        Assert.assertEquals(10,queue.getHead().getKey());
        queue.enqueue(20);
        Assert.assertEquals(20,queue.getHead().getNext().getKey());
        queue.enqueue(30);
        Assert.assertEquals(30,queue.getHead().getNext().getNext().getKey());
        queue.enqueue(40);
        Assert.assertEquals(40,queue.getHead().getNext().getNext().getNext().getKey());

        queue.display();

        queue.dequeue();
        Assert.assertEquals(20,queue.getHead().getKey());

        queue.enqueue(50);
        Assert.assertEquals(50,queue.getHead().getNext().getNext().getNext().getKey());

        queue.display();

        queue.dequeue();
        Assert.assertEquals(30,queue.getHead().getKey());
        queue.dequeue();
        Assert.assertEquals(40,queue.getHead().getKey());

        queue.display();

        queue.dequeue();
        Assert.assertEquals(50,queue.getHead().getKey());

        queue.display();
    }
}
