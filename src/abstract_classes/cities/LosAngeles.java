package abstract_classes.cities;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	}

	double getAnnualTaxes() {
		double taxes = population * growthRate;
		double bonus = 0.5 * growthRate;
		return taxes * bonus;
	}
}
