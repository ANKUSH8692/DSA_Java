import java.util.*;
public class delete {

    static class node{
        int data;
        node next;
        node head;
        node(int data){
            this.data=data;
            this.next=null;

        }}
        node head;
        public void create(){
            int data;
            node temp=head;
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
        public void deletenode(){
            int n,m;
            node temp=head;
            node prev=head;
            Scanner sc=new Scanner(System.in);

            do{
                System.out.println("enter where you want to delete 1.start\n 2.end\n 3.middle");
                m=sc.nextInt();
                if(head==null){
                    System.out.println("no list ");
                    return ;
                }
                switch (m){
                    case 1: System.out.println("deleted from start");
                    head=head.next;
                    temp=temp.next;
                    break;
    
                    case 2: System.out.println("deleted from last");
                    while(temp.next!=null){
                        prev=temp;
                        temp=temp.next;
                    }
                    prev.next=null;
                    break;
    
                    case 3:System.out.println("deleted from position");
                    System.out.println("enter the position");
                    int x=sc.nextInt();
                    for(int i=0;i<=x-2;i++){
                          prev=temp;
                          temp=temp.next;
                    }
                    prev.next=prev.next.next;
                    break;
                    default:System.out.println("wrong input ");
                    break;
                }
                System.out.println("you want to delete more enter 1");
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
                    System.out.print(temp.data+"-\t");
                    temp=temp.next;
                }
            }
        }

    
    public static void main (String [] args){
        delete a=new delete();
        a.create();
        a.display();
        a.deletenode();
        a.display();

    }
    
}

