import java.util.concurrent.ThreadLocalRandom;

public class War {

	public War() {
		LinkedList<Cards> cards = new LinkedList<Cards>();
		
		
		//add elements to the deck of cards - works well
		for (int i = 1; i <= 12; i++)
		{
			cards.add(new Cards(0+i, "of Clubs" ));
			cards.add(new Cards(0+i, "of Diamonds"));
			cards.add(new Cards(0+i, "of Hearts" ));
			cards.add(new Cards(0+i, "of Spades" ));
		}
	
		
		LinkedList<Cards> deck = new LinkedList<Cards>();
		
		//shuffling -- it's not really random or i did sth wrong (i suppose it's two ...)
		//the problem is that if you try to test this deck for player 2, it gives same card several times
		for (int i = 0; i < 26; i++)
		{
			int random = (int)Math.random() + cards.size + 1;
			if (random / 2 == 0)
			{
				deck.add(cards.get(random));
				System.out.println(cards.get(random));
				cards.remove(random);
			}
		}	
	    
		while (deck == null || cards == null)
		{
			System.out.println("Player 1 has " + cards.size + "cards. Player 2 has " + deck.size + "cards");
			
			//how do i make it work because of enter???????
			System.out.println("Press enter to deal the cards");
			System.out.println("Player 1 plays " + cards.get(0));
			System.out.println("Player 2 plays " + deck.get(0));
			
			
			
			
			// so for this all i need in fact is to access the first card, and i hope i will be good here
			
			
			/*if (first card num > first card from deck num)
			{
				add those two cards to the back of cards
				delete it from first places
				System.out.println("Player 1 wins the round!");
			}
			else if (first card num < first card from deck num)
			{
				add those two cards to the back of deck
				delete it from first places
				System.out.println("Player 2 wins the round!");
			}*/
		}
		
		
		//winning message if someone wins
	}
	
	
	public static void main(String[] args) {
		new War();
		
		
	}
}
