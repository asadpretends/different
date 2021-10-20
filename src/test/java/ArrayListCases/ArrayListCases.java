package ArrayListCases;
import Assignment1.ArrayList.ArrayList;
import org.junit.Assert;
import org.junit.Test;
public class ArrayListCases
{
 ArrayList list = new ArrayList();
 @Test
    public void arrayList()
 {
     list.addElement(10);
     Assert.assertEquals(10,list.getElement(0));
     list.setValue(12,0);
     Assert.assertEquals(12,list.getElement(0));

     list.addElement(14);
     list.addElement(16);
     list.addElement(18);
     list.addElement(20);
     Assert.assertEquals(5, list.size());

     list.removeElement(0);
     Assert.assertEquals(14, list.getElement(0));
     list.addElement(22);
     Assert.assertEquals(5, list.size());
     list.removeElement(3);
     Assert.assertEquals(4, list.size());



 }
}
