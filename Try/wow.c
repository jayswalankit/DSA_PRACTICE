// Online C compiler to run C program online
#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *pointer;
};
 void add(){
          struct node a;
          a.data=1;
          a.pointer=NULL;
          
          struct node b;
          b.data=2;
          b.pointer=NULL;
          a.pointer=&b;
          
          
          struct node c;
          c.data=3;
          c.pointer=NULL;
          b.pointer=&c;
          
          
          
          struct node d;
           d.data=4;
          d.pointer=NULL;
          c.pointer=&d;
          
          struct node *tem=&a;
          int count=0;
           while(tem!=NULL){
            if(tem->data%2==0){
                printf("even: %d\n",tem->data);
            }
            else{
                printf("Odd: %d\n",tem->data);
            }
               
               tem=tem->pointer;
               count++;
               
           }
           printf("%d",count);
         
 }

 
 
 int main() {
     add();
}
    
    
