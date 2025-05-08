import java.util.*;

public class reverse{
int []queue;
int size;
int start;
int end;
int noe;

reverse(int size){
    this.size=size;
    this.queue=new int[size];
    this.start=0;
    this.end=-1;
    this.noe=0;
}

public void enqueue(int data){
    if(noe==size){
        System.out.println("Queue is full");
    }
    else{
        end=(end+1)%size;
        queue[end]=data;
        noe++;
    }
}

public int dequeue(){
  if(noe==0){
    System.out.println("Queue is empty");
    return -1;
  }
  else{
    int dequeued_data=queue[start];
    start=(start+1)%size;
    noe--;
    return dequeued_data;
  }
}

public int size1(){
    return noe;
}

public void rev(){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of element you want to reverse");

    int k=sc.nextInt();
    
    for(int i=0;i<k;i++){
        for(int j=i+1;j<k;j++){
            int tem=queue[i];
            queue[i]=queue[j];
            queue[j]=tem;
        }

    }

   for(int i=1;i<=end;i++){
    System.out.println(queue[i]);
   }

}
  public static void main(String[] args) {
    reverse obj=new reverse(6);
    obj.enqueue(1);
    obj.enqueue(2);
    obj.enqueue(3);
    obj.enqueue(4);
    obj.enqueue(5); 
    obj.enqueue(6);   

    System.out.println("size: "+obj.size1());

    obj.rev();
  }

}