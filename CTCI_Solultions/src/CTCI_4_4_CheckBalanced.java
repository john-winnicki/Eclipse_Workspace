public class CTCI_4_4_CheckBalanced {
	
	public static class Node{
		public int val;
		public Node left;
		public Node right;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Boolean hasGrandChild(Node node) {
		if(node==null) return false;
		if(node.left != null) {
			if(node.left.left != null) {
				return true;
			}
			else if(node.left.right != null) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if(node.right != null) {
			if(node.right.left != null) {
				return true;
			}
			else if(node.right.right != null) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public static Boolean checkBalance(Node head) {
		if(head==null) {return true;}
		Boolean res1 = hasGrandChild(head.left);
		Boolean res2 = hasGrandChild(head.right);
		Boolean res3 = (res1 && !res2) || (!res1 && res2);
		return res3 && checkBalance(head.left) && checkBalance(head.right);
	}

}
