package com.capg.fms.service;

import java.util.List;

import com.capg.fms.Exceptions.MyException;
import com.capg.fms.dto.Flight;

public interface FlightService {

	boolean addFlight(Flight f);

	Flight modifyFlight(Flight f1);

	Flight viewFlightService(int nextInt) throws MyException;

	List<Flight> viewFlightServices();

	Flight deleteFlight(int nextInt) throws MyException;

}
