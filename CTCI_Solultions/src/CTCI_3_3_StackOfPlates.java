
public class CTCI_3_3_StackOfPlates {

	class Stack{

		StackNode top;
		
		public class StackNode{
			private Integer data;
			private StackNode next;
			public StackNode(Integer d) {
				this.data = d;
			}
		}
		
		public void push(Integer i) {
			StackNode temp = new StackNode(i);
			temp.next = top;
			top = temp;
		}
		
		public Integer pop() {
			Integer i = top.data;
			top = top.next;
			return i;
		}
	}
	
	int max_val = 5;
	Stack[] stack_list = new Stack[10];
	int count = 0;
	int curr_stack = 0;
	
	public void push(Integer i) {
		Stack toUse = stack_list[curr_stack];
		if(toUse ==null) {
			toUse = new Stack();
			stack_list[curr_stack] = toUse;
		}
		System.out.println(curr_stack);
		toUse.push(i);
		count ++;
		if(count>=max_val) {
			curr_stack++;
			count = 0;
		}
	}
	
	public void pop() {
		int del_count = count -1;
		int del_stack = curr_stack;
		if(del_count<0) {
			del_count = max_val;
			del_stack--;
		}
		Stack toUse = stack_list[del_stack];
		System.out.println(del_stack);
		toUse.pop();
		count--;
		if(count<0) {
			curr_stack--;
			count=max_val;
		}
	}
		
}
