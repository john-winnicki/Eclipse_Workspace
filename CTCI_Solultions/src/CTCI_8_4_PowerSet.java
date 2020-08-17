import java.util.*;

public class CTCI_8_4_PowerSet {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> elems = new ArrayList<Integer>();
		elems.add(1);
		elems.add(2);
		elems.add(3);
		System.out.println(Arrays.toString(elems.toArray()));
		arr = powerSet(elems, arr);
		for(ArrayList<Integer> a : arr) {
			System.out.println(Arrays.toString(a.toArray()));
		}

	}
	
	public static ArrayList<ArrayList<Integer>> powerSet(ArrayList<Integer> elems, ArrayList<ArrayList<Integer>> arr) {
		if(elems.isEmpty()) return arr;
		
		ArrayList<ArrayList<Integer>> finArr = new ArrayList<ArrayList<Integer>>();
		Integer x = elems.remove(0);
		
		for(ArrayList<Integer> subArr : arr) {
			finArr.add(subArr);
			ArrayList<Integer> newArr = new ArrayList<>(subArr);
			newArr.add(x);
			finArr.add(newArr);
		}
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		newArr.add(x);
		finArr.add(newArr);
		return powerSet(elems, finArr);
	}

}
