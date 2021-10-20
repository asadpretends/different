package StackCases;
import Assignment1.Stack.MyStack;
import org.junit.Assert;
import Assignment1.Stack.MyStack;
import org.junit.Test;

public class MyStackCases
{
    MyStack stack;
    @Test
    public void myStack() throws Exception
    {
        stack= new MyStack(5);
        stack.push(10); //push num=10
        Assert.assertEquals(10,stack.top());
        stack.push(12); //push num=12
        Assert.assertEquals(12,stack.top());
        stack.push(14); //push num=14
        Assert.assertEquals(14,stack.top());

       stack.displayStack();

        stack.push(16); //push num=16
        Assert.assertEquals(16,stack.top());
        stack.push(18); //push num=18
        Assert.assertEquals(18,stack.top());

        stack.displayStack(); //display stack.
        Assert.assertEquals(5,stack.size());


        stack.pop();          //remove topmost element
        Assert.assertEquals(16,stack.top());
        stack.displayStack(); //display stack.
        stack.pop();          //remove topmost element
        Assert.assertEquals(14,stack.top());
        stack.displayStack(); //display stack.
        stack.pop();          //remove topmost element
        Assert.assertEquals(12,stack.top());
        stack.displayStack(); //display stack.
        stack.pop();          //remove topmost element
        Assert.assertEquals(10,stack.top());
        stack.displayStack(); //display stack.
        stack.pop();          //remove topmost element
       // Assert.assertEquals(-1,stack.top());
        stack.displayStack(); //display stack.

        System.out.println("Size = "+stack.size()); //get size
    }

}
