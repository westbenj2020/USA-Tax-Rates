import java.util.ArrayList;

/**
 * This class models a Corporation by associating the appropriate attributes and methods.
 * @author Benjamin Westburg
 */
public class Corporation 
{
	private String name;
	private String industry;
	private int amountOfEmployees;
	private String headquarters;
	private ArrayList<Person> employees;
	private Trust trust;
	private final int taxRate = 21; // 21% 
	private double taxableRevenue;
	private double taxesOwed;
	
	/**
	 * This method returns the name of a Corporation.
	 * @return name, a string data type.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * This method sets the name of a Corporation.
	 * @param name, a string data type.
	 */
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getIndustry() 
	{
		return industry;
	}

	public void setIndustry(String industry) 
	{
		this.industry = industry;
	}

	public int getAmountOfEmployees()
	{
		return amountOfEmployees;
	}

	public void setAmountOfEmployees(int amountOfEmployees) 
	{
		this.amountOfEmployees = amountOfEmployees;
	}

	public String getHeadquarters() 
	{
		return headquarters;
	}

	public void setHeadquarters(String headquarters) 
	{
		this.headquarters = headquarters;
	}

	/**
	 * This method returns the employees of a Corporation.
	 * @return employees, an ArrayList of Person objects.
	 */
	public ArrayList<Person> getEmployees() 
	{
		return employees;
	}
	
	/**
	 * This method sets the employees of a Corporation.
	 * @param employees, an ArrayList of Person objects.
	 */
	public void setEmployees(ArrayList<Person> employees) 
	{
		this.employees = employees;
	}
	
	/**
	 * This method returns the Trust associated with a Corporation.
	 * @return trust, a Trust type.
	 */
	public Trust getTrust() 
	{
		return trust;
	}
	
	/**
	 * This method sets the Trust associated with a Corporation.
	 * @param trust, a Trust type.
	 */
	public void setTrust(Trust trust)
	{
		this.trust = trust;
	}
	
	/**
	 * This method returns the constant tax rate for a Corporation.
	 * @return taxRate, an integer data type.
	 */
	public int getTaxRate() 
	{
		return taxRate;
	}

	/**
	 * This method returns the amount of taxable revenue accrued by a Corporation.
	 * @return taxableRevenue, a double data type.
	 */
	public double getTaxableRevenue() 
	{
		return taxableRevenue;
	}

	/**
	 * This method sets the amount of taxable revenue accrued by a Corporation.
	 * @param taxableRevenue, a double data type.
	 */
	public void setTaxableRevenue(double taxableRevenue) 
	{
		this.taxableRevenue = taxableRevenue;
	}

	/**
	 * This method returns the amount of money owed by a Corporation according to current tax laws.
	 * @return taxesOwed, a double data type.
	 */
	public double getTaxesOwed() 
	{
		return taxesOwed;
	}

	/**
	 * This method sets the amount of money owed by a Corporation according to current tax laws.
	 * @param taxesOwed, a double data type.
	 */
	public void setTaxesOwed(double taxableRev) 
	{
		this.taxesOwed = taxableRev * taxRate;
	}
	
}
