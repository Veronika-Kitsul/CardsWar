
public class War {

	public War() {
		LinkedList<Cards> cards = new LinkedList<Cards>();
		
		
		//add elements to the deck of cards - works well
		for (int i = 1; i <= 13; i++)
		{
			cards.add(new Cards(0+i, "of Clubs" ));
			cards.add(new Cards(0+i, "of Diamonds"));
			cards.add(new Cards(0+i, "of Hearts" ));
			cards.add(new Cards(0+i, "of Spades" ));
		}
		System.out.println(cards.size);
		
		LinkedList<Cards> deck = new LinkedList<Cards>();
		
		//shuffling -- so now i know that size here returns zero always
		for (int i = 0; i < 26; i++)
		{
			int random = (int)Math.random() + cards.size + 1;
			deck.add(cards.get(random));
			cards.remove(random);
		}	
		
		System.out.println(deck);
		System.out.println(cards);
	    
	    
		while (deck != null || cards != null)
		{
			System.out.println("Player 1 has " + cards.size + " cards. Player 2 has " + deck.size + " cards");
			
			//how do i make it work because of enter???????
			System.out.println("Press enter to deal the cards");
			System.out.println("Player 1 plays " + cards.get(0));
			System.out.println("Player 2 plays " + deck.get(0));
			
			
			if (cards.get(0).num > deck.get(0).num )
			{
				cards.add(cards.size, cards.get(0));
				cards.add(cards.size, deck.get(0));
				deck.remove(0);
				cards.remove(0);
				System.out.println("Player 1 wins the round!");
			}
			else if (cards.get(0).num < deck.get(0).num)
			{
				
			}
				deck.add(cards.size, cards.get(0));
				deck.add(cards.size, deck.get(0));
				deck.remove(0);
				cards.remove(0);
				System.out.println("Player 2 wins the round!");
			}
		    if (cards.get(0).num == deck.get(0).num)
		    {
		    	System.out.println("This is a tie! ");
		    	deck.remove(0);
				cards.remove(0);
		    }
		}
		
		
		//winning message if someone wins
	
	
	
	public static void main(String[] args) {
		new War();
		
		
	}
}
