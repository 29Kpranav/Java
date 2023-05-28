public class preAndsucc {
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
    static class Res{
        Node pre = null;
        Node succ = null;
    }
    public static Res findPresuc(Node root, Res x, int key){
        if(root == null){
            return null;
        }
        if(root.data == key){
            if(root.left != null){
                Node temp = root.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                x.pre = temp;
            }
                if(root.right != null){
                    Node temp = root.right;
                    while(temp.left != null){
                        temp = temp.left;
                    }
                    x.succ = temp;
                }
                return null;
        }
        if(root.data > key){
            x.succ = root;
            findPresuc(root.left, x, key);
        }else {
            x.pre = root;
            findPresuc(root.right, x, key);
        }
        return x;
    }   
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 14};
        Node root = null; 

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        Res x = new Res();
        Res v = findPresuc(root, x, 4);
         
        System.out.println(v.pre + " " + v.succ);
    }
}
