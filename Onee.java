import java.util.*;
public class Onee{
    static class queue{
  static int[]arr;
  static int size;
  static int end=-1;
  queue(int n){
    arr=new int[n];
    this.size=n;
  }
   public static boolean isEmpty(){
    return end==-1;
}
  public void enqueue(int data){
   if(end==size-1){
    System.out.println("queue is full");
    return;
   }
   end++;
   arr[end]=data;
  }

  public int dequeue(){
    if(isEmpty()){
        System.out.println("queue is empty");
        return -1;
    }
    else{
        int front =arr[0];
        for(int i=0;i<end;i++){
            arr[i]=arr[i+1];
        }
        end--;
        return front;
    }
  }

  public int peek(){
    if(isEmpty()){
        System.out.println("queue is empty");
        return -1;
    }
    else{
        return arr[0];
    }
  }
  public static void main(String[] args) {
      queue obj=new queue(end);
      obj.enqueue(1);
      obj.equals(2);
      obj.enqueue(3);
      
  }
    }

}