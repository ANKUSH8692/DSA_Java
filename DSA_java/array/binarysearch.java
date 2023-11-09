import java.util.Scanner;

public class binarysearch {
    public static void Bsearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println("key found at"+mid);
                return;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
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
        Bsearch(arr,key);
    }
}   

