import java.util.*;

public class CTCI_4_2_MinimalTree {
	
	public static class Node{
		public int val;
		public Node[] children;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr = {0,1,2,3,4,5,6,7,8};
		Node head = minTree(arr);
		System.out.println(head.val);
		
		LinkedList<Node> queue = new LinkedList<Node>();
		HashMap<Node, Boolean> visited = new HashMap<Node, Boolean>();
//		queue.add(head);
		
		for(Node i: head.children) {
			queue.add(i);
		}
		Node curr = queue.removeFirst();
		
		while(!queue.isEmpty()) {
			if(!visited.containsKey(curr)) {
				if(curr != null && curr.children != null) {
					for(Node i: curr.children) {
						queue.add(i);
					}
				}
				visited.put(head,  true);	
			}
				curr = queue.removeFirst();
				System.out.println(curr.val);
		}
	}
	
	public static Node minTree(Integer[] arr) {
		Integer mid = arr.length;
		mid = mid/2;

		Integer left = mid-1;
		Integer right = mid+1;
		LinkedList<Node> queue = new LinkedList<Node>();
		
		Node head = new Node(arr[mid]);
		Node curr = head;
		while(left>0 && right<arr.length) {
			System.out.println(arr[left]+ "******"+ arr[right] + "\n\n");
			Node new_left = new Node(arr[left]);
			Node new_right = new Node(arr[right]);
			curr.children = new Node[] {new_left, new_right};
			queue.add(new_left);
			queue.add(new_right);
			curr = queue.removeFirst();
			left--;
			right++;
		}
		if(left>0) {
			Node new_left = new Node(arr[left]);
			curr.children = new Node[] {new_left};
		}
		if(right<arr.length) {
			Node new_right = new Node(arr[right]);
			curr.children = new Node[] {new_right};
		}
		return head;
	}

}
