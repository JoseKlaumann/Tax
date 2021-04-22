package entities;

public class LegalPerson extends Contributers {
	
	private Integer numberOfEmployees;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double totalTax() {
		if (numberOfEmployees <= 10) {
			return super.getAnnualIncome() * 0.16;
		} else {
			return super.getAnnualIncome() * 0.14;
		}
	}
	
	@Override
	public String toString() {
		return super.getName() + ": $ " + String.format("%.2f", totalTax());
	}
}
