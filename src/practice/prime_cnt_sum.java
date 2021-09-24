package practice;
import java.util.*;
public class prime_cnt_sum {
	
	static int prime_cnt(int chk) {
		int cnt=0;
		int num=0;
		System.out.print(chk+" ");
		for(int y=1; y<=chk; y++) {
			if(chk % y == 0) {
				cnt++;
			}
			
		}
		return cnt;
	}

	public static void main(String[] args) {
		// left : 13  
		// right : 17	
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();
		int[] arry = new int[(right-left)+1];
		int z = 0;
		int result =0;
		for(int i=left; i<=right; i++) { //13 14 15 16 17
			arry[z] =i;
//			System.out.println(arry[z]);
			System.out.println("arry[z] "+prime_cnt(arry[z]));
			if(prime_cnt(arry[z]) % 2 == 0) {
				result += i;
			} else {
				result -= i;
			}
			z++;
//			System.out.println("i = " + i);
		}
		System.out.println("result = " + result);
		
//		System.out.println(arry.length);
//		System.out.println(" 0 "+arry[0]);
//		System.out.println(" 0 "+arry[1]);
//		System.out.println(" 0 "+arry[2]);
//		System.out.println(" 0 "+arry[3]);
//		System.out.println(" 0 "+arry[4]);
//		System.out.println("arry[]" + arry[z-1]);
		
	}

}
