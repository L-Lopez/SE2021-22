package betmore_game;

public class Game_Chair {
	
	Player Computer;
	Player Player_2;
	
	public Game_Chair() {
		Computer = new Player();
		Player_2 = new Player();
		
		Computer.user_selected = true;
		Player_2.user_selected = false;
		
		start(Computer);
		start(Player_2);
		
		findWinner(Computer, Player_2);
	}
	
	public void start(Player player) {
		player.play();
	}
	
	public Player findWinner(Player player1, Player player2) {
		if (player1.card_number > player2.card_number) {
			return player1;
		} else {
			return player2;
		}
	}
	
}
