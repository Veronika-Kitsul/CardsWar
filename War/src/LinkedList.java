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
			if (index == 0) {
				head = new Node(info);
				head.next = curr;
			}
			
			for (int i = 0; i < index-1; i++)
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
			
			return curr.info;
		}
		
		
		public  T remove (int index) 
		{
			Node curr = head;
			if (index == 0)
			{
				head = curr.next;
				return curr.info;
				
			}
			
			// index must be within our list
			for (int i = 0; i < index-1; i++) 
			{
				curr = curr.next;
			}
			
			Node temp = curr.next;
			curr.next = curr.next.next;
			
			return curr.info;
		
		}
		
		
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
			
			
	
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(7);
		list.add(6);
		list.add(3);
		list.add(1,2);
		list.remove(0);
		System.out.println(list);
		
			
		

		}
}
	    

