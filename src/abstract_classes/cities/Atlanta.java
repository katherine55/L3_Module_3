package abstract_classes.cities;

public class Atlanta extends City {

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	double getAnnualTaxes() {
		double taxes = population * growthRate;
		double bonus = 2 * growthRate;
		return taxes * bonus;
	}
}
