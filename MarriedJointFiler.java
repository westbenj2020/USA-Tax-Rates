
/**
 * This class provides methods which determine the tax rate and amount owed for a Person via implementing the various methods defined in the Taxable interface.
 * @author Benjamin Westburg
 */
public class MarriedJointFiler implements Taxable 
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
		if (taxableIncome <= 19750 && taxableIncome >= 0)
		{
			return 10; // 10%
		}
		if (taxableIncome <= 80250 && taxableIncome >= 19751)
		{
			return 12; // 12%
		}
		if (taxableIncome <= 171050 && taxableIncome >= 80251)
		{
			return 22; // 22%
		}
		if (taxableIncome <= 326600 && taxableIncome >= 171051)
		{
			return 24; // 24%
		}
		if (taxableIncome <= 414700 && taxableIncome >= 326601)
		{
			return 32; // 32%
		}
		if (taxableIncome <= 622050 && taxableIncome >= 414701)
		{
			return 35; // 35%
		}
		if (taxableIncome >= 622051)
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
			return (taxableIncome * .10);
		}
		if (taxRate == 12)
		{
			return (((taxableIncome - 19750) * .12) + 1975);
		}
		if (taxRate == 22)
		{
			return (((taxableIncome - 80250) * .22) + 9235);
		}
		if (taxRate == 24)
		{
			return (((taxableIncome - 171050) * .24) + 29211);
		}
		if (taxRate == 32)
		{
			return (((taxableIncome - 326600) * .32) + 66543);
		}
		if (taxRate == 35)
		{
			return (((taxableIncome - 414700) * .35) + 94735);
		}
		if (taxRate == 37)
		{
			return (((taxableIncome - 622050) * .37) + 167307.50);
		}
		else
		{
			return 0;
		}	
	}
}
