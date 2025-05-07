import java.util.*;

public class Twoo {

    int[]arr;

       int start;// for pop
       int end;// for insert
       int size;
       int noe;

Twoo(int size){
 this.size=size;
 arr=new int[size];
 noe=0;
 start=0;
 end=-1;
}

       public void push(int data){

        if(noe==size){
            System.out.println("queue is full");
        }

       end=(end+1)%size;
       arr[end]=data;
       noe++;
       }


       public int pop(){

        if(noe==0){
            System.out.println("queue is empty");
            return -1;
        }

        int popped=arr[start];
       start=(start+1)%size;
       noe--;

       return popped;
       }

       public int totalno(){
        return noe; 
       }

       public static void main(String[] args) {

          Twoo obj=new Twoo(6);

          obj.push(1);
          obj.push(2);
          obj.push(3);
          obj.push(4);
          obj.push(5);
          obj.push(6);
        
        System.out.println("poped element: "+obj.pop());
        System.out.println("poped element: "+obj.pop());
        System.out.println("poped element: "+obj.pop());
        System.out.println("poped element: "+obj.pop());
        System.out.println("poped element: "+obj.pop());
        System.out.println("poped element: "+obj.pop());

        obj.push(7);
          
          System.out.println(obj.totalno()+" :noe");
       }
       
       }

      








