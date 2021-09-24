package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class noCompleteAthlete {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"kiki", "eden"};
//		String[] participant = {"mislav", "stanko", "mislav", "ana"};
//		String[] completion = {"stanko", "ana", "mislav"};
		String final_value ="";
//		["mislav", "stanko", "mislav", "ana"], 
//		["stanko", "ana", "mislav"]
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0; i<participant.length; i++) {
			if(participant[i] != completion[i]) {
				final_value = participant[i];
			}
			
		}
		
		HashMap<String, String> map = new HashMap<>();
		HashMap<String, String> commap = new HashMap<>();
		
		/*
		for(int i=0; i<participant.length; i++) {
			map.put(i+"", participant[i]);
		}
		for(int j=0; j<completion.length; j++) {
			commap.put(j+"", completion[j]);
		}
//		System.out.println(map.entrySet());
//		System.out.println(map.keySet());
//		System.out.println(commap.entrySet());
//		System.out.println(commap.keySet());
		for(int x =0; x<map.size(); x++) {
			if(map.get(x+"").equals(map.get(x+1+""))) {
				final_value = map.get(x+"");
				System.out.println("final_value = " + final_value);
				break;
			} else {
//				System.out.println("else cccc");
				for(Entry<String,String> ee : map.entrySet()) {
					if(!commap.containsValue(ee.getValue())) {
						final_value =ee.getValue();
//						System.out.println("vvvvv : "+ee.getValue());
					}
				}
				continue;
			}
//			int aa[x] =map.get(x+"");
//			System.out.println("map.get("+x+")"+map.get(x+""));
		}
//		for(String aa :map.keySet()) {
//			if(!commap.containsKey(aa)) {
//				System.out.println("aa : " + aa);
//			}
//			
//		}
		System.out.println("final_value : " + final_value);            */
//		Iterator<String> im = map.keySet().iterator();
////		Iterator<String> comm = commap.keySet().iterator();
//		while(im.hasNext()) {
//			String aa = im.next();
//			System.out.println(aa);
////			while(comm.hasNext()) {
////				System.out.println(aa.compareTo(comm.next()));
////			}
////			System.out.println(aa.compareTo(comm.));
////			System.out.println("aa : " + aa);
//		}
//		System.out.println(map.containsValue("leo1"));
		
	}

}
