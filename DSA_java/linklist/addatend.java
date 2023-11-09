import java.util.*;
public  class addatend{
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;

        }
    }
    node head;
        public void create(){
            int data;
            node temp=head; // to find the address of the last node and link to new node
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
            System.out.println("display");
            if(head==null){
                System.out.println("no linklist");
            }
            else{
                while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }
        }

    public static void main (String [] args){
        addatend a=new addatend();
        a.create();
        a.display();

    }
}