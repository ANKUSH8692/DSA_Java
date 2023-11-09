import java.util.*;
class linearsearch{
    public static void Lsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("key found at index"+i);
                return ;
            }
        }
        System.out.println("key not found");

    }
    public static  void main(String[] args){
        System.out.println("enter the length of the array");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("enter the element to find");
        int key=sc.nextInt();
        Lsearch(arr,key);
    }
}