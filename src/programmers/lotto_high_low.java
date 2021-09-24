package programmers;

public class lotto_high_low {
	
	public static int num_to_rank(int a) {
		int result = 0;
			switch(a) {
			case 6:
				result=1;
				break;
			case 5:
				result=2;
				break;
			case 4:
				result=3;
				break;
			case 3:
				result=4;
				break;
			case 2:
				result=5;
				break;
			default :
				result=6;
				break;
			}
		return result;
	}

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		int dontKnowNumCnt =0;
		int maxRank =0;
		int minRank =0;
		int cnt =0;

		for(int i=0; i<lottos.length; i++) {
			if(lottos[i] == 0) { //알수없는 번호 파악
				dontKnowNumCnt++;
			}
			for(int j=0; j<win_nums.length; j++) { //일치숫자 갯수파악
				if(lottos[i] == win_nums[j]) {
					cnt++;
				}
			}
		}
		
		maxRank=cnt+dontKnowNumCnt;
		minRank=cnt;
		
		int[] answer= {num_to_rank(maxRank),num_to_rank(minRank)};
		System.out.println("["+answer[0]+", "+answer[1]+"]");
		

	}

}
