package test;

public class CloneTest {

	public static void main(String[] args) {
		try {
			// 克隆
			Employee2 original = new Employee2("John Q", 50000);
			Employee2 copy = (Employee2) original.clone();
			copy.raiseSalary(10);
			System.out.println("original=" + original.getSalary());
			System.out.println("copy=" + copy.getSalary());
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
