package programmers;
import java.util.*;

public class gdc_lcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int factor = 0;
		int lcm =0;
		//gcd
		for(int i=1; i<=min; i++) {
			if(max % i == 0 && min % i == 0) {
				factor = i;
			}
		}
		System.out.println("최대공약수 : " + factor);
		
		//lcm
		lcm = max * min / factor;
		System.out.println("최소공배수 : " + lcm);
	}

}
