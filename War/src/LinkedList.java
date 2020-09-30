import java.util.AbstractList;


public class LinkedList<T> extends AbstractList<T> {
	
	Node head;
	
	private class Node
	{
		public Node next;
		public T info;

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
		
		int size = 0;
		public int size() 
		{
			Node curr = head;
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
			
			
	
			
		
			
			
		//take random elements and bring them to the second deck
			
		

		}
}
	    

