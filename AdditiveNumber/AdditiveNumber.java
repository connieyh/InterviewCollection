import java.util.*;
public class AdditiveNumber {
	public static boolean isAdditiveNumber(int num) {
		String s = convertToString(num);
		int start = 0;
		int interval = 1;
		// while(start < s.length()/2) {
		// 	for(int i=start+1; i<s.length()-interval; i++) {
		// 		String add1 = s.substring(i-interval, i);
		// 		String add2 = s.substring(i, i+interval);

		// 		if(i-interval == 0) {
		// 			for(int k=0; k<add1.length(); k++) {
		// 				if(add1.charAt(k)!=add2.charAt(k)) {
		// 					break;
		// 				}
		// 			}
		// 		}
		// 		int sum = Integer.parseInt(add1) + Integer.parseInt(add2);
		// 		int digit = countDigit(sum);

		// 		if(i+interval+digit > s.length()) {
		// 			break;
		// 		}
 	// 			String r = s.substring(i+interval, i+interval+digit);
		// 		if(sum != Integer.parseInt(r)) {
		// 			break;
		// 		}else{
		// 			// if(i+interval+digit == s.length()) {
		// 			// 	return true;
		// 			// }
		// 			for(int j=i+interval+digit; j<s.length(); j++) {


		// 			}
		// 		}
				
		// 	}
		// 	start++;
		// 	interval++;
		// }
		for(int i=0; i<s.length()/2; i++) {
			// for(int j=i+1; j<s.length(); j++) {
				int j = i+1;
				String add1 = s.substring(0, i+1);
				String add2 = s.substring(i+1, j+j);
				int a1 = Integer.parseInt(add1);
				int a2 = Integer.parseInt(add2);
				if(a1!=a2) {
					continue;
				}
				int sum1 = a1+a2;
				int digit = countDigit(sum1);
				int rsEnd = j+j+digit;
				String rs1 = s.substring(j+j, rsEnd);
				if(Integer.parseInt(rs1) != sum1) {
					continue;
				}else {
					j += add2.length();
					j += digit;
					if(j==s.length()) {
						return true;
					}
					while(j<s.length()) {
						a1 = a2;
						a2 = sum1;
						sum1 = a1+a2;
						digit = countDigit(sum1);
						rsEnd = j+digit;
						rs1 = s.substring(j, rsEnd);
						if(Integer.parseInt(rs1) != sum1) {
							break;
						}
						if(rsEnd == s.length()) {
							return true;
						}
						j += digit;
					}
				}
				

			// }
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
		System.out.println(isAdditiveNumber(991827));
		System.out.println(isAdditiveNumber(363672108));
		System.out.println(isAdditiveNumber(11235));
		System.out.println(isAdditiveNumber(224610));
	}
}