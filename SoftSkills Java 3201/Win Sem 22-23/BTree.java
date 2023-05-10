import java.util.Scanner;

class Node{
    Node left, right;
    int data;

    public Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BTree {
    static Scanner op = new Scanner(System.in);
    public static void main(String[] args){
        
        Node root = createTree();

        // Inorder - L N R  
        inorder(root); System.out.println();
        // Preorder - N L R
        preorder(root); System.out.println();
        // Postorder - L R N
        postorder(root); System.out.println();
    }

    // Method to create Tree and return the root node
    static Node createTree(){
        Node root = null;
        System.out.println("Enter the Data : ");
        int data = op.nextInt();

        if(data == -1) return null ;

        root = new Node(data);
        System.out.println("Enter left for "+data);
        root.left = createTree();
        System.out.println("Enter right for "+data);
        root.right = createTree();

        return root;
    }

    static void inorder(Node root){
        if(root==null) return ;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    static void preorder(Node root){
        if(root==null) return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root){
        if(root==null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
}

