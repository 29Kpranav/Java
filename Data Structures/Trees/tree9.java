 /* 
 108. Convert Sorted Array to Binary Search Tree

 public TreeNode sortedArrayToBST(int[] nums) {
	return build(nums, 0, nums.length - 1);
  }

  private TreeNode build(int[] nums, int l, int r) {
	if (l > r) {
	  return null;
	}

	int idx = l + (r - l) / 2;

	TreeNode root = new TreeNode(nums[idx]);
	root.left = build(nums, l, idx - 1);
	root.right = build(nums, idx + 1, r);

	return root;
  } 
  
  
  
  Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
*/