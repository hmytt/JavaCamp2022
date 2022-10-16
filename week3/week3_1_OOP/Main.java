package week3_1_OOP;

public class Main {

	public static void main(String[] args) {

//		CreditManager creditManager = new CreditManager();
//		creditManager.calculate();
//		creditManager.save();
//
//		Customer customer = new Customer();
//		customer.id = 1;
//		customer.city = "Ankara";
//		
//
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.Save();
//		customerManager.Delete();
//
//		Company company = new Company();
//		company.TaxNumber = "1000000";
//		company.CompanyName = "Arçelik";
//		company.id = 100;
//		
//
//		CustomerManager customerManager2 = new CustomerManager(new Person());
//
//		Person person = new Person();
//		person.firstName = "Engin";
//		person.nationalIdentity = "123456";
//
//		Customer c1 = new Customer();		
//		Customer c3 = new Person();
//		Customer c2 = new Company();

		// IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();

	}
}

//////////////////////////////////////////////////////////////////////////

class CreditManager {
	public void calculate() {

		System.out.println("Hesaplandı...");

	}

	public void save() {

		System.out.println("Kredi Verildi...");

	}
}

interface ICreditManager {

	void calculate();

	void save();

}

abstract class BaseCreditManager implements ICreditManager {

	public abstract void calculate();

	public void save() {
		System.out.println("Kaydedildi...");
	}

}

class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {

		// hesaplamalar
		System.out.println("Öğretmen Kredisi Hesaplandı...");
	}

}

class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Asker Kredisi Hesaplandı...");
	}

}

class CarCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Araç Kredisi Hesaplandı...");

	}

}

//////////////////////////////////////////////////////////////////////////

class Customer {

	public Customer() {

		System.out.println("Müşteri Nesnesi Başlatıldı.");

	}

	public int id;
	public String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

class Person extends Customer {

	public String firstName;
	public String lastName;
	public String nationalIdentity;

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

class Company extends Customer {

	public String CompanyName;
	public String TaxNumber;

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getTaxNumber() {
		return TaxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;
	}

}

class CustomerManager {

	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {

		_customer = customer;
		_creditManager = creditManager;

	}

	public void Save() {

		System.out.println("Müşteri Kaydedildi... ");

	}

	public void Delete() {

		System.out.println("Müşteri Silindi... ");

	}

	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Kredi Verildi...");
		_creditManager.save();
	}

}
