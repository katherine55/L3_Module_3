package abstract_classes.cities;

public class Boston extends City {
	
	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	double getAnnualTaxes() {
		double taxes = population * growthRate;
		double bonus = 0.5 * population;
		return taxes + bonus;
	}
}
