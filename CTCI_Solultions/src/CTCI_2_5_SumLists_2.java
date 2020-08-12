import extras.SLL;
import extras.SLL.Node;
//Follow up question: What if the linked lists represent the numbers in the correct order,
//Rather than reversed
public class CTCI_2_5_SumLists_2 {
	
	public static int carry = 0;

	public static void main(String[] args) {
		SLL llist1 = new SLL();
		llist1.append(9);
		llist1.append(7);
		llist1.append(8);
		SLL llist2 = new SLL();
		llist2.append(6);
		llist2.append(8);
		llist2.append(5);
		
		llist1.printList();
		System.out.println();
		llist2.printList();
		System.out.println();
		System.out.println();
		addTwoFinal(llist1, llist2).printList();
	}
	
	public static SLL addTwoFinal(SLL lst1, SLL lst2){
		int len1 = 0;
		int len2 = 0;
		
		SLL.Node curr1 = lst1.head;
		SLL.Node curr2 = lst2.head;
		
		while(curr1 != null) {
			len1++;
			curr1 = curr1.next;
		}
		
		while(curr2 != null) {
			len2++;
			curr2 = curr2.next;
		}
		
		int diff = len1-len2;
		if(diff<0) {
			diff = diff*(-1);
			for(int i = 0; i<diff; i++) {
				SLL.Node temp = lst1.head;
				SLL.Node temp1 = new SLL.Node(0);
				lst1.head = temp1;
				lst1.head.next = temp;
			}
		}
		if(diff>0) {
			for(int i = 0; i<diff; i++) {
				SLL.Node temp = lst2.head;
				SLL.Node temp1 = new SLL.Node(0);
				lst2.head = temp1;
				lst2.head.next = temp;
			}
		}
		SLL pass = new SLL();
		pass = AddTwoSameLength(lst1, lst2, pass);
		if(carry>0) {
			SLL.Node old_head = pass.head;
			SLL.Node new_head = new SLL.Node(carry);
			pass.head = new_head;
			pass.head.next = old_head;
		}
		return pass;
	}
	
	public static SLL AddTwoSameLength(SLL lst1, SLL lst2, SLL pass) {
		SLL.Node curr = lst1.head;
		if(curr.next == null) {
			int calc = lst1.head.data + lst2.head.data + carry;
			carry = calc>9 ? 1 : 0;
			pass.append(calc%10);
			
//			System.out.println();
//			System.out.println();
//			pass.printList();
//			System.out.println();
			
			return pass;
		}
		
		else {
			int temp1 = lst1.head.data;
			int temp2 = lst2.head.data;
			
			lst1.head = lst1.head.next;
			lst2.head = lst2.head.next;
			
			pass = AddTwoSameLength(lst1, lst2, pass);
			SLL.Node old_head = pass.head;
			int calc = temp1 + temp2 + carry;
			carry = calc>9 ? 1 : 0;
			SLL.Node new_head = new SLL.Node(calc%10);
			pass.head = new_head;
			pass.head.next = old_head;
			
//			System.out.println();
//			System.out.println();
//			pass.printList();
//			System.out.println();
			
			return pass;
		}
	}
}
