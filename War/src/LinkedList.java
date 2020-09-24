import java.util.AbstractList;
import java.util.Collections;


public class LinkedList<T> extends AbstractList<T> {
	
	Node head;
	
	private class Node
	{
		private Node next;
		private T info;

		public Node(T info)
		{
			this.info = info;
		}
		
		public Node(T info, Node next)
		{
			this.next = next;
			this.info = info;
		}
	}
	
		public boolean add(T info) 
		{
		
			if (head == null) 
			{
				head = new Node(info);
				return true;
			}
		
			Node curr = head;
			while (curr.next != null) 
			{
				curr = curr.next;
			}
		
			curr.next = new Node(info);
			
			return true;
		
		}

		public void add(int index, T info) 
		{
			Node curr = head; 
			for (int i = 0; i < index; i++)
			{
				curr = curr.next;
			}
			
			Node elementNext = curr.next;
			
			curr.next = new Node(info);
			curr.next.next = elementNext;
			//should attach other elements here that go after
			
			return;
		}

		@Override
		public T get(int index) 

		{
			Node curr = head;
			for (int i = 0; i < index; i++)
			{
				curr = curr.next;
			}
			
			System.out.println(curr.info);
			return curr.info;
		}
		
		
		public T remove (int index) 
		{
			Node curr = head;
			
			// index must be within our list
			for (int i = 0; i < index-1; i++) 
			{
				curr = curr.next;
			}
			
			Node temp = curr.next;
			curr.next = curr.next.next;
			
			return temp.info;
		}
		
		@Override
		public int size() 
		{
			Node curr = head;
			int size = 0;
			while(curr != null)
			{
				size++;
				curr = curr.next;
			}
			
			return size;
		}
		
		@Override
		public String toString() 
		{
			if (size() == 0) return "[ ]";
			String output = "[";
			Node curr = head;
			while (curr != null) 
			{
				output += curr.info.toString() + ", ";
				curr = curr.next;
			}
			return output.substring(0,output.length()-2) +"]";
		}
		
		public static void main(String[] args) 
		{
			LinkedList<String> myList = new LinkedList<String>();
			//aces
			myList.add("Ace of Clubs");
			myList.add("Ace of Diamonds");
			myList.add("Ace of Hearts");
			myList.add("Ace of Spades");
			
			//2s
			myList.add("2 of Clubs");
			myList.add("2 of Diamonds");
			myList.add("2 of Hearts");
			myList.add("2 of Spades");
			
			//3s
			myList.add("3 of Clubs");
			myList.add("3 of Diamonds");
			myList.add("3 of Hearts");
			myList.add("3 of Spades");
			
			//4s
			myList.add("4 of Clubs");
			myList.add("4 of Diamonds");
			myList.add("4 of Hearts");
			myList.add("4 of Spades");
			
			//5s
			myList.add("5 of Clubs");
			myList.add("5 of Diamonds");
			myList.add("5 of Hearts");
			myList.add("5 of Spades");
			
			//6s
			myList.add("6 of Clubs");
			myList.add("6 of Diamonds");
			myList.add("6 of Hearts");
			myList.add("6 of Spades");
			
			//7s
			myList.add("7 of Clubs");
			myList.add("7 of Diamonds");
			myList.add("7 of Hearts");
			myList.add("7 of Spades");
			
			//8s
			myList.add("8 of Clubs");
			myList.add("8 of Diamonds");
			myList.add("8 of Hearts");
			myList.add("8 of Spades");
			
			//9s
			myList.add("9 of Clubs");
			myList.add("9 of Diamonds");
			myList.add("9 of Hearts");
			myList.add("9 of Spades");
			
			//10s
			myList.add("10 of Clubs");
			myList.add("10 of Diamonds");
			myList.add("10 of Hearts");
			myList.add("10 of Spades");
			
			//Jacks
			myList.add("Jack of Clubs");
			myList.add("Jack of Diamonds");
			myList.add("Jack of Hearts");
			myList.add("Jack of Spades");
			
			//Queens
			myList.add("Queen of Clubs");
			myList.add("Queen of Diamonds");
			myList.add("Queen of Hearts");
			myList.add("Queen of Spades");
			
			//Kings
			myList.add("King of Clubs");
			myList.add("King of Diamonds");
			myList.add("King of Hearts");
			myList.add("King of Spades");
		
				
		
			Collections.shuffle(myList);
	        System.out.println("Results after shuffle operation:");
	        System.out.println(myList);
    

		}
}
	    

