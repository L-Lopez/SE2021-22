package e1;

public class MovingCalculator implements Visitor {
	
	double price;
	String output;
	
	@Override
	public void visitGlass(Glass g) {
		if (g.getTickness() == 1) {
			price = 2 *  g.getLength();
		} else if (g.getTickness() == 2) {
			price = 1.2 *  g.getLength();
		} else if (g.getTickness() == 3) {
			price = 0.7 *  g.getLength();
		}
		
		output = ("Total cost for " + g.getName() + " is: " + price);
		
	}

	@Override
	public void visitFurniture(Furniture f) {
		price = 0.25 * f.getWeight();
		
		output = ("Total cost for " + f.getName() + " is: " + price);
		
	}

	@Override
	public void visitElectronic(Electronic e) {
		if (e.getFragile()) {
			price = 0.5 * e.getWeight();
		} else {
			price = 0.33333333 * e.getWeight();
		}
		
		output = ("Total cost for " + e.getName() + " is: " + price);
		
	}
	
	public void calculateCost(HouseholdItem h) {
		h.accept(this);
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getOutput() {
		return this.output;
	}

}
