package test;

import java.util.Random;

public class ConstructorTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("harry",40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		// print out information about all Employee objects
		for (Employee e : staff) {
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
		}
	}
	
}

class Employee {
	private static int nextId;
	
	private int id;
	private String name = "";
	private double salary;
	
	// static initialization block
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	
	// object initialization block
	{
		id = nextId;
		nextId++;
	}
	
	// three overloaded constructors
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	
	public Employee(double s) {
		// call the Employee(String, double) constructor
		this("Employee #" + nextId, s);
	}
	
	// the default constructor
	public Employee() {
		// name initialzed to "" --see above
		// salary not explicitly set -- initialized to 0
		// id initialized in initialization block
	}

	public int getId() {
		return id;
	}

	public String getName() {
		// 增加了注释
		return name;
	}

	public double getSalary() {
		return salary;
	}

	
}