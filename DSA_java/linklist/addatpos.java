import java.util.*;
public class addatpos {
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
                System.out.println("\ndo you want to enter more enter 1");
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
                    System.out.print(temp.data+"-\t");
                    temp=temp.next;
                }
            }
        }
        public void insertpos(int x,int pos){
            node n2=new node(x);
            int l=0;
            node temp=head;
            node prev=head;
            if(pos==0){
                    n2.next=head;
                    head=n2;
                }
            while(temp!=null){
                if(pos==l){
                    prev.next=n2;
                    n2.next=temp;
                    return;
                }
                prev=temp;
                temp=temp.next;
                l++;
            }
            System.out.println("input is wrong");
            return ;
        }
    public static void main (String [] args){
        addatpos a=new addatpos();
        Scanner sc=new Scanner(System.in);
        a.create();
        a.display();
        System.out.println("enter the element and postion");
        int x=sc.nextInt();
        int pos=sc.nextInt();
        a.insertpos(x,pos);
        a.display();

    }
}
