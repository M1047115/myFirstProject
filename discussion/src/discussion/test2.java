package discussion;

import java.util.ArrayList;
import java.util.Comparator;

public class test2 {

	public static void main(String args[])
	{
		ArrayList<Object> ar= new ArrayList();
		Employee ob=new Employee("abc",1);
		Employee ob1=new Employee("def",2);
		sortById a=new sortById();
		a.compare(ob,ob1);
		sortByName b=new sortByName();
		b.compare(ob, ob1);
	}
}
class Employee
{
	String name;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	int id;
}
class sortById implements Comparator
{
	@Override
	public int compare(Object ob, Object ob1) {
		// TODO Auto-generated method stub
		return ob.id-ob1.id;
	}
	
}

class sortByName implements Comparator
{

	@Override
	public int compare(Object ob, Object ob1) {
		// TODO Auto-generated method stub
		return ob.name.compareTo(ob1.name);
	}
	
}