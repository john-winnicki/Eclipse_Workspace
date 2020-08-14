public class CTCI_4_4_CheckBalanced_Alt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node{
		public int val;
		public Node left;
		public Node right;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	public int checkHeight(Node root) {
		if(root==null) return -1;
		int leftHeight = checkHeight(root.left);
		int rightHeight = checkHeight(root.right);
		
		if(leftHeight==Integer.MIN_VALUE) return Integer.MIN_VALUE;
		if(rightHeight==Integer.MIN_VALUE) return Integer.MIN_VALUE;
		
		int diff = leftHeight-rightHeight;
		if(Math.abs(diff)>1) {
			return Integer.MIN_VALUE;
		}
		else {
			return(Math.max(leftHeight, rightHeight)+1);
		}
	}
	
	public boolean isBalanced(Node n) {
		return checkHeight(n)!=Integer.MIN_VALUE;
	}

}
