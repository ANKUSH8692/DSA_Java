import java.util.*;
public class doublequeue{
    int f=-1,r=-1,n=6,c;
    int q[]=new int[n];
    void enqueue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter choice from start press 1 \t at end 2");
        c=sc.nextInt();
        if(f==(r+1)%5){
            System.out.println("overflow");
        }
        else{
            System.out.println("enter the ele");
            int i=sc.nextInt();
            if(c==1){
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
            else{
                if(c==2){
                    r=r+1;
                    q[r]=i;
                }
                else{
                    System.out.println("wrong input");
                }
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
        for(int i=f;i<=r;i++)
        // for (Integer element : q) {
        //     System.out.println(element);
        // }
        {
            System.out.println(q[i]);
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        doublequeue c=new doublequeue();
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