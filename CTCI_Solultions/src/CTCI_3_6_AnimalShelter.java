import java.util.*;

public class CTCI_3_6_AnimalShelter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class MyQueue<T>{
		private class QueueNode<T> {
			private T data;
			private QueueNode<T> next;
			
			public QueueNode(T data) {
				this.data = data;
			}
		}
		
		private QueueNode<T> first;
		private QueueNode<T> last;
	
		public void add(T item) {
			QueueNode<T> t = new QueueNode<T>(item);
			if(last != null) {
				last.next = t;
			}
			last = t;
			if(first == null) {
				first = last;
			}
		}
		
		public T remove() {
			if(first==null) throw new NoSuchElementException();
			T data = first.data;
			first = first.next;
			if(first ==null) {
				last = null;
			}
			return data;
		}
		
		public T peek() {
			if(first == null) throw new NoSuchElementException();
			return first.data;
			}
		
		public boolean isEmpty() {
			return first==null;
		}
		
		public String toString() {
			StringBuilder fin = new StringBuilder();
			fin.append("[");
			QueueNode<T> curr = first;
			while(curr!=null) {
				fin.append(curr.data.toString());
				fin.append(", ");
				curr = curr.next;
			}
			fin.append("]");
			return fin.toString();
		}
	}
	
	public class Animal{
		String name; 
		Boolean dog;
		public Animal(String name, Boolean dog) {
			this.name = name;
			this.dog = dog;
		}
		public String toString() {
			return("("+name+","+dog.toString()+")");
		}
	}
	
	//True represents dog, false represents cat
	LinkedList<Animal> animals = new LinkedList<Animal>();
	MyQueue<Animal> dogs = new MyQueue<Animal>();
	MyQueue<Animal> cats = new MyQueue<Animal>();
	
	public void enqueue(String name, Boolean dog) {
		Animal temp = new Animal(name, dog);
		animals.add(temp);
		if(temp.dog) {
//			temp = animals.getFirst();
//			System.out.println(temp.name);
			dogs.add(animals.getLast());
		}
		else {
			cats.add(animals.getLast());
		}
	}
	
	public void dequeueAny() {
		Boolean dog = animals.poll().dog;
		if(dog) {
			dogs.remove();
		}
		else {
			cats.remove();
		}
	}
	
	public void dequeueDog() {
		Iterator<Animal> iterator = animals.iterator();
		while(iterator.hasNext()) {
			Animal next = (Animal) iterator.next();
			if(next.dog) {
				iterator.remove();
				break;
			}
		}
	}
	
	public void dequeueCat() {
		Iterator<Animal> iterator = animals.iterator();
		while(iterator.hasNext()) {
			Animal next = (Animal) iterator.next();
			if(!next.dog) {
				iterator.remove();
				break;
			}
		}
	}
	
	public void printAll() {
		System.out.println(animals);
		System.out.println(dogs.toString());
		System.out.println(cats.toString());
	}
}
