package hennaArtistryBookingSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		try (Scanner kb = new Scanner(System.in)) {
			BookingManager bookingManager = new BookingManager();
			
			
			//welcome message
			System.out.println("\nWelcome to Mehndi by Mariam!");
			
			//print the menu options
			System.out.println("\nMenu Options:");
			System.out.println("1. About us!");
			System.out.println("2. Browse different henna styles, complexities, and placements!");
			System.out.println("3. Make an appointment");
			System.out.println("4. View your appointment");
			System.out.println("5. Cancel your appointment :(");
			System.out.println("6. See your profile details");
			System.out.println("7. Check out our socials!");
			System.out.println("8. Exit");

			//loop to keep the menu running + read the users choice + make sure its a valid number
			int choice = 0;

			while (choice != 8) {
				System.out.println("\nEnter your choice: ");
				try {
					choice = kb.nextInt();
					kb.nextLine();
				} catch (InputMismatchException e) {

					System.out.println("Please enter a valid number!");
					kb.nextLine();
					choice = 0;

				}

				switch(choice) {
				
				//about us
				case 1:
					
					try {
						BufferedReader reader = new BufferedReader(new FileReader("AboutUs.txt"));
						
						String line;
						while ((line = reader.readLine()) != null) {
							System.out.println(line);
						}
						reader.close();
						
					} catch (IOException e) {
						System.out.println("Sorry, could not load About Us :(");
					}
					
					break;
					
				//browse options
				case 2:
					System.out.println("\nFeel free to browse and contact us if " +
							"you have any questions!");
					
					// creating DesignType objects with descriptions
				    DesignType bridal = new DesignType(Style.BRIDAL, "Intricate full hand design, perfect for weddings and special occasions.", 40.00);
				    DesignType dainty = new DesignType(Style.DAINTY, "Light and delicate designs, perfect for everyday wear.", 10.00);
				    DesignType floral = new DesignType(Style.FLORAL, "Flower-inspired patterns, feminine and elegant.", 15.00);
				    DesignType khaleeji = new DesignType(Style.KHALEEJI, "Bold Gulf-inspired designs with large floral and paisley motifs.", 20.00);
				    DesignType desi = new DesignType(Style.DESI, "Traditional South Asian patterns with fine detailed work.", 20.00);
				    
				    System.out.println("\nHenna Styles: ");
				    System.out.println("- " + bridal.getStyle() + ": " + bridal.getDescription());
				    System.out.println("- " + dainty.getStyle() + ": " + dainty.getDescription());
				    System.out.println("- " + floral.getStyle() + ": " + floral.getDescription());
				    System.out.println("- " + khaleeji.getStyle() + ": " + khaleeji.getDescription());
				    System.out.println("- " + desi.getStyle() + ": " + desi.getDescription());
					
					System.out.println("\nComplexities: ");
					for(Complexity complexity : Complexity.values()) {
						System.out.println("- " + complexity);
					}
					System.out.println("\nPlacements: ");
					for(Placement placement : Placement.values()) {
						System.out.println("- " + placement);
					}
					
					break;
					
					//make appointment
				case 3:
					System.out.println("Enter your first and last name: ");
					String name = kb.nextLine();
					System.out.println("Enter your phone number: ");
					String phone = kb.nextLine();
					System.out.println("Enter your email: ");
					String email = kb.nextLine();
					
					System.out.println("Pick your henna style: ");
					for(Style style : Style.values()) {
						System.out.println("- " + style);
					}
					String stylechoice = kb.nextLine();
					Style chosenStyle = Style.valueOf(stylechoice.toUpperCase()); 
					
					System.out.println("Pick your henna placement: ");
					for(Placement placement : Placement.values()) {
						System.out.println("- " + placement);
					}
					String placementchoice = kb.nextLine();
					Placement chosenplacement = Placement.valueOf(placementchoice.toUpperCase()); 
					
					System.out.println("Pick the design complexity: ");
					for(Complexity complexity : Complexity.values()) {
						System.out.println("- " + complexity);
					}
					String complexitychoice = kb.nextLine();
					Complexity chosencomplexity = Complexity.valueOf(complexitychoice.toUpperCase()); 
					
					//getting the price
					double totalPrice = chosenStyle.getPrice() + chosenplacement.getPrice() + chosencomplexity.getPrice();
					System.out.println("Final Price: $" + totalPrice);

					//book the appointment
					Client client = new Client(name, phone, email);
					HennaService service = new HennaService("Henna Appointment", totalPrice, 60, chosenStyle, chosenplacement, chosencomplexity);

					//ask for date and time
					System.out.println("Enter the date (MM/DD/YYYY): ");
					String date = kb.nextLine();
					
					//to check if the input is a valid date format
					while(!date.matches("\\d{2}/\\d{2}/\\d{4}")) {
						System.out.println("Invalid date format, please use MM/DD/YYYY: ");
						date = kb.nextLine();
					}
					
					System.out.println("Enter the time (ex: 1 PM or 12 PM): ");
					String time = kb.nextLine();
					
					//to check if the input is a valid time format
					while(!time.matches("\\d{1,2} (AM|PM)")) {
						System.out.println("Invalid date format, please use # AM/PM or ## AM/PM: ");
						time = kb.nextLine();
					}

					// before booking, make sure the date and time slot is available through bookingManager
					if (bookingManager.isDateTaken(date, time)) {
						System.out.println("Sorry, that date and time is already taken. Please try another!");
					} else {
						Appointment appointment = new Appointment(client, service, date, time, AppointmentStatus.PENDING);
						bookingManager.bookAppointment(appointment);
						System.out.println("Your appointment has been booked successfully!");

					}
					break;
					
				//view appointment
				case 4:
					bookingManager.displayAppointments();
					break;
					

				//cancel appointment
				case 5:
					System.out.println("Please enter the name under your appointment: ");
					String cancelName = kb.nextLine();
					Appointment toCancelAppointment = bookingManager.findByName(cancelName);
					
					if(toCancelAppointment == null) {
						System.out.println("No appointment found under that name.");
					} else {
						bookingManager.cancelAppointment(toCancelAppointment);
						System.out.println("Your appointment has been cancelled.");
					}
					
					break;
					
				//see profile
				case 6:
					System.out.println("Please enter the name under your profile: ");
					String findNameInProfile = kb.nextLine();
					Appointment findProfile = bookingManager.findByName(findNameInProfile);
					
					if(findProfile == null) {
						System.out.println("No profile found under that name.");
					} else {
						System.out.println("\nProfile details: ");
						System.out.println(findProfile.getClient().clientInfo());
					}
					
					break;
					
				//display brand's socials
				case 7:
					System.out.println("\nFollow us on Instagram! \n@mehndi.bymariam_");
					
					break;
					
				//exit
				case 8:
					System.out.println("\nThank you for visiting Mehndi by Mariam. "
							+ "\nWe hope to see you soon!");
					break;
					
					default:
						System.out.println("\nInvalid option! Please enter a number 1-8. ");

				}
				
			}
		}
		
	
	}

}
