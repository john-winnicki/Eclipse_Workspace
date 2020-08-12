import extras.SLL;

public class CTCI_2_6_Palindrome {

	public static void main(String[] args) {
		SLL llist1 = new SLL();
		llist1.append(1);
		llist1.append(2);
		llist1.append(5);
		llist1.append(3);
		llist1.append(5);
		llist1.append(2);
		llist1.append(1);
		
		llist1.printList();
		System.out.println("\n"+palindrome(llist1));

	}
	
	public static boolean palindrome(SLL lst) {
		SLL.Node curr = lst.head;
		int count = 0;
		while(curr!=null) {
			count++;
			curr = curr.next;
		}
		
		count = count%2==1 ? (count-1)/2 : count/2;
		
		SLL temp = new SLL();
		curr = lst.head;
		temp.append(lst.head.data);
		curr = curr.next;
		for(int i = 1; i<count; i++) {
			SLL.Node old_head = temp.head;
			SLL.Node new_node = new SLL.Node(curr.data);
			temp.head = new_node;
			temp.head.next = old_head;
			
			curr = curr.next;
		}
		
		curr = lst.head;
		int ncount = 0;
		while(curr!=null) {
			ncount++;
			curr = curr.next;
		}
		ncount = ncount%2==1 ? (ncount+1)/2 : ncount/2;
		
		curr = lst.head;
		for(int i= 0; i<ncount; i++) {
			curr = curr.next;
		}
		SLL.Node new_curr = temp.head;
		
		System.out.println();
		temp.printList();
		System.out.println();
//		System.out.println(curr.next.data);
		
		for(int i=0; i<count; i++) {
			System.out.println("\n"+curr.data + "***" + new_curr.data);
			if(curr.data != new_curr.data) {
				return false;
			}
			curr = curr.next;
			new_curr = new_curr.next;
		}
		return true;
	}

}
