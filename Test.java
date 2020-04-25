import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class functions as a test harness for the various classes defined within the package.
 * @author Benjamin Westburg
 */
public class Test 
{
	public static void main(String[] args)
	{
		File people = new File("people.txt"); // file containing data of people filing taxes.
		try 
		{
			FileReader fr = new FileReader(people);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] data = line.split("\\^"); // parsing data.
				if (data[0].contentEquals("Single")) // this decision structure creates objects for "Single" filers and uses the data within the file provided to populate it's attributes with relevant data.
				{
					Person p = new Person((new SingleFiler()));
					p.setFirstName(data[1]);
					p.setLastName(data[2]);
					p.setFullName(p.getFirstName() + " " + p.getLastName());
					p.setHomeAddress(data[3]);
					p.setPhoneNumber(data[4]);
					p.setJob(data[5]);
					p.setTaxableIncome(Double.parseDouble(data[6]));
					Trust t = new Trust();
					p.setTrust(t);
					t.setTaxableIncome(Double.parseDouble(data[7]));
					t.setTaxOwed(t.getTaxableIncome());
					System.out.println(p.getFullName() + "'s taxable income this past year was $" + p.getTaxableIncome() + ". " + p.getFirstName() + " has a tax rate of " + p.useTaxablesetTaxRate(p.getTaxableIncome()) + "% and owes $" + // Printing the person's tax information.
					p.useTaxablesetTaxesOwed(p.useTaxablesetTaxRate(p.getTaxableIncome()), p.getTaxableIncome()) + ". $" + t.getTaxOwed() + " is being collected from " + p.getFirstName() + "'s trust.");
				}
				if (data[0].contentEquals("Married filing jointly")) // this decision structure creates objects for "Married filing jointly" filers and performs a similar process.
				{
					Person p = new Person((new MarriedJointFiler()));
					p.setFirstName(data[1]);
					p.setLastName(data[2]);
					p.setFullName(p.getFirstName() + " " + p.getLastName());
					p.setHomeAddress(data[3]);
					p.setPhoneNumber(data[4]);
					p.setJob(data[5]);
					p.setTaxableIncome(Double.parseDouble(data[6]));
					Trust t = new Trust();
					p.setTrust(t);
					t.setTaxableIncome(Double.parseDouble(data[7]));
					t.setTaxOwed(t.getTaxableIncome());
					System.out.println(p.getFullName() + "'s taxable income this past year was $" + p.getTaxableIncome() + ". " + p.getFirstName() + " has a tax rate of " + p.useTaxablesetTaxRate(p.getTaxableIncome()) + "% and owes $" + // Printing the person's tax information.
					p.useTaxablesetTaxesOwed(p.useTaxablesetTaxRate(p.getTaxableIncome()), p.getTaxableIncome()) + ". $" + t.getTaxOwed() + " is being collected from " + p.getFirstName() + "'s trust.");		
				}
				if (data[0].contentEquals("Married filing separately")) // and for "Married filing separately" filers, more of the same...
				{
					Person p = new Person((new MarriedSeparateFiler()));
					p.setFirstName(data[1]);
					p.setLastName(data[2]);
					p.setFullName(p.getFirstName() + " " + p.getLastName());
					p.setHomeAddress(data[3]);
					p.setPhoneNumber(data[4]);
					p.setJob(data[5]);
					p.setTaxableIncome(Double.parseDouble(data[6]));
					Trust t = new Trust();
					p.setTrust(t);
					t.setTaxableIncome(Double.parseDouble(data[7]));
					t.setTaxOwed(t.getTaxableIncome());
					System.out.println(p.getFullName() + "'s taxable income this past year was $" + p.getTaxableIncome() + ". " + p.getFirstName() + " has a tax rate of " + p.useTaxablesetTaxRate(p.getTaxableIncome()) + "% and owes $" + // Printing the person's tax information.
					p.useTaxablesetTaxesOwed(p.useTaxablesetTaxRate(p.getTaxableIncome()), p.getTaxableIncome()) + ". $" + t.getTaxOwed() + " is being collected from " + p.getFirstName() + "'s trust.");
				}
				if (data[0].contentEquals("Head of household")) // and finally "Head of household" filers.
				{
					Person p = new Person((new HeadofHouseholdFiler()));
					p.setFirstName(data[1]);
					p.setLastName(data[2]);
					p.setFullName(p.getFirstName() + " " + p.getLastName());
					p.setHomeAddress(data[3]);
					p.setPhoneNumber(data[4]);
					p.setJob(data[5]);
					p.setTaxableIncome(Double.parseDouble(data[6]));
					Trust t = new Trust();
					p.setTrust(t);
					t.setTaxableIncome(Double.parseDouble(data[7]));
					t.setTaxOwed(t.getTaxableIncome());
					System.out.println(p.getFullName() + "'s taxable income this past year was $" + p.getTaxableIncome() + ". " + p.getFirstName() + " has a tax rate of " + p.useTaxablesetTaxRate(p.getTaxableIncome()) + "% and owes $" + // Printing the person's tax information.
					p.useTaxablesetTaxesOwed(p.useTaxablesetTaxRate(p.getTaxableIncome()), p.getTaxableIncome()) + ". $" + t.getTaxOwed() + " is being collected from " + p.getFirstName() + "'s trust.");			
				}
				}
			br.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		File companies = new File("companies.txt");
		try
		{
			FileReader fr = new FileReader(companies);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] data = line.split("\\^");
				Corporation c = new Corporation();
				c.setName(data[0]);
				c.setIndustry(data[1]);
				c.setTaxableRevenue(Double.parseDouble(data[2]));
				c.setAmountOfEmployees(Integer.parseInt(data[3]));
				c.setHeadquarters(data[4]);
				c.setTaxesOwed(c.getTaxableRevenue());
				System.out.println(c.getName() + " made $" + c.getTaxableRevenue() + " in taxable revenue last year. Thus, $" + c.getTaxesOwed() + " must be paid in taxes.");
			}
			br.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}	
}
