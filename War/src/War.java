
public class War {

	public War() 
	{
		LinkedList<Cards> cards = new LinkedList<Cards>();
		
		
		//add elements to the deck of cards - works well
		for (int i = 1; i <= 13; i++)
		{
			cards.add(new Cards(0+i, "of Clubs" ));
			cards.add(new Cards(0+i, "of Diamonds"));
			cards.add(new Cards(0+i, "of Hearts" ));
			cards.add(new Cards(0+i, "of Spades" ));
		}
		
		LinkedList<Cards> deck = new LinkedList<Cards>();
		/*for (int i = 0; i < 55; i++)
		{
			//i think that this way 
			int j = (int)((Math.random()) * cards.size());
			int m = (int)((Math.random()) * cards.size());
			cards.add(m, cards.get(j));
			cards.add(j, cards.get(m));
			cards.remove(j);
			cards.remove(m);
		}*/
		
		
		for (int i = 0; i < 26; i++)
		{
			deck.add(cards.remove((int)(Math.random() * cards.size())));
		}
		
		System.out.println(deck);
		System.out.println(cards);

			
	 
		while (deck != null || cards != null)
		{
			System.out.println("Player 1 has " + cards.size() + " cards. Player 2 has " + deck.size() + " cards");
			System.out.println("Player 1 plays " + cards.get(0));
			System.out.println("Player 2 plays " + deck.get(0) + "\n");
			
			//checking who gets higher number value
			if (cards.get(0).num > deck.get(0).num )
			{
				cards.add(cards.size(), cards.get(0));
				cards.add(cards.size(), deck.get(0));
				deck.remove(0);
				cards.remove(0);
				System.out.println("Player 1 wins the round!\n\n");
			}
			/*if (cards.get(0).num > deck.get(0).num)
			{
				//deck.add(cards.size(), cards.get(0));
				//deck.add(cards.size(), deck.get(0));
				deck.remove(0);
				cards.remove(0);
				System.out.println("Player 2 wins the round!\n\n");
			}*/
			
			//or if they are equal
		    if (cards.get(0).num == deck.get(0).num)
		    {
				deck.remove(0);
				cards.remove(0);
				System.out.println("This is a tie!\n\n");
		    }
		    else 
		    {
		    	deck.remove(0);
				cards.remove(0);
		    }
		    
		}   
		
		if (deck == null)
		{
			System.out.println("Player 1 won the game!");
		}
		else if (cards == null)
		{
			System.out.println("Player 2 won the game!");
		}
			
						
	
} 
	
	public static void main(String[] args) 
	{
		new War();	
		
	}
}
