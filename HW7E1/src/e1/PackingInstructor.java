package e1;

public class PackingInstructor implements Visitor {
	
	String output;
	
	@Override
	public void visitGlass(Glass g) {
		output = (g.getName() + ": \n\tshould be wrapped with Bubble Wraps and packed in a box with dimension: "
				+ (g.getHeight()+1) + "x" + (g.getLength()+1) + "x" + (g.getWidth()+1));
	}

	@Override
	public void visitFurniture(Furniture f) {
		output = (f.getName() + ": \n\tshould be covered with waterproof covers with an area of: "
				+ (f.getLenght()) + "x" + f.getWidth());
		
	}

	@Override
	public void visitElectronic(Electronic e) {
		output = (e.getName() + ": \n\tshould be covered with Polyethylene foam film and packed in a box with dimension: "
				+ (e.getHeight()+1) + "x" + (e.getLenght()+1) + "x" + (e.getWidth()+1));
		
	}
	
	public void giveInstructions(HouseholdItem h) {
		h.accept(this);
	}
	
	public String getOutput() {
		return this.output;
	}

}
