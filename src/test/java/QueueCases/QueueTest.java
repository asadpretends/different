package QueueCases;
import Assignment1.Queue.Queue;
import org.junit.Assert;
import org.junit.Test;
public class QueueTest
{
    Queue queue;
    @Test
    public void queueTest()
    {
        queue= new Queue(5);
        queue.enqueue(10); //add num = 10
        Assert.assertEquals(10,queue.getAddPointer());
        queue.enqueue(20); //add num = 20
        Assert.assertEquals(20,queue.getAddPointer());
        queue.enqueue(30); //add num = 30
        Assert.assertEquals(30,queue.getAddPointer());
        queue.enqueue(40); //add num = 40
        Assert.assertEquals(40,queue.getAddPointer());
        queue.enqueue(50); //add num = 50
        Assert.assertEquals(50,queue.getAddPointer());

        queue.display();   //display queue.

        //queue.dequeue();   //dequeue
        Assert.assertEquals(10,queue.dequeue());
        //queue.dequeue();   //dequeue
        Assert.assertEquals(20,queue.dequeue());

        queue.enqueue(20); //add num = 20
        Assert.assertEquals(20,queue.getRemovePointer());

    }
}
