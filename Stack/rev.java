public class rev {
    int[] stack;
    int top = -1;
    int capacity;

    rev(int size) {
        this.capacity = size;
        this.stack = new int[size];
    }

    public void push(int value) {
        if (top < capacity - 1) {
            stack[++top] = value;
        } else {
            System.out.println("Stack is full");
        }
    }

    public int size() {
        return top + 1; 
    }

    public int pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void reverse() {
        // if (top >= 0) { 
        //     for (int i = top; i >= 0; i--) {
        //         System.out.println(stack[i]);
        //     }
        // }

    for(int i=0;i<=top;i++){
        for(int j=i+1;j<=top;j++){
            int tem=stack[i];
            stack[i]=stack[j];
            stack[j]=tem;
        }
        System.out.println(stack[i]);
    }

//     int start = 0;
//     int end = top;
//     while (start < end) {
//         int temp = stack[start];
//         stack[start] = stack[end];
//         stack[end] = temp;
//         start++;
//         end--;
//     }

    
//     for (int i = 0; i <= top; i++) {
//         System.out.println(stack[i]);
// }
    
    }


    public void displayTop() {
        if (top >= 0) {
            System.out.println("Top element: " + stack[top]);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public static void main(String[] args) {
        rev obj = new rev(6);
        obj.push(1);
        obj.push(12);
        obj.push(13);
        obj.push(3);
        obj.push(4);
        obj.push(6);
       
     
        obj.reverse();
        // obj.pop();
        
        obj.displayTop();
       
        
        System.out.println("Size: " + obj.size());
    }
}