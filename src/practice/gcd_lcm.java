package practice;
import java.util.*;

public class gcd_lcm {

	public static void main(String[] args) {
//		최대공약수 greatest common denominator (gcd)
//		최소공배수 least common multiple (lcm)
//		ex)180 72
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int factor = 0;
		int multi = 0;
		
		for(int i =1; i<=min; i++) { //최대공약수 구하기 -> 1~작은수로 계속 나누다가 나머지가 0이되는 수
			if(max % i ==0 && min % i ==0) {
				factor = i;
			}
		}
		
//		최소공배수는  max*min/최대공약수 = 두수의곱 / 최대공약수
		multi = min * max / factor;
		System.out.println("최대공약수 = " + multi);
		
		
		System.out.println("최대공약수 : " + factor);
//		System.out.println("max = " + max);
//		System.out.println("min = " + min);
	}

}
