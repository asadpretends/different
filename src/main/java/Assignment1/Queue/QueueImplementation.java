package Assignment1.Queue;//Program to implement QueueImplementation using array.

import java.lang.Exception;
public class QueueImplementation{
    int addPointer; //points to the position where new number is to be added.
    int removePointer; //points tot position of the element, which is to be deleted. 
    int sizeofQueue;   //number of elements in the queue.
    int [] array;      //array to store values.

    public QueueImplementation(int size){
        addPointer=0;
        removePointer=0;
        sizeofQueue=0;
        array=new int[size+1]; //because addPointer and removePointer cannot point at same index,so in order to create a buffer i.e space of one box or index between them.
    }

    //function to add elements into the queue.
    public void enqueue(int number) throws Exception{
        System.out.println("Inserting : " + number);
        //if addPointer point at last position so we have to check whether removePointer points at 0 position or not before adding an element at the last position,to maintain a space between the pointers.
        if(addPointer==array.length-1){
            if(addPointer+1-array.length==removePointer){
                throw new Exception("Cannot enqueue, QueueImplementation is full");
            }
            array[addPointer]=number;
            sizeofQueue++;
            addPointer=0;
        }
        else{
            if(addPointer+1==removePointer){
                throw new Exception("Cannot enqueue, QueueImplementation is full");
            }
            array[addPointer]=number;
            sizeofQueue++;
            addPointer++;
        }
    }

    //function to delete elements from the queue.
    public int dequeue() throws Exception{
        System.out.println("Dequeue Operation.");
        if(sizeofQueue==0){
            throw new Exception("Cannot remove, QueueImplementation is Empty");
        }
        if(removePointer==array.length-1){
            removePointer=0;
        }
        sizeofQueue--;
        removePointer++;
        return array[removePointer-1];
    }

    //function to check is queue empty?
    public boolean empty(){
        if(sizeofQueue==0){
            return true;
        }
        return false;
    }

    //function to ge the size of the array.
    public int size(){
        return sizeofQueue;
    }
public int getAddPointer()
{
    int newQueuePointer = addPointer;
    return array[--newQueuePointer];
}
    public int getRemovePointer()
    {
        int newqueuePointer = removePointer;
        return array[--newqueuePointer];
    }
    //function to display the queue.
    public void display(){
        if(sizeofQueue==0){
            System.out.println("Empty QueueImplementation.");
            return;
        }
        System.out.print("QueueImplementation : ");
        for(int i=removePointer; i<(sizeofQueue+removePointer);i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
/*//Program to implement the created Queue.
public class QueueImplementation{
    public static void main(String [] args){
        Queue queue = new Queue(5); //create queue of size=5.
        try{
            System.out.println("Is Queue empty? : " + queue.empty());

            queue.enqueue(10);
            queue.enqueue(12);
            queue.enqueue(14);
            queue.enqueue(16);
            queue.enqueue(18);

            queue.display();

            System.out.println("Size of Queue : " + queue.size());

            queue.dequeue();
            queue.dequeue();

            queue.display();


            System.out.println("Size of Queue : " + queue.size());

            queue.enqueue(20);

            System.out.println("Is Queue empty? : " + queue.empty());

            System.out.println("Size of Queue : " + queue.size());

            queue.dequeue();
            queue.dequeue();

            queue.display();

            queue.dequeue();
            queue.dequeue();

            queue.display();

            System.out.println("Size of Queue : " + queue.size());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}*/

