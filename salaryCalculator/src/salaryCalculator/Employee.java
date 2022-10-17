package salaryCalculator;

public class Employee 
{
	String name;
	int salary;
	int workHour;
	int hireYear;

	public Employee(String _name, int _salary, int _workHour, int _hireYear) 
	{ 
		if(_salary<=0)
	{
		System.out.println("Maaş bilgisini yanlış girdiniz");
		
	}
	else 
	{
		salary = _salary;
		
	}
		name = _name;
		workHour = _workHour;
		hireYear = _hireYear;

	}

	public double tax()
	{
		if (salary > 1000)
		{
			return salary*0.03;

		} 
		
		else
		{
			return 0;
		}

	}

	public double bonus() 
	{
		if (workHour > 40) 
		{
			return (workHour - 40) * 30;
		} 
		
		else 
		{
			return 0;
		}

	}

	public double raiseSalary() 
	{
		double raise; // maaş artışını tutar.
		
		if (2021 - hireYear < 10) 
		{
			raise =salary * 0.05;
			return raise;
		}
		
		else if (2021 - hireYear > 9 && 2021 - hireYear < 20) 
		{
			raise =salary * 0.10;
			return raise;
		} 
		
		else
		{
			raise=salary * 0.15;
			return raise;
		}

	}

}
