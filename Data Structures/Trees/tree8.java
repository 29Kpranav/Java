/* 590. N-ary Tree Postorder Traversal

public class tree8 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        traversal(root);
      return list;  
    }

    public int traversal(Node root){
        if (root == null ) return 0;
            int size=root.children.size();
            
        for(int i=0;i<size;i++){
            traversal(root.children.get(i));
        }

        list.add(root.val);

        return 1;
    }
}

*/

/*
class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root==null) return res;
        for(Node node: root.children) postorder(node);
        res.add(root.val);
        return res;
    }
} 
*/