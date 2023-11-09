import java.util.Scanner;

    class node{
        int data;
        node right,left;
        node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    class tree_create{
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
        
    public static void main(String []args){
        node root=create();
        System.out.println("inorder");
        inorder(root);
        System.out.println("postorder");
        postorder(root);
        System.out.println("preorder");
        preorder(root);

    }
}
