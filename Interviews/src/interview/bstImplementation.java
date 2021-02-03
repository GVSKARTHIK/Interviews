package interview;

import java.util.ArrayList;
import java.util.List;
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
	 public List < Integer > inorderTraversal() {
	        List < Integer > res = new ArrayList < > ();
	        Stack < Node > stack = new Stack < > ();
	        Node curr = root;
	        while (curr != null || !stack.isEmpty()) {
	            while (curr != null) {
	                stack.push(curr);
	                curr = curr.left;
	            }
	            curr = stack.pop();
	            res.add(curr.val);
	            curr = curr.right;
	        }
	        return res;
	    }
	
	 public static void main(String[] args) {
			
			bstImplentation tree = new bstImplentation();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.inorderTraversal();

		}
	

}