import extras.SLL;
import extras.SLL.Node;

import java.util.HashMap;

public class CTCI_2_7_Intersection {

	public static void main(String[] args) {
		SLL llist1 = new SLL();
		llist1.append(1);
		llist1.append(2);
		llist1.append(5);
		
		SLL llist2 = new SLL();
		llist2.head = new SLL.Node(4);
		llist2.head.next = new SLL.Node(11);
		llist2.head.next.next = llist1.head;
		llist1.printList();
		System.out.println();
		llist2.printList();
		System.out.println();
		System.out.println(intersection(llist1,llist2).data);

	}
	
	public static SLL.Node intersection(SLL lst1, SLL lst2){
		HashMap<SLL.Node,Integer> hmap = new HashMap<SLL.Node,Integer>();
		SLL.Node curr = lst1.head;
		while(curr != null) {
			hmap.put(curr, 0);
			curr = curr.next;
		}
		curr = lst2.head;
		while(curr != null) {
			if(hmap.containsKey(curr)) {
				return curr;
			}
			curr = curr.next;
		}
		return null;
	}
	
	

}
