
/**
 * This class models a Trust by associating the appropriate attributes and methods.
 * @author Benjamin Westburg
 */
public class Trust 
{
	private double taxableIncome;
	private double taxOwed;
	
	/**
	 * This method returns the amount of taxable income accrued within the Trust.
	 * @return taxableIncome, a double data type.
	 */
	public double getTaxableIncome() 
	{
		return taxableIncome;
	}
	
	/**
	 * This method sets the amount of taxable income accrued within the Trust.
	 * @param taxableIncome, a double data type.
	 */
	public void setTaxableIncome(double taxableIncome) 
	{
		this.taxableIncome = taxableIncome;
	}
	
	/**
	 * This method returns the amount of money owed from a Trust according to current tax laws.
	 * @return taxOwed, a double data type.
	 */
	public double getTaxOwed() 
	{
		return taxOwed;
	}
	
	/**
	 * This method sets the amount of money owed from a Trust according to current tax laws.
	 * @param taxOwed, a double data type.
	 */
	public void setTaxOwed(double taxableIncome) 
	{
		if (taxableIncome <= 2250 && taxableIncome >= 0)
		{
			this.taxOwed = taxableIncome * .10;
		}
		if (taxableIncome <= 9150 && taxableIncome > 2550)
		{
			this.taxOwed = (((taxableIncome - 2550) * .24) + 255);
		}
		if (taxableIncome <= 12500 && taxableIncome > 9150)
		{
			this.taxOwed = (((taxableIncome - 9150) * .35) + 1839);
		}
		if (taxableIncome > 12500)
		{
			this.taxOwed = (((taxableIncome - 12500) * .37) + 3011.50);
		}
	}	
}
