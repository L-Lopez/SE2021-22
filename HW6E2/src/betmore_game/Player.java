package betmore_game;

public class Player {
	
	BetMore_Game Bet;
	int card_number;
	boolean user_selected;
	
	public int play() {
		Bet = new BetMore_Game();
		int counter = 0;
		
		while (!user_selected && counter < 5) {
			card_number = Bet.pick_card();
			//User decides whether s/he wants to take the number
			counter++;
		}
		
		return card_number;
	}
}
