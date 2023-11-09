import java.util.*;
public class deleteatend {
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
        public void delete(){
            int n;
            node temp=head;
            node prev=head;
            Scanner sc=new Scanner(System.in);
            if(head==null){
                System.out.println("no list ");
                return ;
            }
            System.out.println("\ndo you want to delete the end node. enter 1 to delete");
            n=sc.nextInt();
            while(n==1){
                System.out.println("do you want to delete the end node. enter 1 to delete");
                n=sc.nextInt();
                while(temp.next!=null){
                    prev=temp;
                    temp=temp.next;
                }
                System.out.println("deleted element is "+temp);
                prev.next=null;
            }
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
        deleteatend a=new deleteatend();
        a.create();
        a.display();
        a.delete();
        a.display();

    }
    


}
//problem while display the element