import java.util.Stack;

public class CTCI_3_5_SortStack {

	public static void main(String[] args) {
		Stack<Integer> stackList = new Stack<Integer>();
		stackList.push(1);
		stackList.push(4);
		stackList.push(3);
		stackList.push(2);
		stackList.push(11);
		stackList.push(2);
		stackList.push(6);
		stackList.push(3);
		System.out.println(sort(stackList));

	}
	
	public static Stack<Integer> sort(Stack<Integer> stack){
		Stack<Integer> temp = new Stack<Integer>();
		Integer store = null;
		while(!stack.isEmpty()) {
			if(temp.isEmpty()) {
				temp.push(stack.pop());
			}
			if(store==null) {
				if(temp.peek()<=stack.peek()) {
					temp.push(stack.pop());
					}
				else {
					store = stack.pop();
					if(stack.isEmpty()) {
						while(!temp.isEmpty()) {
							stack.push(temp.pop());
						}
						temp.push(store);
						store = null;
					}
				}
			}
			else {//store and temp have stuff
				if(temp.peek()<=store) {
					stack.push(temp.pop());
				}
				else {
					while(!temp.isEmpty()) {
						stack.push(temp.pop());
					}
					temp.push(store);
					store = null;
				}
//				if(store > )
//				if(temp.peek()>=store) {
//					stack.push(temp.pop());
//				}
//				else{
//					temp.push(store);
//					store = null;
//				}
			}
			System.out.println();
			System.out.println(temp);
			System.out.println(store);
			System.out.println(stack);
		}
		return temp;
	}

}
