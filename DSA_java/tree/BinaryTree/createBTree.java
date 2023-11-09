public class createBTree{
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    int index=-1;
    public Node Add(int node[]){
        index++;
        if(node[index]==-1){
            return null;
        }
        Node newnode=new Node(node[index]);
        newnode.left=Add(node);
        newnode.right=Add(node);
            
        return newnode;
    }
    //time complexity is O(n)
    public void preorder(Node root){
        if(root==null){
            return ;
        }
        
        preorder(root.left);
        preorder(root.right);
        System.out.println(root.data);
    }
    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args){
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        createBTree tree = new createBTree();
        Node root=tree.Add(node);
        System.out.println("root node"+root.data);
        System.out.println("preorder");
        tree.preorder(root);
        System.out.println("inorder");
        tree.inorder(root);
        System.out.println("postorder");
        tree.postorder(root);
    }
}