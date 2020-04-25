
/**
 * This class provides methods which determine the tax rate and amount owed for a Person via implementing the various methods defined in the Taxable interface.
 * @author Benjamin Westburg
 */
public class SingleFiler implements Taxable 
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
			return 10; // 10% tax rate
		}
		if (taxableIncome >= 9876 && taxableIncome <= 40125)
		{
			return 12; // 12% tax rate
		}
		if (taxableIncome >= 40126 && taxableIncome <= 85525)
		{
			return 22; // 22% tax rate
		}
		if (taxableIncome >= 85526 && taxableIncome <= 163300)
		{
			return 24; // 24% tax rate
		}
		if (taxableIncome >= 163301 && taxableIncome <= 207350)
		{
			return 32; // 32% tax rate
		}
		if (taxableIncome >= 207351 && taxableIncome <= 518400)
		{
			return 35; // 35% tax rate
		}
		if (taxableIncome >= 518401)
		{
			return 37; // 37% tax rate
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
			return (((taxableIncome - 518400) * .37) + 156235);
		}
		else
		{
			return 0;
		}
	}
}
