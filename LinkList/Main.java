
import java.util.*;
class Node {
 int data;
 Node next;

 public Node(int data){
    this.data=data;
    this.next=null;
 }

}

  class linklist{
    Node head;
     int sum=0;
    public void add(int data){
      Node newNode=new Node(data);

      if(head==null){
        head=newNode;
      }
      else{
        Node tem=head;
        while(tem.next!=null){
            tem=tem.next;
        }
        tem.next=newNode;

      }
    }

    public void display(){
      int count=0;
        Node tem=head;
        while(tem!=null){
          System.out.println(tem.data + " ");
          tem=tem.next;
          count++;
        }
        System.out.println("Count: "+count++);
    }

  public void odd_even(){
    Node tem=head;
    int even_sum=0;
    while(tem!=null){
      if(tem.data%2==0){
        System.out.print(" Even No: "+ tem.data );
        
        even_sum+=tem.data;
        
      }
    
      else{
      
        System.out.print("Odd No: "+ tem.data );
      }
      tem=tem.next;
      
    
    }
    System.out.println("\nsum 0f even: "+even_sum);
  }

 }
    public class Main {
        public static void main(String[] args) {
            linklist list = new linklist();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
    
            System.out.print("Linked List :\n ");
            list.display();
            System.out.println("giving odd or even no");
            list.odd_even();

        }
    
}
