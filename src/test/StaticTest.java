package test;

public class StaticTest {
	private static int a;
	private int b;
	static {
		StaticTest.a = 3;
		System.out.println(a);
		StaticTest staticTest = new StaticTest();
		staticTest.f();
		staticTest.b = 100;
		System.out.println(staticTest.b);
	}
	static {
		StaticTest.a = 4;
		System.out.println(a);
	}
	public static void main(String[] args){
		
	}
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("hello,world");
	}
}
