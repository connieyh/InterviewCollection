import java.util.*;
public class PatientAlllery {
	public static void main(String args[]) {
		Patient patient = new Patient(1234);
		patient.addAllergy("skin");
		for(Allergy a : patient.allergyList) {
			if(a.equals("skin")) {
				a.symptoms.add("itchy");
				a.symptoms.add("raddish");
			}
		}
		
		for(Allergy a : patient.allergyList) {
			System.out.println(a.getSeverity());
		}
		
		
	}
}
