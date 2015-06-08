import java.util.*;
public class PalindromePermutation {
	public static boolean isPP(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 0);
			}
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
		boolean oddSeen = false;
		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				if(map.get(s.charAt(i))%2!=0) {
					if(oddSeen) {
						return false;
					}
					oddSeen = true;
				}
				map.remove(s.charAt(i));
			}
		}
		return true;		
	}
	public static void main(String[] args) {
		System.out.println(isPP("iiicc"));
		System.out.println(isPP("livci"));
	}
}

