class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class ass1 {
    TreeNode root;

    void inorderTraversal() {
        if (root == null) {
            return;
        }

        TreeNode current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.val + " ");
                current = current.right;
            } else {
                TreeNode predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                } else {
                    predecessor.right = null;
                    System.out.print(current.val + " ");
                    current = current.right;
                }
            }
        }
    }

    void preorderTraversal() {
        if (root == null) {
            return;
        }

        TreeNode current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.val + " ");
                current = current.right;
            } else {
                TreeNode predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    System.out.print(current.val + " ");
                    predecessor.right = current;
                    current = current.left;
                } else {
                    predecessor.right = null;
                    current = current.right;
                }
            }
        }
    }

    void postorderTraversal() {
        if (root == null) {
            return;
        }

        TreeNode dummy = new TreeNode(-1);
        dummy.left = root;
        TreeNode current = dummy;
        while (current != null) {
            if (current.left == null) {
                current = current.right;
            } else {
                TreeNode predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                } else {
                    reversePrint(current.left, predecessor);
                    predecessor.right = null;
                    current = current.right;
                }
            }
        }
    }

    void reversePrint(TreeNode from, TreeNode to) {
        reverse(from, to);
        TreeNode current = to;
        while (true) {
            System.out.print(current.val + " ");
            if (current == from) {
                break;
            }
            current = current.right;
        }
        reverse(to, from);
    }

    void reverse(TreeNode from, TreeNode to) {
        if (from == to) {
            return;
        }
        TreeNode x = from;
        TreeNode y = from.right;
        TreeNode z;
        while (x != to) {
            z = y.right;
            y.right = x;
            x = y;
            y = z;
        }
    }


    public static void main(String[] args) {
        ass1 tree = new ass1();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Inorder traversal: ");
        tree.inorderTraversal();
        System.out.println("\nPreorder traversal: ");
        tree.preorderTraversal();
        System.out.println("\nPostorder traversal: ");
        tree.postorderTraversal();
    }
}

