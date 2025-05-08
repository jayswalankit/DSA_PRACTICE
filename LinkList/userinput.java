
import java.util.*;

class Node
{
    int data;
    Node address;

    Node(int data)
    {
        this.data=data;
        this.address=null;
    }
}

public class userinput {
     Node head;

     public void add(int data){

        Node obj=new Node(data);

        if(head==null)
        {
       head= obj;
        }

        else
        {
            Node tem=head;

            while(tem.address!=null)
            {
                  tem=tem.address;
            }
            tem.address=obj;
        }
     }

     public void display()
     {
        Node tem=head;
        while(tem!=null){
            System.out.println(tem.data);
            tem=tem.address;
        }
     }
     public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        userinput obj=new userinput();
        System.out.println("Enter your size");
        int size=sc.nextInt();
       
        for(int i=0;i<size;i++)
        {
            obj.add(sc.nextInt());
        }
        System.out.println("Display: ");
        obj.display();
     }
}
