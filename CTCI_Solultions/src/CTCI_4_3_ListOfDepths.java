import java.util.*;
import extras.TreeNode;

public class CTCI_4_3_ListOfDepths {
	
	public static class Node{
		public int val;
		public Node left;
		public Node right;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8};
		Node tree = minTree(arr);
		System.out.println(depthList(tree));
//		extras.TreeNode res = TreeNode.createMinimalBST(arr);
//		System.out.println(tree.left.right.val);
//		System.out.println(res.left.right.data);
	}
	
	public static Node minTree(int[] array) {
		return minTree(array, 0, array.length - 1);
	}
	
	public static Node minTree(int arr[], int start, int end) {
		if(end<start) {
			return null;
		}
		
		int mid= (start+ end)/ 2;
		Node n = new Node(arr[mid]);
		n.left = minTree(arr, start, mid - 1);
		n.right = minTree(arr, mid+1, end);
		return n;
	}
	
	public static ArrayList<LinkedList<Node>> depthList(Node head){
		LinkedList<Node> res = new LinkedList<Node>();
		System.out.println(head.val);
		if(head.left == null && head.right != null) {
			res.add(head);
			ArrayList<LinkedList<Node>> right = depthList(head.right);
			ArrayList<LinkedList<Node>> fin = new ArrayList<LinkedList<Node>>();
			fin.add(res);
			fin.addAll(right);
			return fin;
		}
		if(head.right == null && head.left != null) {
			res.add(head);
			ArrayList<LinkedList<Node>> left = depthList(head.left);
			ArrayList<LinkedList<Node>> fin = new ArrayList<LinkedList<Node>>();
			fin.add(res);
			fin.addAll(left);
			return fin;
		}
		if(head.right == null && head.left == null) {
			System.out.println("NULLLLLL");
			ArrayList<LinkedList<Node>> left = new ArrayList<LinkedList<Node>>();
			left.add(res);
			return left;
		}
		res.add(head);
		ArrayList<LinkedList<Node>> left = depthList(head.left);
		ArrayList<LinkedList<Node>> right = depthList(head.right);
		for(int i = 0; i<left.size(); i++) {
			System.out.println("Left: "+ left);
			System.out.println("Right: "+ right);
			left.get(i).addAll(right.get(i));
			System.out.println("Result: "+ left + "\n\n");
		}
		 
		ArrayList<LinkedList<Node>> fin = new ArrayList<LinkedList<Node>>();
		fin.add(res);
		fin.addAll(left);
		return fin;
	}
}
