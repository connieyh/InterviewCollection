import java.util.*;
public class AdditiveNumber {
	public static boolean isAdditiveNumber(int num) {
		String s = convertToString(num);
		int start = 0;
		int interval = 1;
		while(start < s.length()/2) {
			for(int i=start+1; i<s.length()-interval; i++) {
				String add1 = s.substring(i-interval, i);
				String add2 = s.substring(i, i+interval);
				int sum = Integer.parseInt(add1) + Integer.parseInt(add2);
				int digit = countDigit(sum);
				if(i+interval+digit > s.length()) {
					break;
				}
 				String r = s.substring(i+interval, i+interval+digit);
				if(sum != Integer.parseInt(r)) {
					break;
				}else{
					if(i+interval+digit == s.length()) {
						return true;
					}
				}
			}
			start++;
			interval++;
		}
		return false;
	}
	public static String convertToString(int num) {
		StringBuilder numS = new StringBuilder();
		while(num > 0) {
			numS.insert(0, num%10);
			num /= 10;
		}
		return numS.toString();
	}
	public static int countDigit(int num) {
		int count = 0;
		while(num > 0) {
			++count;
			num /= 10;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(isAdditiveNumber(9999198));
	}
}