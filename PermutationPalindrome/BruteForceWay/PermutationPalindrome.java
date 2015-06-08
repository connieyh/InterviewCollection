import java.util.*;

public class PermutationPalindrome {
	public static boolean isPP(String s) {
		List<String> permutation = new ArrayList<String>();
		StringBuilder sol = new StringBuilder(); 
		boolean[] marks = new boolean[s.length()];
		doPermute(permutation, sol, marks, s);
		for(String p : permutation) {
			if(isP(p)) {
				return true;
			}
		}
		return false;

	}
	public static void doPermute(List<String> permutation, StringBuilder sol, boolean[] marks, String s) {
		if(sol.length() == s.length()) {
			permutation.add(sol.toString());
			return;
		}
		for(int i=0; i<s.length(); i++) {
			if(marks[i]) {
				continue;
			}
			marks[i] = true;
			sol.append(s.charAt(i));
			doPermute(permutation, sol, marks, s);
			marks[i] = false;
			sol.deleteCharAt(sol.length()-1);
		}
	}

	public static boolean isP(String s) {
		int start = 0;
		int end = s.length()-1;
		while(start < end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPP("ivicc"));
	}
}