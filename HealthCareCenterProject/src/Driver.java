import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Driver {

	/*
	 * doctor or patient
	 */
	
	/*
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
	*/
	
	/*
	 * search id
	 */
	public static User findUser(ArrayList<User> users) {
		Scanner input = new Scanner(System.in);
		
		User foundUser = null;
		
		while (Objects.isNull(foundUser)) {
			System.out.print("\nPlease enter the id: ");
			int id = input.nextInt();		
			for (User u : users) {
				if (id == u.getId()) {
					//printAppointmentInfo(d.getAppointments());
					return u;
				}
			}
			System.err.println("The user id is not correct. Please enter again.");	
		}
		return foundUser;
	}

	
	/*
	 * print appointment info
	 */
	public static void printAppointmentInfo(ArrayList<Appointment> appointments) {
		if (appointments.isEmpty()) {
			System.out.println("\nThere is no appointment.");
			return;
		}
		//sort by date
		Collections.sort(appointments);
		for(Appointment a : appointments) {
			System.out.println(a);
		}
	}
	
	/*
	 * make new appointment
	 */
	public static Appointment makeNewAppointment(Patient p) {
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
		Appointment newAppointment = new Appointment(p, inputYear, inputMonth, inputDay, inputHour, inputTime);
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
		
		//Create 2 appointment objects
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();
		Appointment a1 = new Appointment(p1, 2020, 1, 1, 1, 00);
		Appointment a2 = new Appointment(p2, 2010, 1, 1, 1, 00);
		
		//TEST
		d1.addAppointment(a1);
		d1.addAppointment(a2);
		
		//Create user 
		ArrayList<User> users = new ArrayList<User>();
		users.add(d1);
		users.add(d2);
		users.add(d3);
		users.add(d4);
		users.add(p1);
		users.add(p2);
		users.add(p3);
		users.add(p4);
		users.add(p5);
		users.add(p6);
		users.add(p7);
		users.add(p8);
		users.add(p9);
		users.add(p10);
		
		//sort by last name
		System.out.println("\n* sort Users by last name");
		Collections.sort(users, new UserSorter.CompareByName());
		for(User u : users) {
			System.out.println(u);
		}

		//output
		User user = findUser(users);
		
		//doctor case
		if (user instanceof Doctor) {
			Doctor d = (Doctor)user;
			printAppointmentInfo(d.getAppointments());
		//patient case
		} else if (user instanceof Patient) {
			Patient p = (Patient)user;
			Appointment newAppointment = makeNewAppointment(p);
			Doctor d = (Doctor)user;
			System.out.println(d);
			d.addAppointment(newAppointment);
			System.out.println("\nDoctor : " + d.getFirstName() + " " + d.getLastName() + 
					 "Your appointment date is " + newAppointment.getAppointmentDate());
		//other case
		} else {
			System.out.println("ERROR");
		}
	}
}
