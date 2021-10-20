package Assignment1.ArrayList;

//Program to implement ArrayList i.e Dynamic Array.
public class ArrayList{
    int [] array; //array
    int numofElements; //number of elements in the array.
    int addPointer; //pointer points to the position where new number will be added.

    public ArrayList(){
        array = new int[4]; //initial size of the array = 4
        numofElements=0;
        addPointer=0;
    }

    //function to access elements at a given position.
    public int getElement(int index){
        return array[index];
    }

    //funciton to change the value of the element at the given position
    public void setValue(int value, int index){
        array[index]=value;
    }

    //function to add element in the array.
    public void addElement(int number){
        //If array is full, then create new array of twice the size and copy elements from previous array to the new array.
        if(addPointer>array.length-1){
            int [] newArray = new int[2*array.length];
            for(int i=0;i<array.length;i++){
                newArray[i]=array[i];
            }
            array=newArray;
            array[addPointer]=number;
            addPointer++;
            numofElements++;
            newArray=null;
        }
        else{
            array[addPointer]=number;
            addPointer++;
            numofElements++;
        }
    }

    //function to remove element from the array.
    public void removeElement(int index){
        if(addPointer==0){
            System.out.println("Empty Array");
            return;
        }
        for(int i=index;i<numofElements-1;i++){
            array[i]=array[i+1];
        }
        numofElements--;
        addPointer--;
    }

    //function to get the number of elements in the array.
    public int size(){
        return numofElements;
    }

}
//Use of the ArrayList.
/*
public class ArrayListImplementation{
    public static void main(String [] args){
        ArrayList list = new ArrayList(); //create ArrayList.

        list.addElement(10); //add num=10 to the ArrayList.
        System.out.println("Element at pos" + 0 + "=" + list.getElement(0)); //print element at pos=0.

        list.setValue(12,0); //change value of the element at pos=0.
        System.out.println("Element at pos" + 0 + "=" + list.getElement(0)); //print the value of the element at pos=0.

        list.addElement(14); //add num=14 to the ArrayList.
        list.addElement(16); //add num=16 to the ArrayList.
        list.addElement(18); //add num=18 to the ArrayList.
        list.addElement(20); //add num=20 to the ArrayList.

        System.out.println("Size = " + list.size()); //print the num of elements in the ArrayList.

        list.removeElement(0); //remove the element at pos=0.
        list.addElement(22); //add num=22 to the ArrayList.
        list.removeElement(3); //remove element at pos=3.

        System.out.println("Size = " + list.size());

        //print entire ArrayList.
        System.out.println("ArrayList: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.getElement(i) + " ");
        }
        System.out.println();
    }
}*/
