/*
Subtree of another tree

 public boolean isIdentical(TreeNode root,TreeNode subRoot){

       if(subRoot == null && root == null){

           return true;

       }

       if(root == null || subRoot == null){

           return false;

       }

       if(root.val == subRoot.val){

           return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);

       }

       return false;

   }

 

   public boolean isSubtree(TreeNode root, TreeNode subRoot) {

       if(subRoot == null){

           return true;

       }

       if(root == null){

           return false;

       }

       if(isIdentical(root, subRoot)){

           return true;

       }

       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

   }
 */



 /*MIN DEPTH
  
 class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int x = minDepth(root.left);
        int y = minDepth(root.right);
         
        
        if(x==0 || y==0){
          return x+y+1;
        }else{
           return Math.min(x, y) + 1;
        }
         
    }
}
  */



  /* Symmetric Tree
  
  public boolean isSymmetric(TreeNode root) {
    return root==null || isSymmetricHelp(root.left, root.right);
}

private boolean isSymmetricHelp(TreeNode left, TreeNode right){
    if(left==null || right==null)
        return left==right;
    if(left.val!=right.val)
        return false;
    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
} */