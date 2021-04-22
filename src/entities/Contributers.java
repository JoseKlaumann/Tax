package entities;

public abstract class Contributers {
	
	protected String name;
	private Double annualIncome;
	
	public Contributers() {	
	}

	public Contributers(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}
	
	public abstract Double totalTax();
	
	public abstract String toString();
}
