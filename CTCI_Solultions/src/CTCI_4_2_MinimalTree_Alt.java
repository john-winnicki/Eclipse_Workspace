
public class CTCI_4_2_MinimalTree_Alt {

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
	
	public Node minTree(int[] array) {
		return minTree(array, 0, array.length - 1);
	}
	
	public Node minTree(int arr[], int start, int end) {
		if(end<start) {
			return null;
		}
		
		int mid= (start+ end)/ 2;
		Node n = new Node(arr[mid]);
		n.left = minTree(arr, start, mid - 1);
		n.right = minTree(arr, mid+1, end);
		return n;
	}

}
