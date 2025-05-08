
#include <stdio.h> 
#include <stdlib.h> 


struct node
{
   int num;
   struct node *pointer;
};

int main(){
    struct  node a;
    a.num=1;
    a.pointer=NULL;


    struct node b;
    b.num=2;
    b.pointer=NULL;
    a.pointer=&b;


    struct node c;
    c.num=3;
    c.pointer=NULL;
    b.pointer=&c;

    struct node d;
    d.num=4;
    d.pointer=NULL;
    c.pointer=&d;

    struct node * tem=&a;

    while(tem!=NULL){
        printf("%d",tem->num);
        tem=tem->pointer;
    }

}
