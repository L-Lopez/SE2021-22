package e2;

public class OlympicsTeam implements Component {
	
	String name;
	int numberath;
	int numbergold;
	
	public OlympicsTeam(String name, int ath, int gold) {
		this.name = name;
		this.numberath = ath;
		this.numbergold = gold;
	}
	
	@Override
	public void print() {
		System.out.println("\tTeam: " + name + ", Athletes: " + numberath + ", Gold Medals: " + numbergold);
		
	}

}
