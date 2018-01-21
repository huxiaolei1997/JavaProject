package test;

public class test2 {
	private int id;
	private String name;
	private String address;
	
	public test2(int id, String name, String address) {
		// 增加了注释
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

		public test2() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		test2 test = new test2(); // 如果一个类中提供了有参构造器，而没有提供无参构造器，那么将不能创建该类所对应
		                          // 所对应的对象，必须要手动添加一个无参构造器，如果在一个类中，没有任何构造器，那么会
								  // 提供一个无参构造器 
	}

}
