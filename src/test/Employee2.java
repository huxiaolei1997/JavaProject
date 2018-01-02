package test;

import java.time.LocalDate;

public class Employee2 extends Person implements Cloneable{
	private double salary;
	private LocalDate hireDay;
	
	public Employee2(String name, double salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	public Employee2(String name, double salary) {
		// TODO Auto-generated constructor stub
		super(name);
		this.salary = salary;
	}
	
	@Override
	public Employee2 clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Employee2) super.clone();
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	public String getDescription() {
		return String.format("an employee with a salary of $%.2f",salary);
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
