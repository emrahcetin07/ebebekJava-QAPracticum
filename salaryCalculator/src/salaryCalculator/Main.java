package salaryCalculator;

public class Main {

	public static void main(String[] args) {

		double totalSalary; // Toplam maaş bilgisini tutar
		double salaryWBT;  // vergi ve bonuslar ile birlikte maaş bilgisini tutar

		Employee employee = new Employee("Emrah çetin", 2000, 45, 1985);
		
		
		
                salaryWBT = employee.salary+employee.bonus()-employee.tax();  //vergi, bonus ve çalışanın kendi maaşı ile bulunacak.
		totalSalary = salaryWBT+employee.raiseSalary();      // çalışanın kendi maaşı +artış+ bonus

		
		System.out.println("Adı : " + employee.name);
		System.out.println("Maaşı : " + employee.salary);
		System.out.println("Çalışma Saati : " + employee.workHour);
		System.out.println("Başlangıç yılı : " + employee.hireYear);
		System.out.println("Vergi : " + employee.tax());
		System.out.println("Bonus : " + employee.bonus());
		System.out.println("Maaş Artışı : " + employee.raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + salaryWBT);
		System.out.println("Toplam maaş : " + totalSalary);
		
	}

}

