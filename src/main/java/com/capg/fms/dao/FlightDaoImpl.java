package com.capg.fms.dao;
import java.util.*;

import org.apache.log4j.Logger;

import com.capg.fms.dto.Flight;
import com.capg.fms.service.FlightServiceImpl;
import com.capg.fms.util.DataBaseEntry;

public class FlightDaoImpl implements FlightDao {
	//public List<Flight> ft=DataBaseEntry.getFlight();
	private Logger logger=Logger.getLogger(FlightDaoImpl.class);
	public Flight addFlight(Flight flight) {
		logger.info("Flight Added: "+flight); 
		return flight;
		
	}
	public Flight viewFlight(int flightNumber)
	{
		for(Flight flightobj:DataBaseEntry.getFlightinfo())
		{
			if(flightobj.getFlightNumber()==flightNumber) 
			{
				return flightobj;
			}
		}
		return null;
	
	}
	public List<Flight> viewFlightDao()
	{
		return DataBaseEntry.getFlightinfo();
	}
	public Flight modifyFlight(Flight flightdata)
	{ 
		for(Flight flightobj:DataBaseEntry.getFlightinfo())
		{
			if(flightobj.getFlightNumber()==flightdata.getFlightNumber())
			{
				flightobj.setFlightModel(flightdata.getFlightModel());
				flightobj.setCarrierName(flightdata.getCarrierName());
				flightobj.setSeatCapacity(flightdata.getSeatCapacity());
				return flightobj;
			}
		}
		
		return null;
	}
	public Flight deleteFlight(int flightNumber)
	{
	List<Flight> flightList=DataBaseEntry.getFlightinfo();
	
	Iterator<Flight> iter=flightList.iterator();
	while(iter.hasNext()) {
		Flight f = (Flight) iter.next();
		
		if(f.getFlightNumber()== flightNumber)
		{
			iter.remove();
			return f;
			
		}
		
		
	}
	return null;
		
	}
	public boolean isflightModelPresent(String flightModel) 
	{
		
		return false;
	}

 
	
}
