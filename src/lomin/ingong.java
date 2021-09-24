package lomin;

import java.util.Scanner;

public class ingong {

	public static void main(String[] args) {
		//4
		// 3 4 4 2
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] layers = new int[n];
		int sum=0;
		int multiple=0;
		for(int i=0; i<n; i++) {
			layers[i] = sc.nextInt();
		}
		
		for(int z=0; z<(layers.length)-1; z++) {
			for(int x=z+1; x<(layers.length)-1; x++) {
				multiple = layers[z]*layers[x];
				System.out.println("z : "+ z + " " + "x : "+ x);
				System.out.println("multiple : " +multiple);
			}
			sum+=multiple;
			System.out.println("sum : " +sum);
		}
		System.out.println("final sum : " + sum);
		int answer = 0;
		System.out.println("answer : " + answer);
	}

}
