import extras.SLL;

public class CTCI_2_2_ReturnKthToLast_Alt {

	public static void main(String[] args) {
		SLL llist = new SLL();
		llist.append(8);
		llist.append(9);
		llist.append(10);
		llist.append(11);
		llist.append(12);
		
		System.out.println(kToLast(llist,2).data);

	}
	
	public static SLL.Node kToLast(SLL llist, int k){
		
		SLL.Node p1 = llist.head;
		SLL.Node p2 = llist.head;
		
		for(int i = 0; i<k; i++) {
			if(p1.next == null) {
				return null;
			}
			p1 = p1.next;
		}
		
		while(p1.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p2;
	}

}
