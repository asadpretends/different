package QueueCases;
import Assignment1.Queue.Dequeue;
import org.junit.Assert;
import org.junit.Test;
public class DequeueTest
{
    Dequeue queue;
    @Test
    public void deQueue()
    {
        queue = new Dequeue(5);
        queue.addRight(10);
        queue.display();

        queue.addLeft(20);
        queue.display();

        queue.addRight(12);
        queue.display();

        queue.addLeft(18);
        queue.display();

        queue.addRight(16);
        queue.display();

        Assert.assertEquals(18,queue.getLeftPointer());
        Assert.assertEquals(20,queue.getRightPointer());

    }
}
