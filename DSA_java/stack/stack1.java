import java.util.*; 

public class stack1{
    Scanner sc=new Scanner(System.in);
    int n=5;
    int c;
    int a[]=new int[n];
    int top;
    public void push(){
        
        do{
            if(top==(n-1)){
            System.out.println("overflow");
            }
            else{
                System.out.println("enter the data");
                int e=sc.nextInt();
                top=top+1;
                a[top]=e;
            }
            System.out.println("enter 1 to enter more");
            c=sc.nextInt();
        }while(c==1);
    }
    public void pop(){
        if(top==-1){
            System.out.println("underflow");
        }
        else{
            do{ System.out.println("poping");
                top--;
                System.out.println("enter 1 more delete");
                n=sc.nextInt();
            }while(n==1);
    }
}
    public void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            for (int i =top ;i>0;i--){
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String[] args){
        stack1 s=new stack1();
        s.push();
        s.pop();
        s.push();
        s.display();
    }
}