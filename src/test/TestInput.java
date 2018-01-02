package test;

import java.util.Scanner;

public class TestInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = new String[3];
		for (int i = 0; i < 3; i++) {
			inputs[i] = scanner.next();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(inputs[i]);
		}

	}

}
