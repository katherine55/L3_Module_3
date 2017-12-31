package abstract_classes.cities;

public class SanDiego extends City {

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	double getAnnualTaxes() {
		double taxes = population * growthRate;
		double bonus = 1000000;
		return taxes + bonus;
	}
}
