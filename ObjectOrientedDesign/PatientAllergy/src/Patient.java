import java.util.*;
public class Patient {
	int patientId;
	List<Allergy> allergyList;

	public Patient(int patientId) {
		this.patientId = patientId;
		this.allergyList = new ArrayList<Allergy>();
	}

	public void addAllergy(String allergyName) {
		Allergy a = new Allergy(allergyName);
		allergyList.add(a);
	}

}
