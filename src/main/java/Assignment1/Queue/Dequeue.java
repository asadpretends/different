package Assignment1.Queue;

//Program to implement Dequeue i.e Double sided queue.
public class Dequeue{
    int rightPointer; //points to position in the "LEFT" where new element can be inserted.
    int leftPointer;  //points to position in the "RIGHT" where new element can be inserted.
    int capacity;     //max number of elements.
    int size;         //number of element in the queue.
    int [] array;     //array  to store data values.

    public Dequeue(int length){
        array=new int[length];
        size=0;
        rightPointer=-1;
        leftPointer=length;
        capacity=length;
    }

    //function to add elements in the left.
    public void addLeft(int data){
        System.out.println("Inserting data in the left  : " + data);
        if(rightPointer+1==leftPointer){
            return;
        }
        if(rightPointer==capacity-1){
            if(leftPointer==0){
                return;
            }
            else{
                rightPointer=0;
                array[rightPointer]=data;
            }
        }

        rightPointer++;
        array[rightPointer]=data;
    }

    //function to add elements in the right.
    public void addRight(int data){
        System.out.println("Inserting data in the right : " + data);
        if(leftPointer-1==rightPointer){
            return;
        }
        if(leftPointer==0){
            if(rightPointer==capacity-1){
                return;
            }
            else{
                leftPointer=capacity-1;
                array[leftPointer]=data;
            }
        }
        leftPointer--;
        array[leftPointer]=data;
    }
    public int getLeftPointer()
    {
        int newleftpointer = leftPointer;
        return array[--newleftpointer];
    }
    public int getRightPointer()
    {
        int newrightpointer = rightPointer;
        return array[--newrightpointer];
    }

    //function to display the queue.
    public void display(){
        System.out.print("DeQueue : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

/*//Program to execute Dequeue.
public class DequeueImplementation{
    public static void main(String [] args){
        Dequeue queue = new Dequeue(5);
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
    }
}*/