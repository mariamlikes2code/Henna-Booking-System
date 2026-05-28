package hennaArtistryBookingSystem;

import java.util.ArrayList;

public class BookingManager {

	//arrayList of appointments
	private ArrayList<Appointment> appointments;
	
	public BookingManager() {
		appointments = new ArrayList<>();
	}
	
	//adds a new appointment
	public void bookAppointment(Appointment appointment) {
		//adds to whole list
		appointments.add(appointment); 
	}
	
	//cancels an appointment
	public void cancelAppointment(Appointment appointment) {
		//single appointment passed in
		appointment.cancelAppointment();
	}
		
	//displays all appointments
	public void displayAppointments() {
		for(Appointment appointment : appointments) {
			System.out.println(appointment.getHennaService().serviceDescription());
			appointment.displayAppointment();
		}
	}
	
	//so the user can cancel an appointment
	public Appointment findByName(String name) {
		for(Appointment appointment : appointments) {
			if(appointment.getClient().getName().equalsIgnoreCase(name)) {
				return appointment;
			}
		}
		return null;
	}
	
	
	//when an appointment is unavailable
	public boolean isDateTaken(String date, String time) {
		for(Appointment appointment : appointments) {
			if(appointment.getDate().equals(date) && appointment.getTime().equals(time)) {
				return true;
			}
		}
		return false;
	}
	
	
}
