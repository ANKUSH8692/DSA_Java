import java.util.Scanner;

import javax.swing.tree.TreeNode;
// create binary tree without reccursive
////
////
    class node{
        int data;
        node right,left;
        node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    class p1{
        static node create(){
            int data;
            node root=null;
            Scanner sc=new Scanner(System.in);
            data=sc.nextInt();
            if(data==-1){
                return null;
            }
            root=new node(data);
            System.out.println("enter the left child"+root.data);
            root.left=create();
            System.out.println("enter the right child for"+root.data);
            root.right=create();
            return root;
        }

        ///without recussive and collection package

       static void inorder(node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        node current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.data + " ");
                current = current.right;
            } else {
                node temp = current.left;
                while (temp.right != null && temp.right != current) {
                    temp = temp.right;
                }if (temp.right == null) {
                    temp.right = current;
                    current = current.left;
                } else {
                    temp.right = null;
                    System.out.print(current.data + " ");
                    current = current.right;
                }
            }
        }
    }
    //recurssive
    static void inorder2(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String []args){
        node root=create();
        System.out.println("inorder");
        inorder(root);
        System.out.println("2nd method");
        inorder2(root);
    }
}

