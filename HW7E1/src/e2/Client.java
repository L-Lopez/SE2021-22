package e2;

public class Client {

	public static void main(String[] args) {
		Composite olympics = new Composite("Olympic Teams", 110, 110);
		
		//Continents
		Composite asia = new Composite("Asia", 50, 50);
		Composite africa = new Composite("Africa", 20, 20);
		Composite europe = new Composite("Europe", 20, 20);
		Composite samerica = new Composite("South America", 20, 20);
		
		//Countries
		Composite china = new Composite("China", 40, 40);
		Composite afghanistan = new Composite("Afghanistan", 10, 10);
		
		Composite germany = new Composite("Germany", 15, 15);
		
		//Gender
		Composite wChina = new Composite("Womens Team China", 20, 20);
		Composite mChina = new Composite("Mens Team China", 20, 20);
		
		Composite wGermany = new Composite("Womens Team Germany", 10, 10);
		Composite mGermany = new Composite("Mens Team Germany", 5, 5);
		
		//Sports
		OlympicsTeam teakwondo = new OlympicsTeam("Womens Teakwondo", 5, 5);
		OlympicsTeam waterpolo = new OlympicsTeam("Womens Waterpolo", 10, 10);
		OlympicsTeam gym = new OlympicsTeam("Womens Gymnastics", 5, 5);
		OlympicsTeam shooting = new OlympicsTeam("Mens Shooting", 20, 20);
		
		OlympicsTeam cycling = new OlympicsTeam("Womens Cycling", 5, 5);
		OlympicsTeam tennis = new OlympicsTeam("Womens Tennis", 5, 5);
		OlympicsTeam table = new OlympicsTeam("Mens Tabletennis", 3, 3);
		OlympicsTeam football = new OlympicsTeam("Mens Football", 2, 2);
		
		
		asia.addTeam(china);
		asia.addTeam(afghanistan);
		europe.addTeam(germany);
		
		china.addTeam(wChina);
		china.addTeam(mChina);
		germany.addTeam(wGermany);
		germany.addTeam(mGermany);
		
		wChina.addTeam(teakwondo);
		wChina.addTeam(waterpolo);
		wChina.addTeam(gym);
		mChina.addTeam(shooting);
		wGermany.addTeam(cycling);
		wGermany.addTeam(tennis);
		mGermany.addTeam(table);
		mGermany.addTeam(football);
		
		olympics.addTeam(asia);
		olympics.addTeam(africa);
		olympics.addTeam(europe);
		olympics.addTeam(samerica);
		
		mGermany.print();
		System.out.println();
		germany.print();
		System.out.println();
		asia.print();
		System.out.println();
		olympics.print();
		
	}

}
