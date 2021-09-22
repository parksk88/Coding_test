package kakaoEx;
import java.util.*;

/*
 * - 아이디의 길이는 3자 이상 15자 이하여야한다.
-아이디는 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표만 가능하다
-마침표는 처음과 끝에 사용할 수 없다, 연속할 수 없다.

1단계 대문자->소문자로 치환
2단계 알파벳 소문자, 숫자, -, _, . 를 제외한 모든 문자 제거
3단계 .가 2번 이상 연속된 부분을 하나의 마침표로 치환
4단계 .가 처음이나 끝에 위치한다면 제거
5단계 빈 문자열이라면 a를 대입한다
6단계 길이가 16자 이상이면 첫 대문자를 제외한 나머지 문자들은 제거, .가 끝에 위치한다면 제거
7단계 길이가 2자 이하라면 마지막 문자를 길이가 3이 될때까지 반복해서 끝에다가 붙임
 */


public class id_rec {
	
	static boolean isValid(char c) {
		if (Character.isLetterOrDigit(c)) return true;
		if (c=='_' || c=='-' || c=='.') return true;
		return false;
	}
	
	
	public static void main(String[] args) {
		
		
		
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		StringBuilder sb = new StringBuilder();
		boolean lastDot = false;
		
		for( char ch : new_id.toCharArray()) {
			if(isValid(ch) == false) continue;	//validation check
			if(ch == '.') {
				if (sb.length() == 0 || lastDot) continue;
				lastDot = true;
			} else {
				lastDot = false;
			}
			ch = Character.toLowerCase(ch);		//대문자를 소문자로 치환
			System.out.println("ch["+ch+"] = "+ch);
			
			sb.append(ch);
			
			
		}
		
		if(sb.length() >= 16) 
			sb.setLength(15);
		
		if(sb.length() == 0) sb.append('a');
		
		if('.' == sb.charAt(sb.length()-1)) sb.deleteCharAt(sb.length()-1);
		
		if(sb.length() <= 2) {
			char ch = sb.charAt(sb.length()-1);
			while(ch < 3) {
				sb.append(ch);
			}
		}
		System.out.println("origin :: " + new_id);
		System.out.println(sb);
		
	}

}
