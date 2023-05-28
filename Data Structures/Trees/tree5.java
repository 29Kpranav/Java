 

/*
 Binary Search Tree

 Left Subtree Nodes < Root                                       e.g.             4
 Right Subtree Nodes > Root                                                    
 Left & RightSubtrees are also BST with no duplicates                         2        5
 Inorder Traversal of BST gives a sorted sequence                  
 BST makes search efficient O(height of tree)                               1   3        6
 
 Most problems will be solved using recursion i.e. by dividing into subproblems & making recursive calls on subtrees
 */

// Build a BST                               5
// values[] = 5,1,3,4,2,7              1          7
//                                         3
//                                      2     4

public class tree5 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        }else {
            root.right = insert(root.right,val);
        }
        return root;
    } 
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key){ //O(H)
        if(root == null){
            return false;
        }
        if(root.data > key){  //left subtree
            return search(root.left, key);
        }else if(root.data == key){
            return true;
        }else{
            return search(root.right, key);
        }
        
    }
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null; 

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if(search(root, 1)){
            System.out.println("found");
        }else {
            System.out.println("Not found");
        }
}    
}
