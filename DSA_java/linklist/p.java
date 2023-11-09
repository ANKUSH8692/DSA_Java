import java.util.*;
public  class p{
    static class node{
        int data;
        node next;
        
        node(int data){
            this.data=data;
            this.next=null;

        }}
        node head=null;
        node tail=null;
        public void create(){
            int data;
            node temp=null;
            System.out.println("enter the element you want enter");
            Scanner sc=new Scanner(System.in);
            int n;
            do{
                data=sc.nextInt();
                
                node n2=new node(data);
                if(head==null){
                    head=n2;
                    temp=head;
                    tail=n2;
                }
                else{
                    temp.next=n2;
                    temp=temp.next;
                    tail=temp;
                }
                System.out.println("do you want to enter more enter 1");
                n=sc.nextInt();
            }while(n==1);
        }
        public void display(){
            node temp=head;
            if(head==null){
                System.out.println("no linklist");
            }
            else{
                while(temp!=null){
                    System.out.println("array"+temp.data);
                    temp=temp.next;
                }
                
            }
        }
        public void reverse(){
            node temp=null;
            node prev=null;
            
            
        }

    public static void main (String [] args){
        p a=new p();
        a.create();
        a.display();
        a.reverse();
        a.display();

    }
}