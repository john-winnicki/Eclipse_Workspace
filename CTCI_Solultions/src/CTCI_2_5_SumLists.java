import extras.SLL;

public class CTCI_2_5_SumLists {

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
		addTwo(llist1, llist2).printList();
	}
	
	public static SLL addTwo(SLL num1, SLL num2){
		
		SLL.Node dig1 = num1.head;
		SLL.Node dig2 = num2.head;
		
		int carry = 0;
		
		SLL res = new SLL();
		int temp = 0; 
		
		while(dig1!=null && dig2!=null) {
			temp = dig1.data + dig2.data + carry;
			if(temp>9) {
				carry = 1;
				temp = temp%10;
			}
			else {
				carry = 0;
			}
			res.append(temp);
			dig1 = dig1.next;
			dig2 = dig2.next;
		}
		
		temp = ((dig1==null?0:dig1.data)+(dig2==null?0:dig2.data))+carry;
		if(temp>9) {
			carry = 1;
			temp = temp%10;
		}
		else {
			carry = 0;
		}
		res.append(temp);
		res.append(carry);
		
		return res;
	}

}
