package test;

public class ManagerTest {
	public static void main(String[] args) {
		Manager manager = new Manager("Bob",80000.0);
		manager.setBonus(5000);
		Employee[] employees = new Employee[3];
		employees[0] = manager;
		employees[1] = new Employee("Alice", 50000.0);
		employees[2] = new Employee("Tim", 30000.0);
		// 需要提到的是，employee.getSalary()，调用能够确定应该执行哪个getSalary()方法。
		// 请注意，尽管这里将employee声明为Employee类型，但实际上employee既可以引用Employee类型的对象，也可以引用
		// Manager类型的对象，当employee引用Employee对象时，employee.getSalary()调用的是Employee类中的方法；当employee
		// 引用Manager对象时，employee.getSalary()调用的是Manager类中的getSalary()方法。虚拟机知道employee实际引用的对象类型，因此能够正确的调用相应的方法
		for (Employee employee : employees) {
			System.out.println("name:" + employee.getName() + " ,salary:" + employee.getSalary());
		}
	} 
 }
