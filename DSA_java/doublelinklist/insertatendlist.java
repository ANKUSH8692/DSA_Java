import java.util.*;
public  class insertatendlist{
    static class node{
        int data;
        node next;
        node prev;
        
        node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }}
        node head=null;
        node tail=null;
        public void create(){
            int data;
            System.out.println("enter the element you want enter");
            Scanner sc=new Scanner(System.in);
            int n;
            do{
                data=sc.nextInt();
                
                node n2=new node(data);
                if(head==null){
                    head=n2;
                    tail=n2;
                }
                else{
                    tail.next=n2;
                    n2.prev=tail;
                    tail=n2;
                }
                System.out.println("do you want to enter more enter 1");
                n=sc.nextInt();
            }while(n==1);
        }
        public void display(){
            node temp=head;
            System.out.println("double \tlinklist");
            if(head==null){
                System.out.println("no linklist");
            }
            else{
                while(temp!=null){
                    System.out.println(temp.data+"\n");
                    temp=temp.next;
                }
            }
        }

    public static void main (String [] args){
        insertatendlist  a=new insertatendlist();
        a.create();
        a.display();

    }
}