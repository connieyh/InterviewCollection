import java.util.*;
public class Allergy {
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
	
	String getSeverity() {
		if(symptoms.size() > 3) {
			return "severe";
		}
		return "mild";
	}

}
