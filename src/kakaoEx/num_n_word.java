package kakaoEx;

import java.util.Queue;
import java.util.Stack;

public class num_n_word {

	public static void main(String[] args) {
//		String aaa = "one4seveneight";
		String aaa = "23four5six7";
		String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		StringBuilder sb = new StringBuilder();
		
		for(int pos=0; pos<aaa.length(); ) {
			if(aaa.charAt(pos) >= '0' && aaa.charAt(pos) <= '9') { //숫자이면
				sb.append(aaa.charAt(pos++));
//				System.out.println(aaa.charAt(pos));
			} else { //한글이면
				for(int i= 0; i<10; i++) {
					if(aaa.startsWith(word[i], pos)) { //참일때
						System.out.println("i :: "+ i);
						sb.append((char)('0' + i));
						System.out.println("pos : " + pos);
						pos += word[i].length();
						System.out.println("word[i] : "+word[i].length());
						break;
					}
				}
			}
			System.out.println(sb.toString());
		}
	}
}