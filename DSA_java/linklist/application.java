public class application {
    public static void main(String[] args) {
        // Create the first node with an array of integers
        Node intNode = new Node(new int[]{1, 2, 3});
        
        // Create the second node with an array of characters
        Node charNode = new Node(new char[]{'A', 'B', 'C'});
        
        // Create the third node with an array of floating-point numbers
        Node floatNode = new Node(new float[]{1.1f, 2.2f, 3.3f});
        
        // Connect the nodes
        intNode.next = charNode;
        charNode.next = floatNode;
        
        // Print the linked list
        Node currentNode = intNode;
        while (currentNode != null) {
            if (currentNode.data instanceof int[]) {
                int[] intArray = (int[]) currentNode.data;
                System.out.print("Node of Integers: ");
                for (int num : intArray) {
                    System.out.print(num + " ");
                }
            } else if (currentNode.data instanceof char[]) {
                char[] charArray = (char[]) currentNode.data;
                System.out.print("Node of Characters: ");
                for (char c : charArray) {
                    System.out.print(c + " ");
                }
            } else if (currentNode.data instanceof float[]) {
                float[] floatArray = (float[]) currentNode.data;
                System.out.print("Node of Floats: ");
                for (float num : floatArray) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            currentNode = currentNode.next;
        }
    }
}

 

class Node {
    Object data;
    Node next;

 

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}