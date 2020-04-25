
/**
 * This interface provides methods that are implemented in the various classes which implement the interface. Taxable provides flexible functionality for varying tax rates and amounts owed
 * relative to a filing status.
 * @author Benjamin Westburg
 */
public interface Taxable 
{
	/**
	 * This method returns the tax rate.
	 * @return double, a double data type.
	 */
	public double getTaxRate();
	
	/**
	 * This method set the tax rate.
	 * @param taxableIncome, a double data type.
	 * @return int, an integer data type.
	 */
	public int setTaxRate(double taxableIncome);
	
	/**
	 * This method returns the taxes owed.
	 * @return double, a double data type.
	 */
	public double getTaxesOwed();
	
	/**
	 * This method sets the taxes owed.
	 * @param taxRate, an integer data type.
	 * @param taxableIncome, a double data type.
	 * @return double, a double data type.
	 */
	public double setTaxesOwed(int taxRate, double taxableIncome);
}
