package entities;

public class Individual extends TaxPayer{

	private Double healthExpenditure;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double income, Double healthExpenditure) {
		super(name, income);
		this.healthExpenditure = healthExpenditure;
	}

	public Double getHealthExpenditure() {
		return healthExpenditure;
	}

	public void setHealthExpenditure(Double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}

	@Override
	public double tax() {
		if(super.getIncome() >= 20000.00) {
			return (super.getIncome() * 0.25) - (healthExpenditure * 0.50);
		}
		else {
			return (super.getIncome() * 0.15) - (healthExpenditure * 0.50);
		}
	}

}
