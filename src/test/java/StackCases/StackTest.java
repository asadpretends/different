package StackCases;
import org.junit.Assert;
import Assignment1.Stack.Stack;
import org.junit.Test;

public class StackTest {
    Stack stack;

    @Test
    public void stackTest()
    {
        Stack stack = new Stack();

        stack.push(10); //push num=10
        Assert.assertEquals(10,stack.getAddPointer());
        stack.push(20); //push num=20
        Assert.assertEquals(20,stack.getAddPointer());
        stack.push(30); //push num=30
        Assert.assertEquals(30,stack.getAddPointer());
        stack.display();//display stack.

        stack.pop();    //pop element.
        Assert.assertEquals(20,stack.getAddPointer());
        stack.display();//display stack.
        stack.push(40); //push num=40
        Assert.assertEquals(40,stack.getAddPointer());
        stack.display();//display stack.
        stack.pop();    //pop num.
        Assert.assertEquals(20,stack.getAddPointer());
        stack.display();//display stack.
        stack.pop();    //pop element
        Assert.assertEquals(10,stack.getAddPointer());
        stack.display();//display stack
    }
}