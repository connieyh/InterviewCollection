import java.util.*;
public class PatientDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1988,8,30);
		java.util.Date utilDate = cal.getTime();
		PatientProfile p1 = new PatientProfile(1234, "David", "male", utilDate);
		p1.addTimestamp();
		p1.addphoneNumber("9173336666");
		p1.addAddress("33 Haha Street");
		System.out.println(p1.mostRecentTimeWentToHospital());
		
	}
}
