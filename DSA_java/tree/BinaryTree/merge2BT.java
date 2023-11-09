import java.util.*;

    class node{
        int data;
        node right,left;
        node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    class merge2BT{
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
    static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    static node merge(node root,node root2){
        if(root ==null && root2==null){
            return null;
        }
        if(root==null){
            return root2;
        }
        if(root2==null){
            return root;
        }
        node temp=new node(root.data+root2.data);
        temp.left=merge(root.left,root2.left);
        temp.right=merge(root.right,root2.right);
        return temp;
    }
    
        
    public static void main(String []args){
        node root=create();
        node root2=create();
        System.out.println("postorder");
        postorder(root);
        System.out.println("preorder");
        preorder(root);
        System.out.println("level order ");
        node root3= merge(root,root2);
        System.out.println("inorder");
        inorder(root3);

    }
}