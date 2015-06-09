import java.util.*;
public class PalindromePermutation {
	public static boolean isPP(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.containsKey(c) ? map.get(s.charAt(i))+1 : 1);
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

	public static boolean isPaP(String s) {
		Set<Character> set = new HashSet<Character>();
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				count++;
			}else {
				set.remove(c);
				count--;
			}
		}
		return count == 0 || count == 1 ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(isPaP("iiicc"));
		System.out.println(isPaP("livci"));
	}
}

