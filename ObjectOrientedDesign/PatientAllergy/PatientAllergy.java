
/* design a class (give different methods and variables that will be used) that will provide information 
about the allergy of a patient. e.g. who reported the allergy(patient/doctor/relative), 
different symptoms of the allergy that are detected, severity, 
method that returns when was that allergy detected in that patient. */


class Allergy {
	String allergyName;
	List<String> symptoms;
	String reporter;
	String severity;
	String foundDate;

	Allergy() {
		this("");
	}

	Allergy(String allergyName) {
		this.allergyName = allergyName;
		symptoms = new ArrayList<String>();
	}

	void setReporterAndDate(String reporter, String foundDate) {
		this.reporter = reporter;
		this.foundDate = foundDate;
	}

	void addSymptom(String symptom) {
		symptoms.add(symptom);
	}

	String getReporter() {
		return reporter;
	}

	String getAllergyFoundDate() {
		return foundDate;
	}

}


class Patient {
	int patientId;
	List<Allergy> allergyList;

	Patient() {
		this.allergyList = new ArrayList<Allergy>();
	}

}