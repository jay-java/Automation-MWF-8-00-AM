package hospital;

import org.testng.annotations.Test;

public class DoctorAppointment {

	@Test
	public void searchPatient() {
		System.out.println("saerch patient");
	}

	@Test
	public void checkPendingBookings() {
		System.out.println("doc check pending bookings");
	}

	@Test
	public void approveAppointment() {
		System.out.println("approve appointment");
	}

	@Test
	public void givePrescription() {
		System.out.println("doc give prescription");
	}
}
