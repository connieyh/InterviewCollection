/*
Design a class which stores demographic information of a person like name, address, phone number, male/female. 
What if the person has any prefix to the name, multiple phone numbers/addresses, 
how will you handle dob in case of multiple locations
(If a person is both at 12 PM in USA on a date, then that date is different from date in India), 
how will you handle the validations of these fields when the user enters the values

design a class that will be used to store the information of the patients visiting to the hospital
*/

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