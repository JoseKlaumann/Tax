package entities;

public class PhysicalPerson extends Contributers{
	
	private Double healthExpenses;
	
	public PhysicalPerson() {
		super();
    }

	public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}
	
	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double totalTax() {
		if (super.getAnnualIncome() < 20000.00) {
			return (super.getAnnualIncome() * 0.15) - (healthExpenses * 0.5);
		} else {
			return (super.getAnnualIncome() * 0.25) -  (healthExpenses * 0.5);
		}
	}
	
	@Override
	public String toString() {
		return super.getName() + ": $ " + String.format("%.2f", totalTax());
	}
}
