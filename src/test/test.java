package test;

import java.io.PrintWriter;

public class test {
	public static void main(String[] args) {
//		int ref;
//		int y = 0;
//		int[] index = new int[4];
//		index[0] = 1;
//		index[1] = 3;
//		index[2] = 0;
//		index[3] = 2;
//		String[] islands = new String[4];
//		islands[0] = "Bermuda";
//		islands[1] = "Fiji";
//		islands[2] = "Azores";
//		islands[3] = "Cozumel";
//		while (y < 4) {
//			ref = index[y];
//			System.out.print("island = ");
//			System.out.println(islands[ref]);
//			y = y + 1;
//		}
		long startTime=System.nanoTime();   //获取开始时间
		 
		PrintN(10000);  //测试的代码段
		 
		long endTime=System.nanoTime(); //获取结束时间
		 
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
		
		long startTime1=System.nanoTime();   //获取开始时间
		 
		PrintN2(10000);  //测试的代码段
		 
		long endTime1=System.nanoTime(); //获取结束时间
		 
		System.out.println("程序运行时间： "+(endTime1-startTime1)+"ns");
	}
	public static void PrintN(int N) {
		int i;
		for (i = 1; i <= N; i++) {
			System.out.printf("%d",i);
		}
	}
	
	public static void PrintN2(int N) {
		if ( N > 0) {
			PrintN2(N - 1);
			System.out.printf("%d",N);
		}
	}
}
