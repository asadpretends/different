package PriorityQueueCases;
import org.junit.Assert;
import Assignment1.PriorityQueue.PriorityQueue;
import org.junit.Test;

public class PriorityQueueTest
{
    PriorityQueue queue;
    @Test
    public void priority() throws Exception
    {
        queue = new PriorityQueue(10);
        queue.insert(12);
        queue.insert(56);
        queue.insert(34);
        queue.insert(90);
        queue.insert(5);
        queue.display();
        Assert.assertEquals(90,queue.getMax());
        queue.changePriority(0,100);
        queue.display();
        Assert.assertEquals(100,queue.extractMax());
        queue.display();

        queue.insert(1);
        queue.insert(90);
        queue.remove(0);
        queue.display();

        Assert.assertEquals(56,queue.getMax());

        queue.changePriority(4,70);
        queue.display();

        Assert.assertEquals(70,queue.extractMax());

        queue.insert(4);
        queue.display();

        Assert.assertEquals(56,queue.getMax());
        Assert.assertEquals(56,queue.extractMax());
        Assert.assertEquals(34,queue.extractMax());

        queue.display();
        Assert.assertEquals(12,queue.extractMax());
        Assert.assertEquals(5,queue.extractMax());
        Assert.assertEquals(4,queue.extractMax());
        queue.display();




    }
}
