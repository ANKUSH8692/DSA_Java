import java.util.*;
public  class reverselinklist{
    static class node{
        int data;
        node next;
        
        node(int data){
            this.data=data;
            this.next=null;

        }}
        node head=null;
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
                }
                else{
                    temp.next=n2;
                    temp=temp.next;
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
            node prev=null;
            node temp=head;
            node ptr=head;
            while(head.next!=null){
                head=head.next;
            }
            while(ptr!=null){
                ptr=temp.next;
                temp.next=prev;
                prev=temp;
                temp=ptr;

            }
        }

    public static void main (String [] args){
        reverselinklist a=new reverselinklist();
        a.create();
        a.reverse();
        a.display();

    }
}