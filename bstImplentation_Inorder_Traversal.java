package interview;



import java.util.Stack;

public class TreeNode{
	int val;
	TreeNode left, right;
	public TreeNode(int val) {
		this.val = val;
		left = right = null;
	}
	
	
	
}
 class bstImplentation_Inorder_Traversal {

	 TreeNode root;
	 void inorder() {
		 if (root == null)
			 return;
		 
		 Stack<TreeNode> s = new Stack<TreeNode>();
		 TreeNode curr = root;
	 
		 while(curr != null || s.size() >0) {
			 s.push(curr);
			 curr = curr.left;
		 }
		 curr = s.pop();
		 curr = curr.right;
	 }
	
	 public static void main(String[] args) {
			
			bstImplentation_Inorder_Traversal tree = new bstImplentation_Inorder_Traversal();
	        tree.root = new TreeNode(1);
	        tree.root.left = new TreeNode(2);
	        tree.root.right = new TreeNode(3);
	        tree.root.left.left = new TreeNode(4);
	        tree.root.left.right = new TreeNode(5);
	        tree.inorder();

		}
	

}


	