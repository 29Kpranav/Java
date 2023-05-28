 

// Trees -- hierarchical Data Structure, nodes are like leaf,branch,root

/*
 Binary Tree -- At max 2 children

                1         
            2      3                here.. 1-parent/root node, 2-left child of 1, 3-right child of 1,
         4     5     6              leaf nodes are 7,8,9,5 & 6th right child is 9 & left child is null 
      7     8          9            1,2,4 are ancestors of 7
                                    2 have left subtree 7,4,8 & right subtree 5 , total leafs are 4
                                    level 1 of tree - 1 node & depth 1
                                    level 2 - 2,3 & d 2
                                    lvl 3 - 4,5,6 & d 3
                                    lvl 4 - 7,8,9 & d 4


 Build Tree Preorder
 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1

              1     
                              -1 is considered as null node
        2          3

    4      5    N     6

  N   N  N   N      N    N

 */

 //Build a Tree from its Preorder traversal


public class tree1 {

    static class Node {
 
        int data;
 
        Node left;
 
        Node right;
 
 
        Node(int data) {
 
            this.data = data;
 
            this.left = null;
 
            this.right = null;
 
        }
 
    }
 
 
    static class BinaryTree {
 
    static int idx = -1;    //Cannot make a static reference to the non-static field idx so make static 
 
        public static Node buildTree(int nodes[]) {
 
            idx++;
 
            if(nodes[idx] == -1) {
 
                return null;
 
            }
 
            Node newNode = new Node(nodes[idx]);
 
            newNode.left = buildTree(nodes);
 
            newNode.right = buildTree(nodes);
 
            return newNode;
 
        }
 
    }
 
 
    public static void main(String args[]) {
 
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
 
      //  BinaryTree tree = new BinaryTree();
 
        Node root = tree.buildTree(nodes);
 
        System.out.println(root.data);
 
    }
 
 }