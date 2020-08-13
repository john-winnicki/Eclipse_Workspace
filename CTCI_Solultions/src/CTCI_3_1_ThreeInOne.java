
public class CTCI_3_1_ThreeInOne {
	
	class ThreeArr{
		private int num_stacks = 3;
		private int stack_cap;
		private int[] values;
		private int[] sizes;
		
		public ThreeArr(int stack_size){
			stack_cap = stack_size;
			values = new int[stack_size * num_stacks];
			sizes = new int[num_stacks];
		}
		
		public void push(int stack_num, int val) {
			sizes[stack_num]++;
			values[top_index(stack_num)] = val;
		}
		
		public int pop(int stack_num) {
			int top_index = top_index(stack_num);
			int value = values[top_index];
			values[top_index] = 0;
			sizes[stack_num]--;
			return value;
		}
		
		public int peek(int stack_num) {
			return(values[top_index(stack_num)]);
		}
		
		private int top_index(int stack_num) {
			int offset = stack_num * stack_cap;
			int size = sizes[num_stacks];
			return offset+size-1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
