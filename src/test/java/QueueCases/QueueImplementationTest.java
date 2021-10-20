package QueueCases;
import Assignment1.Queue.QueueImplementation;
import org.junit.Assert;
import org.junit.Test;

public class QueueImplementationTest {
    QueueImplementation queue;

    @Test
    public void queueImplementationTest() throws Exception
    {
        queue = new QueueImplementation(5);

        Assert.assertTrue(String.valueOf(-1),queue.empty());
        queue.enqueue(10);
        Assert.assertEquals(10,queue.getAddPointer());
        queue.enqueue(12);
        Assert.assertEquals(12,queue.getAddPointer());
        queue.enqueue(14);
        Assert.assertEquals(14,queue.getAddPointer());
        queue.enqueue(16);
        Assert.assertEquals(16,queue.getAddPointer());
        queue.enqueue(18);
        Assert.assertEquals(18,queue.getAddPointer());

        queue.display();
        Assert.assertEquals(5,queue.size());


        Assert.assertEquals(10,queue.dequeue());
        Assert.assertEquals(12,queue.dequeue());

        queue.display();

        Assert.assertEquals(3,queue.size());

        Assert.assertFalse(String.valueOf(1),queue.empty());

        Assert.assertEquals(3,queue.size());

        Assert.assertEquals(14,queue.dequeue());
        Assert.assertEquals(16,queue.dequeue());


        Assert.assertEquals(1,queue.size());
    }
}
