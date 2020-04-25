
/**
 * This class provides methods which determine the tax rate and amount owed for a Person via implementing the various methods defined in the Taxable interface.
 * @author Benjamin Westburg
 */
public class HeadofHouseholdFiler implements Taxable 
{
	@Override
	public double getTaxRate() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setTaxRate(double taxableIncome) 
	{
		if (taxableIncome <= 14100 && taxableIncome >= 0)
		{
			return 10; // 10%
		}
		if (taxableIncome <= 53700 && taxableIncome >= 14101)
		{
			return 12; // 12%
		}
		if (taxableIncome <= 85500 && taxableIncome >= 53701)
		{
			return 22;
		}
		if (taxableIncome <= 163301 && taxableIncome >= 85501)
		{
			return 24;
		}
		if (taxableIncome <= 207351 && taxableIncome >= 163301)
		{
			return 32;
		}
		if (taxableIncome <= 518400 && taxableIncome >= 207351)
		{
			return 35;
		}
		if (taxableIncome >= 518401)
		{
			return 37;
		}
		else
		{
			return 0;
		}	
	}

	@Override
	public double getTaxesOwed() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double setTaxesOwed(int taxRate, double taxableIncome) 
	{
		if (taxRate == 10)
		{
			return (taxableIncome * .10);
		}
		if (taxRate == 12)
		{
			return (((taxableIncome - 14100) * .12) + 1410);
		}
		if (taxRate == 22)
		{
			return (((taxableIncome - 53700) * .22) + 6162);
		}
		if (taxRate == 24)
		{
			return (((taxableIncome - 85500) * .24) + 13158);
		}
		if (taxRate == 32)
		{
			return (((taxableIncome - 163300) * .32) + 31830);
		}
		if (taxRate == 35)
		{
			return (((taxableIncome - 207350) * .35) + 45926);
		}
		if (taxRate == 37)
		{
			return (((taxableIncome - 518400) * .37) + 154793.50);
		}
		else
		{
			return 0;
		}	
	}
}
