package betmore_game;

public class BetMore_Game {
	
	Shuffle s;
	
	public int pick_card() {
		s = new Shuffle();
		return s.card_number;
	}

}
