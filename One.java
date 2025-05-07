
import java.util.*;

public class One {

   
    int[] stack=new int[9]; 
    int top = -1;
    int capacity;

    



    public void push(int value) {
        if (top >= stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int popValue = stack[top--];
            System.out.println("Popped: " + popValue);
            return popValue;
        }
    }

    public int size() {
        return top+1; 
    }
    public void displaytop(){
        System.out.println("top element: "+stack[top]);
   
    }

    public static void main(String[] args) {
        One obj = new One();
        
        obj.push(5);
        obj.push(10);
        obj.push(1);
        obj.push(12);
        obj.push(13);
        obj.push(15);
        obj.push(18);
        obj.push(9);
        obj.push(67);
       

        obj.pop();
        obj.pop();
        obj.push(1);
        obj.push(105);
        System.out.println("Size: " + obj.size());
       obj.displaytop();
    }
}