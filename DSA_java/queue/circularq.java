import java.util.*;
public class circularq{
    int f=-1,r=-1,n=5;
    int q[]=new int[n];
    void enqueue(){
        Scanner sc=new Scanner(System.in);
        if(f==(r+1)%n){
            System.out.println("overflow");
        }
        else{
            System.out.println("enter the ele");
            int i=sc.nextInt();
            if(r==-1 & f==-1){
                f=0;
                r=0;
                q[r]=i;
            }
            else{
                r=(r+1)%n;

                q[r]=i;
            }
        }
    }
    void dequeu(){
        if(r==-1 &f==-1){
            System.out.println("underflow");
        }
        else{
            f=f+1;

        }
    }
    void display(){
        System.out.println("ele are");
        for(int i=f;i<=r;i++){
            System.out.println(q[i]);
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        circularq c=new circularq();
        int l,d;
        do{
            System.out.println("enter 1 enqueue");
            System.out.println("enter 2 to dequeue");
            System.out.println("enter your choice");
            System.out.println("enter 3 display");
            d=sc.nextInt();
            switch(d){
                case 1: c.enqueue();
                break;
                case 2:c.dequeu();
                break;
                case 3:c.display();
                break;
                default:System.out.println("wrong input");
                break;
            }
            System.out.println("enter any key exit");
            l=sc.nextInt();
        }while(l==1);
        System.out.println("completed");
    }
}