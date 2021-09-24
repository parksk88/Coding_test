package lomin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class guganhap {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br. readLine();
		int guganFrom = 2;
		int guganTo = 4;
		int result = 0;
		String[] arry = input.split(" ");
		for(int i=guganFrom-1; i<guganTo; i++) {
			result += Integer.parseInt(arry[i]);
			System.out.println("arry["+i+"]"+Integer.parseInt(arry[i]));
		}
		System.out.println("result = " + result);
	}

}
