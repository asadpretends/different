package ArrayCases;
import Assignment1.Arrays.Array;
import org.junit.Assert;
import org.junit.Test;

public class FullArrayTesting
{
    Array object = new Array();

    @Test
    public void fullArrayTest()
    {
        object.insert(5,0);
        object.insert(2,1);
        object.insert(10,2);
        object.insert(3,3);
        object.insert(4,4);
        object.insert(6,5);
        object.insert(7,6);

        Assert.assertTrue(object.linearSearch(5));
        Assert.assertTrue(object.binarySearch(5,0,10 ));
        object.delete(5);
        Assert.assertFalse(object.linearSearch(6));
        object.bubbleSort();

        Assert.assertEquals(2,object.array[0]);
        Assert.assertEquals(3,object.array[1]);
        Assert.assertEquals(4,object.array[2]);
        Assert.assertEquals(5,object.array[3]);
        Assert.assertEquals(7,object.array[4]);


    }


}