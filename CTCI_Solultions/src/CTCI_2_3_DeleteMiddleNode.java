

import extras.SLL;
import extras.SLL.Node;

//Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, 
//not necessarily the exact middle) of a singly linked list, given only access to that node.

public class CTCI_2_3_DeleteMiddleNode {

	public static void main(String[] args) {
		SLL llist = new SLL();
		llist.append(8);
		llist.append(9);
		llist.append(10);
		llist.append(11);
		llist.append(12);
		llist.append(13);
		llist.append(14);
		
		SLL.Node curr = llist.head;
		
		llist.printList();
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			curr = curr.next; 
		}
		delMid(curr);
		llist.printList();
	}
	
	public static void delMid(SLL.Node node) {
		SLL.Node next = node.next;
		SLL.Node nextnext = next.next;
		node.data = next.data;
		node.next = nextnext;
	}

}
