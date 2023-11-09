import java.util.*;
public class Sprialmatrix {
    public static void sp(int a[][]){
        int sc=0;
        int sr=0;
        int ec=a[0].length-1;
        int er=a.length-1;
        while(sr<=er && sc<=ec){
            //top
            for(int j=sc;j<=ec;j++){
                System.out.print(a[sr][j]+" ");
            }
            // right
            for(int i=sr+1;i<=er;i++){
                System.out.print(a[i][ec]+" ");
            }
            //down
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                System.out.print(a[er][j]+" ");
            }
            for(int i=er-1;i>sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(a[i][sc]+" ");
            }
            sr++;
            sc++;
            ec--;
            er--;
        }
        System.out.println();
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int[][] a=new int[4][4];
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<4;j++){
        //         a[i][j]=sc.nextInt();
        //     }
        // }
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        sp(a);
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }

    
}
