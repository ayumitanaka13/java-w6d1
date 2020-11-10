import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Driver {

	/*
	 * doctor or patient
	 */
	public static int printInstructions() {
		Scanner input = new Scanner(System.in);
		System.out.println("Select number:");
		System.out.println("1: Doctor  2: Patient");
		int userNum = input.nextInt();

		while (userNum != 1 && userNum != 2 ) {
			System.err.println("Wrong number, please select again.");
			System.out.println("Select number: ");
			System.out.println("1: Doctor  2: Patient");
			userNum = input.nextInt();
		}
		return userNum;
	}
	
	/*
	 * search doctor id
	 */
	public static Doctor findDoctor(ArrayList<Doctor> Doctors) {
		Scanner input = new Scanner(System.in);
		
		Doctor foundDoctor = null;
		
		while (Objects.isNull(foundDoctor)) {
			System.out.print("\nPlease enter the doctor id: ");
			int id = input.nextInt();		
			for (Doctor d : Doctors) {
				if (id == d.getDoctorId()) {
					//printAppointmentInfo(d.getAppointments());
					return d;
				}
			}
			System.err.println("The doctor id is not correct. Please enter again.");	
		}
		return foundDoctor;
	}

	/*
	 * search patient id
	 */
	public static Patient findPatient(ArrayList<Patient> Patients) {
		Scanner input = new Scanner(System.in);
		
		Patient foundPatient = null;
		
		while (Objects.isNull(foundPatient)) {
			System.out.print("\nPlease enter the patient id: ");
			int id = input.nextInt();		
			for (Patient p : Patients) {
				if (id == p.getPatientId()) {
					return p;
				}
			}
			System.err.println("The patient id is not correct. Please enter again.");
		}
		return foundPatient;
	}
	
	/*
	 * print appointment info
	 */
	public static void printAppointmentInfo(ArrayList<Appointment> appointments) {
		if (appointments.isEmpty()) {
			System.out.println("\nThere is no appointment.");
			return;
		}
		for (Appointment a : appointments) {
			System.out.println(a);
		}
	}
	
	/*
	 * make new appointment
	 */
	public static Appointment makeNewAppointment(Patient patient) {
		Scanner input = new Scanner(System.in);
		System.out.println("When is your appointment?");
		
		System.out.print("year: ");
		int inputYear = input.nextInt();
		System.out.print("month: ");
		int inputMonth = input.nextInt();
		System.out.print("day: ");
		int inputDay = input.nextInt();
		System.out.print("hour: ");
		int inputHour = input.nextInt();
		System.out.print("minutes: ");
		int inputTime = input.nextInt();
		Appointment newAppointment = new Appointment(patient, inputYear, inputMonth, inputDay, inputHour, inputTime);
		return newAppointment;
	}
	
	
	/*
	 * main method
	 */
	public static void main(String[] args) {
		
		//Create 4 doctor objects
		Doctor d1 = new Doctor(9996,"Belle", "Howard", "000-000-0000", "BelleH@email.com", "physician");
		Doctor d2 = new Doctor(9997,"Annabell", "Croft", "111-111-1111", "AnnabellC@email.com", "orthopedic surgery");
		Doctor d3 = new Doctor(9998,"Kwame", "Hines", "222-222-2222", "KwameH@email.com", "ophthalmology");
		Doctor d4 = new Doctor(9999,"Reyansh", "Adam", "333-333-3333", "ReyanshA@email.com", "pediatric surgery");
		
		ArrayList<Doctor> Doctors = new ArrayList<>();
		Doctors.add(d1);
		Doctors.add(d2);
		Doctors.add(d3);
		Doctors.add(d4);
		
		//Create 10 patient objects
		Patient p1 = new Patient(1000, "Antoinette","Cortes", "AntoinetteC@email.com", LocalDate.of(2002, 1, 1), "444-444-4444", "F");
		Patient p2 = new Patient(1001, "Jonas","Cleveland", "JonasC@email.com", LocalDate.of(2022, 3, 11), "555-444-4444", "M");
		Patient p3 = new Patient(1002, "Thalia","Pickett", "ThaliaP@email.com", LocalDate.of(1900, 2, 1), "666-444-4444", "F");
		Patient p4 = new Patient(1003, "Nannie","Murillo", "NannieM@email.com", LocalDate.of(2000, 6, 29), "777-444-4444", "M");
		Patient p5 = new Patient(1004, "Haseeb","Hill", "HaseebH@email.com", LocalDate.of(2000, 6, 23), "888-444-4444", "F");
		Patient p6 = new Patient(1005, "Dexter","Finch", "DexterF@email.com", LocalDate.of(1970, 1, 18), "999-444-4444", "F");
		Patient p7 = new Patient(1006, "Neha","Guest", "NehaG@email.com", LocalDate.of(1980, 3, 20), "444-111-4444", "M");
		Patient p8 = new Patient(1007, "Abigayle","Wolfe", "AbigayleW@email.com", LocalDate.of(1990, 3, 3), "444-222-4444", "M");
		Patient p9 = new Patient(1008, "Hamish","Lee", "HamishL@email.com", LocalDate.of(2020, 5, 11), "444-333-4444", "M");
		Patient p10 = new Patient(1009, "Mimi","Edwards", "MimiE@email.com", LocalDate.of(2002, 1, 22), "444-234-4444", "M");
		
		ArrayList<Patient> Patients = new ArrayList<>();
		Patients.add(p1);
		Patients.add(p2);
		Patients.add(p3);
		Patients.add(p4);
		Patients.add(p5);
		Patients.add(p6);
		Patients.add(p7);
		Patients.add(p8);
		Patients.add(p9);
		Patients.add(p10);
		
		//Create 2 appointment objects
		Appointment a1 = new Appointment(p1, 2020, 1, 1, 1, 00);
		Appointment a2 = new Appointment(p2, 2020, 12, 21, 0, 30);
		
		//TEST
		d1.addAppointment(a1);
		d1.addAppointment(a2);

		//ask user
		int option = printInstructions();
		
		//doctor case
		if (option == 1) {
			Doctor doctor = findDoctor(Doctors);
			printAppointmentInfo(doctor.getAppointments());
		//patient case
		} else if (option == 2) {
			Patient patient = findPatient(Patients);
			Appointment newAppointment = makeNewAppointment(patient);
			System.out.println(Doctors);
			Doctor doctor = findDoctor(Doctors);
			doctor.addAppointment(newAppointment);
			System.out.println("\nDoctor : " + doctor.getFirstName() + " " + doctor.getLastName() + 
					 "Your appointment date is " + newAppointment.getAppointmentDate());
			//other case
		} else {
			System.err.println("error");
		}
	}
}
