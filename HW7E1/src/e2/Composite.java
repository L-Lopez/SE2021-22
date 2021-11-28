package e2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	
	private List<Component> olteams;
	private String name;
	private int numberathletes;
	private int numbergold;
	
	public Composite (String name, int ath, int gold) {
		olteams = new ArrayList<>();
		this.name = name;
		this.numberathletes = ath;
		this.numbergold = gold;
	}
	
	@Override
	public void print() {
		System.out.println(name + ", Athletes: " + numberathletes + ", Gold Medals: " + numbergold);
		olteams.forEach(Component::print);
		
	}
	
	public void addTeam(Component team) {
		olteams.add(team);
	}
	
	public void removeTeam(Component team) {
		olteams.remove(team);
	}

}
