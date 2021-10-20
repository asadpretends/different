package StackCases;
import Assignment1.Stack.StackLinkedList;
import org.junit.Assert;
import org.junit.Test;
public class StackLinkedListCases
{
    StackLinkedList stack;
    @Test
    public void stackList()
    {
        stack= new StackLinkedList();
        stack.push(10);            //push num = 10
        Assert.assertEquals(10,stack.top());
        stack.push(20);            //push num = 20
        Assert.assertEquals(20,stack.top());
        stack.push(30);            //push num = 30
        Assert.assertEquals(30,stack.top());

        stack.display();           //display stack.
        stack.top();

        stack.pop();               //pop topmost element
        Assert.assertEquals(20,stack.top());
        stack.pop();               //pop topmost element
        Assert.assertEquals(10,stack.top());
        stack.display();           //display stack.
        stack.pop();               //pop topmost element
        stack.display();           //display stack.
    }
}
