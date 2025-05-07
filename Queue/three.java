package Queue;

import java.util.*;

public class three {

    three(int size) {
        this.size = size;
        arr = new int[size];
        noe = 0;
        start = -1;
        end = -1;
    }

    int[] arr;

    int start;// for pop
    int end;// for insert
    int size;
    int noe;

    public void push(int data) {

        if (noe == size) {
            System.out.println("queue is full");

            return;
        }
        if(noe==0){
            ++end;
            ++start;
            
        arr[end] = data;
        noe++;
        }

        else{
            end=(end+1)%size;
    
        arr[end] = data;
        noe++;
        }
    }

    public int pop() {

        if (noe == 0) {
            System.out.println("queue is empty");
            return -1;
        }

        int popped = arr[start];
        if (noe == 1) { 
            // If last element is removed, reset pointers
            start = -1;
            end = -1;
        }
        else {
            start = (start + 1) % size;
        }

        noe--;

        return popped;
    }

    public int totalno() {
        return noe;
    }

    public void display() {
        if (noe == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < noe; i++) {
            System.out.print(arr[(start + i) % size] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        three obj = new three(6);

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);

       
        
        obj.push(44);
        
        
        
        
        System.out.println(obj.totalno() + " :noe");
        obj.display();
    }

}
