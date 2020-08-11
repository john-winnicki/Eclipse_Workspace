import extras.SLL;

public class CTCI_2_2_ReturnKthToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL llist = new SLL();
		llist.append(8);
		llist.append(9);
		llist.append(10);
		llist.append(11);
		llist.append(12);
		
		System.out.println(kthToLast(llist,2));
		
		
	}
	
	public static int kthToLast(SLL lst, int k) {
		
		int count = 0;
		SLL.Node curr = lst.head;
		while(curr.next != null) {
			count++;
			curr = curr.next;
		}
		count -= k;
		
		curr=lst.head;
		for(int i=0;i<count;i++) {
			curr = curr.next;
		}
		return curr.data;
	}

}
