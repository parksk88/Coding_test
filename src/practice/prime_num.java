package practice;
import java.util.*;

public class prime_num {
	
	static final int MAX_NUM=1000;
	
	static boolean isPrime(int chk) {
		int result =0;
		for(int p=1; p<=chk; p++) {
			if(chk % p ==0) {
				result++;
			}
		}
		if(result==2) {
			result =0;
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		//5
		//1 2 7 6 4
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int sum = 0;
		int result_cnt =0;
		int[] nums = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(nums.length);
		for(int z =0; z<nums.length; z++) {
			for(int x = z + 1; x<nums.length; x++) {
				for(int c = x + 1; c<nums.length; c++) {
					sum = nums[z]+nums[x]+nums[c];
					if(isPrime(sum)) {
						result_cnt++;
//						System.out.println("소수는 : " + sum);
					}
//					System.out.print(nums[z]);
//					System.out.print(nums[x]);
//					System.out.println(nums[c]);
				}
			}
		}
		System.out.println("result_cnt : " + result_cnt);
		
		
		/*
		int aa = sc.nextInt();  //7
		int cnt = 0;
		for(int j=1; j<=aa; j++) { //소수판별
			if(aa % j ==0) {
				cnt++;
			}
		}
		System.out.println("cnt :" + cnt);
		if(cnt ==2) {
				System.out.println(aa+"는 소수");
		}
		*/
		
		
		
	}

}
