import java.util.*;
import java.sql.Timestamp;

public class PatientProfile {
	int patientId;
	private String name;
	private String address1;
	private String address2;
	private String phoneNumber1;
	private String phoneNumber2;
	private String phoneNumber3;
	boolean gender;
	private String dob;
	private List<Long> visitHospitalTimestamp;
	
	public PatientProfile(int id, String name, String gender, Date dob) {
		this.patientId = id;
		this.name = name;
		if(gender.equals("male")) {
			this.gender = true;
		}else if(gender.equals("female")){
			this.gender = false;
		}
		this.phoneNumber1 = null;
		this.phoneNumber2 = null;
		this.phoneNumber3 = null;
		this.address1 = null;
		this.address2 = null;
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(dob);
//		long millisecond = calendar.getTimeInMillis();
		this.dob = dob.toString();
		this.visitHospitalTimestamp = new ArrayList<Long>();
		
		
	}
	
	public void addTimestamp() {
		visitHospitalTimestamp.add(System.currentTimeMillis());
	}
	
	public Date mostRecentTimeWentToHospital() {
		int size = visitHospitalTimestamp.size()-1;
		Timestamp stamp = new Timestamp(visitHospitalTimestamp.get(size));
		Date mostRecent = new Date(stamp.getTime());
		return mostRecent;
	}
	
	public void addphoneNumber(String phone) {
		if(this.phoneNumber1 == null) {
			this.phoneNumber1 = phone; 
		}else if(this.phoneNumber2 == null) {
			this.phoneNumber2 = phone;
		}else {
			this.phoneNumber3 = phone;
		}
	}
	
	public void addAddress(String addr) {
		if(address1 == null) {
			this.address1 = addr; 
		}else {
			this.address2 = addr;
		}
	}
}
