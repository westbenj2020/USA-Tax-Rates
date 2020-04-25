/**
 * This class models a Person by associating the appropriate attributes and methods.
 * @author Benjamin Westburg
 */
public class Person
{
	private Taxable taxable; // Taxable interface as a type
	private String firstName;
	private String lastName;
	private String fullName = firstName + " " + lastName;
	private String homeAddress;
	private String phoneNumber;
	private double taxableIncome;
	private Trust trust;
	private String job;
	private String filingStatus;
	
	/**
	 * No parameter constructor explicitly defined for optional usage
	 */
	public Person()
	{
		
	}
	
	/**
	 * This constructor grants the ability to pass one of the specific Taxable implementations as a parameter for our constructor. Here, we are getting around the diamond problem of inheritance.
	 * @param tax, a Taxable type
	 */
	public Person(Taxable tax) 
	{
		this.taxable = tax;
	}
	
	/**
	 * This method uses the designated Taxable implementation in order to set the tax rate for a Person.
	 * @param taxableIncome, a double data type
	 * @return int, the tax rate associated with this particular Taxable implementation's tax bracket.
	 */
	public int useTaxablesetTaxRate(double taxableIncome)
	{
		return taxable.setTaxRate(taxableIncome);
	}
	
	/**
	 * This method uses the designated Taxable implementation in order to set the tax amount owed for a Person.
	 * @param taxRate, an integer data type
	 * @param taxableIncome, a double data type
	 * @return double, the tax amount owed according to this particular Taxable implementation's tax bracket.
	 */
	public double useTaxablesetTaxesOwed(int taxRate, double taxableIncome)
	{
		return ((taxable.setTaxesOwed(taxRate, taxableIncome)) + this.getTrust().getTaxOwed());
	}

	/**
	 * This method returns the first name of a Person.
	 * @return String, a string data type.
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * This method sets the first name of a Person.
	 * @param firstName, a string data type.
	 */
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	/**
	 * This method returns the last name of a Person.
	 * @return lastName, a string data type.
	 */
	public String getLastName() 
	{
		return lastName;
	}

	/**
	 * This method sets the last name of a Person.
	 * @param lastName, a string data type.
	 */
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	/**
	 * This method returns the full name of a Person.
	 * @return fullName, a string data type.
	 */
	public String getFullName() 
	{
		return fullName;
	}

	/**
	 * This method sets the full name of a Person.
	 * @param fullName, a string data type.
	 */
	public void setFullName(String fullName) 
	{
		this.fullName = fullName;
	}

	/**
	 * This method returns the home address of a Person.
	 * @return homeAddress, a string data type.
	 */
	public String getHomeAddress() 
	{
		return homeAddress;
	}

	/**
	 * This method sets the home address of a Person.
	 * @param homeAddress, a string data type.
	 */
	public void setHomeAddress(String homeAddress) 
	{
		this.homeAddress = homeAddress;
	}

	/**
	 * This method returns the phone number of a Person.
	 * @return phoneNumber, a string data type.
	 */
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}

	/**
	 * This method sets the phone number of a Person.
	 * @param phoneNumber, a string data type.
	 */
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	/**
	 * This method returns the taxable income of a Person.
	 * @return taxableIncome, a double data type.
	 */
	public double getTaxableIncome() 
	{
		return taxableIncome;
	}

	/**
	 * This method sets the taxable income of a Person.
	 * @param taxableIncome, a double data type.
	 */
	public void setTaxableIncome(double taxableIncome) 
	{
		this.taxableIncome = taxableIncome;
	}

	/**
	 * This method returns the Trust associated with a Person.
	 * @return trust, a Trust type.
	 */
	public Trust getTrust() 
	{
		return trust;
	}

	/**
	 * This method sets the Trust associated with a Person.
	 * @param trust, a Trust type.
	 */
	public void setTrust(Trust trust) 
	{
		this.trust = trust;
	}

	/**
	 * This method returns the job of a Person.
	 * @return job, a string data type.
	 */
	public String getJob() 
	{
		return job;
	}

	/**
	 * This method sets the job of a Person.
	 * @param job, a string data type.
	 */
	public void setJob(String job) 
	{
		this.job = job;
	}

	/**
	 * This method returns the filing status of a Person.
	 * @return filingStatus, a string data type.
	 */
	public String getFilingStatus() 
	{
		return filingStatus;
	}

	/**
	 * This method sets the filing status of a Person.
	 * @param filingStatus, a string data type.
	 */
	public void setFilingStatus(String filingStatus) 
	{
		this.filingStatus = filingStatus;
	}
}
