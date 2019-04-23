package entities;

public class Individual extends Payers {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public final Double taxesToPaid() {		
		if (healthExpenditures > 0.0) {
			if (getAnualIncome() < 20000.00) {
				return getAnualIncome() * 0.15 - healthExpenditures * 0.50;
			}
			else if (getAnualIncome() >= 20000.00) {
				return getAnualIncome() * 0.25 - healthExpenditures * 0.50;
			}
		}
		else {
			if (getAnualIncome() < 20000.00) {
				return getAnualIncome() * 0.15;
			}
			else if (getAnualIncome() >= 20000.00) {
				return getAnualIncome() * 0.25;
			}
		}
		return null;
	}
}
