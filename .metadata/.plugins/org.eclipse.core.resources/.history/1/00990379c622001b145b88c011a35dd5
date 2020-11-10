import java.util.ArrayList;

public class Doctor {

	private int doctorId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String specialty;
	private ArrayList<Appointment> appointments;
	
	//constructor 
	
	public Doctor(int doctorId, String firstName, String lastName, String phoneNumber, String email, String specialty) {
		setDoctorId(doctorId);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setSpecialty(specialty);
		this.appointments = new ArrayList<>();
	}
	
	/*
	 * add appointments method
	 * @param appointment
	 */
	public void addAppointment(Appointment appointment) {
		this.appointments.add(appointment);
	}
	
	
	//getter

	/*
	 * @return doctorId
	 */
	public int getDoctorId() {
		return doctorId;
	}
	/*
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/*
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/*
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/*
	 * @return specialty
	 */
	public String getSpecialty() {
		return specialty;
	}
	/*
	 * @return appointments
	 */
	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}
	
	//setter

	/*
	 * @param doctorId
	 */
	public void setDoctorId(int doctorId) {
		if (doctorId >= 1000 && 100000 >= doctorId ) {
			this.doctorId = doctorId;
		} else {
			this.doctorId = 1000;
		}
	}
	/*
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}
	/*
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	/*
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		if (!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
			this.phoneNumber = phoneNumber;
		} else {
			this.phoneNumber = "Unknown";
		}
	}
	/*
	 * @param email
	 */
	public void setEmail(String email) {
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} else {
			this.email = "Unknown";
		}
	}
	/*
	 * @param specialty
	 */
	public void setSpecialty(String specialty) {
		if (!specialty.isEmpty() && !specialty.equalsIgnoreCase(null)) {
			this.specialty = specialty;
		} else {
			this.specialty = "Unknown";
		}
	}
	
	@Override
	public String toString() {
		return  "\n" +
				"\nDoctor ID: " + doctorId + 
				"\nFirst Name: " + firstName + 
				"\nLast Name: " + lastName +  
				"\nEmail: " + email + 
				"\nPhone Number: " + phoneNumber +
				"\nSpecialty: " + specialty + 
				"\nList of Appointments: " + appointments;
	}	
}