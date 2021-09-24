package lomin;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class onejuyul {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br. readLine();
		double py = Math.PI;
		
		System.out.printf("%."+input+"f", py);
//		System.out.println("input : " + input);
	}

}
