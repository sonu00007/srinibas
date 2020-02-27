package com.capg.fms.dao;

import java.util.List;

import com.capg.fms.dto.Flight;

public interface FlightDao {

	Flight addFlight(Flight ft);

	Flight viewFlight(int flightNumber);

	List<Flight> viewFlightDao();

	Flight modifyFlight(Flight ft);

	Flight deleteFlight(int flightNumber);

}
