import extras.SLL;

public class CTCI_2_4_Partition {

	public static void main(String[] args) {
		SLL llist = new SLL();
		llist.append(3);
		llist.append(5);
		llist.append(8);
		llist.append(10);
		llist.append(2);
		llist.append(5);
		llist.append(1);
		
		llist.printList();
		System.out.println();
		partition(llist, 5);
		llist.printList();

	}
	
	public static void partition(SLL llist, int partition) {
		SLL.Node pos5 = null;
		SLL.Node prev5 = null;
		SLL.Node prev = null;
		SLL.Node curr = llist.head;
		SLL.Node next = null;
		
		while(curr.next != null) {

			if((pos5 == null)&&(curr.data == partition)){
				pos5 = curr;
				prev5 = prev;
			}
			if((pos5!=null) &&( curr.data < partition)) {
				
				prev.next = curr.next;
				
				prev5.next = curr;
				curr.next = pos5;
				prev5 = curr;
				
				curr = prev.next;
				
			}
			else {
				prev = curr;
				curr = curr.next;	
			}
		}
		if(curr.data<partition) {
			prev.next = null;
			next = llist.head;
			llist.head = curr;
			curr.next = next;
		}
	}

}
