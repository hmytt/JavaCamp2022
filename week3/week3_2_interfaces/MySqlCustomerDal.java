package week3_2_interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository {

	@Override
	public void add() {
		System.out.println("My Sql eklendi");
	}
}
