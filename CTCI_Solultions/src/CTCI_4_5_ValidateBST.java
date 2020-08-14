public class CTCI_4_5_ValidateBST {
	
	public static class Node{
		public int val;
		public Node left;
		public Node right;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	public static void main(String[] args) {

	}
	
	public static Boolean validateBST(Node head) {
		if(head==null) {
			return true;
		}
		Boolean left_res = head.left!=null ? head.left.val<head.val : true;
		Boolean right_res = head.right!=null ? head.right.val>head.val : true;
		return validateBST(head.left) && validateBST(head.right) && left_res && right_res;
		
	}

}
