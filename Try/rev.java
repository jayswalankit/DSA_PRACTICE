public class rev {
    int [] stack;
    int top;
    int capacity;
    
    public rev(int size){
      this.  stack = new int[size];
      this.  capacity = size;
        top=-1;
    }

    public void push(int value) {
        if (top < capacity-1 ) {
            stack[++top] = value;
        } else {
            System.out.println("Stack Overflow! Cannot push " + value);
        }

    }

    public void rev1(){
     for(int i=0;i<=top;i++){
        for(int j=i+1;j<=top;j++){
            int temp = stack[i];
            stack[i] = stack[j];
            stack[j] = temp;
        }
        System.out.println(stack[i]);
       
      
     }

     System.out.println("size"+capacity);
    // System.out.println(top);
    System.out.println("top"+stack[top]);
    // while(top>= 0){
    //     System.out.println(stack[top--]);
        
    // }
    }
    
    public static void main(String[] args) {
        rev obj = new rev(5);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6); // This should trigger stack overflow
      
        obj.rev1();
        System.out.println(obj.top);
}
}
