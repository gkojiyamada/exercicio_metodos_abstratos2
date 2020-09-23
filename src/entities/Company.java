package entities;

public class Company extends TaxPayer{

	private Integer numberEmployee;
	
	public Company() {
		super();
	}

	public Company(String name, Double income, Integer numberEmployee) {
		super(name, income);
		this.numberEmployee = numberEmployee;
	}

	public Integer getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(Integer numberEmployee) {
		this.numberEmployee = numberEmployee;
	}

	@Override
	public double tax() {
		if(numberEmployee >= 10) {
			return super.getIncome() * 0.14;
 		}
		else {
			return super.getIncome() * 0.16;
		}
	}
	
	
}
