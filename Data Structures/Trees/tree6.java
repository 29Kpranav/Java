 
 // BST Delete a Node

/*Cases -

 1) No child(Leaf Node)

 2) One child

 3) Two Chldren - Replace with inorder successor(in Bst left most in right subtree) 
                  & delete the node for inorder successor
 */
import java.util.*;
public class tree6 {
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
    public static Node delete(Node root, int val){

        if(root.data > val){
            root.left = delete(root.left, val);
        }else if(root.data < val){
            root.right = delete(root.right, val);

        }else { //root.data == val
             
            // case 1
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3
            Node IS = inorderSuccessor(root.right);    // replace deleted node with right of left most node..    so 1 2 3 4 5 6 , 4 deleted --> 1 2 3 5 6
            root.data = IS.data;                       // tuzi atma mazyat
              delete(root.right, IS.data);
        }

        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
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
    public static void main(String[] args){
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null; 

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        
        inorder(root);
        System.out.println();

        delete(root, 4);
        inorder(root);
    }
}
