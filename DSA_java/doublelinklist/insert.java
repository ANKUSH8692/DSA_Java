import java.util.*;
public class insert {
    static class node{
        node next;
        node prev;
        int data;
        node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    node head=null;
    node tail=null;
    void create(){
        int data,m,n,p;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter the data");
            data=sc.nextInt();
            node n2=new node(data);
            if(head==null){
                head=n2;
                tail=n2;
            }
            else{ 
                System.out.println("enter your choice 1. insert at start\n 2. insert at end\n 3. insert at mid");
                m=sc.nextInt();
                switch(m){
                    case 1: n2.next=head;
                    head.prev=n2;
                    head=n2;
                    break;
                    case 2: tail.next=n2;
                    n2.prev=tail;
                    tail=n2;
                    case 3:

                }

            }
        }while(n==1);

    }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
    }
    
}
