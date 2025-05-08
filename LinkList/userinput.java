
import java.util.*;

class Node{
    int data;
    Node address;

    Node(int data){
        this.data=data;
        this.address=null;
    }
}

public class userinput {
     Node head;

     public void add(int data){
        Node obj=new Node(data);
        if(head==null){
       head= obj;
        }
        else{
            Node tem=head;

            while(tem.address!=null){
                  tem=tem.address;
            }
            tem.address=obj;
        }
     }
}
