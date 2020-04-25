
/**
 * This class provides methods which determine the tax rate and amount owed for a Person via implementing the various methods defined in the Taxable interface.
 * @author Benjamin Westburg
 */
public class MarriedSeparateFiler implements Taxable 
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
		if (taxableIncome <= 9875 && taxableIncome >= 0)
		{
			return 10; // 10%
		}
		if (taxableIncome <= 40125 && taxableIncome >= 9876)
		{
			return 12; // 12%
		}
		if (taxableIncome <= 85525 && taxableIncome >= 40126)
		{
			return 22; // 22%
		}
		if (taxableIncome <= 163300 && taxableIncome >= 85526)
		{
			return 24; // 24%
		}
		if (taxableIncome <= 207350 && taxableIncome >= 163301)
		{
			return 32; // 32%
		}
		if (taxableIncome <= 311025 && taxableIncome >= 207351)
		{
			return 35; // 35%
		}
		if (taxableIncome >= 311026)
		{
			return 37; // 37%
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
			return (taxableIncome * 10);
		}
		if (taxRate == 12)
		{
			return (((taxableIncome - 9875) * .12) + 987.50);
		}
		if (taxRate == 22)
		{
			return (((taxableIncome - 40125) * .22) + 4617.50);
		}
		if (taxRate == 24)
		{
			return (((taxableIncome - 85525) * .24) + 14605.50);
		}
		if (taxRate == 32)
		{
			return (((taxableIncome - 163300) * .32) + 33271.50);
		}
		if (taxRate == 35)
		{
			return (((taxableIncome - 207350) * .35) + 47367.50);
		}
		if (taxRate == 37)
		{
			return (((taxableIncome - 311025) * .37) + 83653.75);
		}
		else
		{
			return 0;
		}
	}
}
