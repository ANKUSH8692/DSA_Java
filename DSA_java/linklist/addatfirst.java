import java.util.*;
public  class addatfirst{
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
            System.out.println("enter the element you want enter");
            Scanner sc=new Scanner(System.in);
            int n;
            do{
                data=sc.nextInt();
                
                node n2=new node(data);
                if(head==null){
                    head=n2;
                }
                else{
                    n2.next=head;
                    head=n2;
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
                    System.out.println(temp.data);
                    temp=temp.next;
                }
            }
        }

    public static void main (String [] args){
        addatfirst a=new addatfirst();
        a.create();
        a.display();

    }
}