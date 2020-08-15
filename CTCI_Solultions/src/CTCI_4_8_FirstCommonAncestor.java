public class CTCI_4_8_FirstCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static class Node{
		public int val;
		public Node left;
		public Node right;
		public Node parent;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	public Node firstCom(Node node1, Node node2) {
		int height1 = getHeight(node1);
		int height2 = getHeight(node2);
		int moveup = 0;
		if(height1>height2) {
			moveup = height1-height2;
			for(int i = 0; i<moveup; i++) {
				node2 = node2.parent;
			}
		}
		else if(height2>height1) {
			moveup = height2-height1;
			for(int i = 0; i<moveup; i++) {
				node1 = node1.parent;
			}
		}
		while(node1!=node2) {
			node1 = node1.parent;
			node2 = node2.parent;
		}
		return node1;
	}
	
	public int getHeight(Node node) {
		int count=0;
		while(node.parent != null) {
			node = node.parent;
			count++;
		}
		return count;
	}

}
