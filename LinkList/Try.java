class Node{
    int data;
    Node address;

    public Node(int data){
        this.data=data;
        this.address=null;
    }
}

public  class Try{
   Node head;
   public void add(int data){
    Node obj=new Node(data);
  if(head==null){
    head=obj;
  }
  else{
    Node tem=head;
    while(tem.address!=null){
       tem= tem.address;
    }
    tem.address=obj;
    
  }
   }

   public void dissplay(){
    Node tem=head;
    while(tem!=null){
        System.out.println("Data: "+tem.data);
        tem=tem.address;
    }
   }

   public static void main(String[] args) {
    Try obj1=new Try();

    obj1.add(1);
    obj1.add(2);
    obj1.add(3);
    obj1.add(4);

    obj1.dissplay();

   
   }
}











