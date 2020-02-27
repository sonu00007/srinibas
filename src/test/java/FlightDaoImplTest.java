

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capg.fms.dao.FlightDaoImpl;
import com.capg.fms.dto.Flight;

public class FlightDaoImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAddFlight() {
		FlightDaoImpl test=new FlightDaoImpl();
		assertNotNull(test.addFlight(new Flight(12355,"BS2W2","ABCD",50)));
	}

	@Test
	public void testViewFlight() {
		FlightDaoImpl test=new FlightDaoImpl();
		assertNotNull(test.viewFlight(12355));
	}

	@Test
	public void testViewFlightDao() {

		FlightDaoImpl test=new FlightDaoImpl();
		assertNotNull(test.viewFlightDao());
	}

	@Test
	public void testModifyFlight() {
		FlightDaoImpl test=new FlightDaoImpl();
		assertNotNull(test.addFlight(new Flight(12355,"BS2W3","ABCD",50)));
	}

	@Test
	public void testDeleteFlight() {
		FlightDaoImpl test=new FlightDaoImpl();
		assertNotNull(test.addFlight(new Flight(12355,"BS2W2","ABCD",50)));

	}

	@Test
	public void testIsflightModelPresent() {	FlightDaoImpl test=new FlightDaoImpl();
	assertNotNull(test.isflightModelPresent("BS2W2"));
	
	}

}
