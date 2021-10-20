package ArrayCases;

import Assignment1.Arrays.ArrayDeletion;
import org.junit.Assert;
import org.junit.Test;


public class ArrayDeletionTesting {
    ArrayDeletion object = new ArrayDeletion();
    //int [] array;
    int [] expected = {1,6,34,0,2,43};
   /* @Before
    public void first()
    {
        object = new ArrayDeletion();


    }*/
    @Test
    public void arrayDelete()
    {
        expected = object.delete(expected, 3);
        Assert.assertEquals(1, expected[0]);
        Assert.assertEquals(6, expected[1]);
        Assert.assertEquals(34, expected[2]);
        Assert.assertEquals(2, expected[3]);
        Assert.assertEquals(43, expected[4]);
        Assert.assertEquals(-1, expected[5]);

        }

}

