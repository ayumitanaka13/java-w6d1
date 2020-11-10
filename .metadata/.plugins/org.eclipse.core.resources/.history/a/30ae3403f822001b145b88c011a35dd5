import java.time.LocalDateTime;
import java.util.Objects;

public class Appointment {
	
	private Patient patient;
	private LocalDateTime appointmentDate;
	
	//constructor

	public Appointment(Patient patient, int year, int month, int day, int hour, int minute) {
		setPatient(patient);
		setAppointmentDate(year, month, day, hour, minute);
	}
	
	//getter
	
	/*
	 * @return patient
	 */
	public Patient getPatient() {
		return patient;
	}
	/*
	 * @return appointmentDate
	 */
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}
	
	//setter
	
	/*
	 * @param patient
	 */
	public void setPatient(Patient patient) {
		if(Objects.nonNull(patient)) {
			this.patient = patient;
		}
	}
	/*
	 * @param appointmentDate
	 */
	public void setAppointmentDate(int year, int month, int day, int hour, int minute) {
			this.appointmentDate = LocalDateTime.of(year, month, day, hour, minute);
	}
	
	@Override
	public String toString() {
		return 	"\n*** Patient Appointment Date ***" +
				"\nPatient Name : " + patient.getFirstName() + " " + patient.getLastName() +
				"\nAppointment date : " + appointmentDate;
	}
}