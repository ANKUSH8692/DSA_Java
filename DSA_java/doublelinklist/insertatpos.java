import java.util.Scanner;
public class insertatpos{
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
    public void create(){
        int data,n;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter the element");
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
            System.out.println("do you want enter more enter 1");
            n=sc.nextInt();
        }while(n==1);

    }
    public void display(){
        node temp=head;
        if(head==null){
            System.out.println("no link list");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
    }
    public void pos(){
        int data,n,m;
        Scanner sc = new Scanner (System . in) ;
        node temp=head;
        node pre=head;
        do{
            System.out.println("enter the postion");
            n=sc.nextInt();
            System.out.println("enter the element");
            data=sc.nextInt();
            node n2=new node(data);
            if(n==1){
                n2.next=head;
                head.prev=n2;
                head=n2;
            }
            else{
                for(int i=0;i<n-2;i++){
                    temp=temp.next;
                    pre=pre.next;
                }
                temp=temp.next;
                pre.next=n2;
                n2.prev=pre;
                n2.next=temp;
                temp.prev=n2;
            }
            System.out.println("wnat to enter more press 1");
            m=sc.nextInt();
        }while(m==1);

    }
    public static void main(String [] args){
        insertatpos a = new insertatpos();
        a.create();
        a.display();
        a.pos();
        a.display();
    }
}
