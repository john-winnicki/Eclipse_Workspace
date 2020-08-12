import extras.SLL;
import java.util.HashMap;
//This is a bad implementation. It only checks if a loop exists in a regular linked list.
//Bad because not what the problem was asking for
public class CTCI_2_8_LoopDetection {

	public static void main(String[] args) {
		SLL llist1 = new SLL();
		llist1.append(1);
		llist1.append(2);
		llist1.append(5);
		llist1.append(6);
		llist1.append(3);
		SLL.Node curr = llist1.head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = llist1.head;
		System.out.println(loopDet(llist1).data);
	}
	
	public static SLL.Node loopDet(SLL llist){
		HashMap<SLL.Node,Integer> hmap = new HashMap<SLL.Node,Integer>();
		SLL.Node curr = llist.head;
		while(curr != null) {
			if(hmap.containsKey(curr)) {
				return curr;
			}
			hmap.put(curr, 0);
			curr = curr.next;
		}
		return null;
	}

}
