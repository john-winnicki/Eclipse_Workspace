import java.util.*;

public class CTCI_4_1_RouteBetweenNodes {

	public static class Graph{
		public Node[] nodes;
	}
	
	public static class Node{
		public String name;
		public Node[] children;
		
		public Node(String name) {
			this.name = name;
		}
	}
	
	public static void main(String[] args) {
		Graph g = new Graph();
		
		Node node1 = new Node("1");
		Node node2 = new Node("2");
		Node node3 = new Node("3");
		Node node4 = new Node("4");
		Node node5 = new Node("5");
		
		Node[] children1 = {node2, node5};
		Node[] children2 = {};
		Node[] children3 = {node1, node3};
		Node[] children4 = {node2};
		Node[] children5 = {node2, node4};
		
		node1.children = children1;
		node2.children = children2;
		node3.children = children3;
		node4.children = children4;
		node5.children = children5;
		
		Node[] nodes = {node1, node2, node3, node4, node5};
		g.nodes = nodes;
		
		System.out.println(routeBet(g, node1, node3));
		
	}
	
	public static boolean routeBet(Graph g, Node start, Node end){
		
		LinkedList<Node> queue = new LinkedList<Node>();
		HashMap<Node, Boolean> visited = new HashMap<Node, Boolean>();
		queue.add(start);
		
		for(Node i: start.children) {
			queue.add(i);
		}
		Node curr = queue.removeFirst();
		if(curr == end)return true;
		visited.put(start, true);

		
		while(!queue.isEmpty()) {
			curr = queue.removeFirst();
			if(!visited.containsKey(curr)) {
				for(Node i: curr.children) {
					queue.add(i);
				}
				if(curr == end) {
					return true;
				}
				visited.put(start,  true);	
			}
		}
		
		return false;
	}

}
