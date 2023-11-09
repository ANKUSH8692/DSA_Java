import java.util.*;
public class deletenode  {
    
    static class node{
        int data;
        node next;
        node head;
        node(int data){
            this.data=data;
            this.next=null;

        }
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
        public void deleten(int x){
            int l=1;
            node temp=head;
            node prev=head;
            while(temp!=null){
                if(temp.data==x){
                    prev.next=temp.next;
                    System.out.println("the element deleted is . "+temp.data+"\tpos."+l);
                    return;
                }
                prev=temp;
                temp=temp.next;
                l++;
            }
            System.out.println("input is wrong");
            return ;
        }
    }
    public static void main (String [] args){
        node a=new node(10);
        Scanner sc=new Scanner(System.in);
        a.create();
        a.display();
        System.out.println("enter the element ");
        int x=sc.nextInt();
        a.deleten(x);
        a.display();

    }
}



