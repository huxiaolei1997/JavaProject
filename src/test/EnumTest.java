package test;

import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a size:(SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
		String input = in.next().toUpperCase();
		// 返回指定名字、给定类的枚举常量
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("size=" + size);
		System.out.println("abbreviation=" + size.getAbbreviation());
		if (size == Size.EXTRA_LARGE) {
			System.out.println("Good job-- you paid attention to the _.");
		}
	}
	
	enum Size{
		SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
		private String abbreviation;
		private Size(String abbreviation) {
			this.abbreviation = abbreviation;
		}
		public String getAbbreviation() {
			return abbreviation;
		}

	}
}
