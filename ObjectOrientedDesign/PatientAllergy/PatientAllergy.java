
/* design a class (give different methods and variables that will be used) that will provide information 
about the allergy of a patient. e.g. who reported the allergy(patient/doctor/relative), 
different symptoms of the allergy that are detected, severity, 
method that returns when was that allergy detected in that patient. */


public class PatientAllergy {
	int patientId;
	String allergy;
	String allergyReporter;
	Set<String> symptoms = new HashSet<String>();
	// String severity;
	Date foundDate;

	public PatientAllergy(int patientId) {
		this.patientId = patientId;
	}

	private void setAllergy(String allergyReporter, String foundAllergyDate) {
		this.allergyReporter = allergyReporter;
		// parse foundAllergyDate to store to foundDate
	}
	public void setSymptoms(String symp) {
		symptoms.add(symp);
	}
	public String getAllergy() {
		return allergy;
	}
	public Date getAllergyFoundDate() {
		return foundDate;
	}
	public String getSeverity() {
		if(symptoms.size() > 3) {
			return "Severe";
		}
		return "Mild";
	}

}