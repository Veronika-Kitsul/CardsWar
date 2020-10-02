
public class Cards 
{
		public int num;
		public String suit;
		public Cards next;

		public Cards(int num, String suit)
		{
			this.num = num;
			this.suit = suit;
			
		}
		
		public Cards(int num, String suit, Cards next)
		{
			this.num = num;
			this.suit = suit;
			this.next = next;
			
		}
		
		public String toString() {
			return num + " " + suit;
		}
}
