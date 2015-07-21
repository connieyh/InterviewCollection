public class RememberTheWord {
	public static int numberCombination(String[] dict, String s) {
		boolean[] mark = new boolean[dict.length];
		return dfs(dict, mark, s, "");
	}
	public static int dfs(String[] dict, boolean[] mark, String s, String sol) {
		int count = 0;
		if(sol.length() == s.length()) {
			if(sol.equals(s)) {
				return 1;
			}
			return 0;
		}
		if(!sol.equals(s.substring(0, sol.length()))) {
			return 0;
		}
		for(int i=0; i<dict.length; i++) {
			if(mark[i]) {
				continue;
			}
			mark[i] = true;
			count += dfs(dict, mark, s, sol+dict[i]);
			mark[i] = false;
		}
		return count;
	}
	public static void main(String[] args) {
		String[] dict = {"a", "b", "cd", "ab"};
		String s = "abcd";
		long startTime = System.nanoTime();
		int count = numberCombination(dict, s);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println(count);
		System.out.println(duration);
	}
}