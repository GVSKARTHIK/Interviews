package interview;

import java.util.Stack;

class Node{
	int val;
	Node left, right;
	public Node(int val) {
		this.val = val;
		left = right = null;
	}
	
	
	
}
 class bstImplentation{

	 Node root;
	 void inorder() {
		 if (root == null)
			 return;
		 
		 Stack<Node> s = new Stack<Node>();
		 Node curr = root;
	 
		 while(curr != null || s.size() >0) {
			 s.push(curr);
			 curr = curr.left;
		 }
		 curr = s.pop();
		 curr = curr.right;
	 }
	
	 public static void main(String[] args) {
			
			bstImplentation tree = new bstImplentation();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.inorder();

		}
	

}