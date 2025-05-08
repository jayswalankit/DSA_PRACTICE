import java.util.*;

class Node {
    int data;
    Node pointer;

    Node(int data) {
        this.data = data;
        this.pointer = null;
    }
}

public class ArrayLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter your elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

      
        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.pointer = new Node(arr[i]);
            temp = temp.pointer;
        }

   
        temp = head;
        System.out.println("Linked List Elements:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.pointer;
        }

        sc.close();
    }
}