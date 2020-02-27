package com.capg.fms.service;
import java.util.ArrayList;
import java.util.List;

import com.capg.fms.Exceptions.MyException;
import com.capg.fms.dao.FlightDao;
import com.capg.fms.dao.FlightDaoImpl;
import com.capg.fms.dto.Flight;
import com.capg.fms.util.DataBaseEntry;
 
public class FlightServiceImpl implements FlightService {
	FlightDao flightdaoobj=new FlightDaoImpl();
	public List<Flight> flightlist=DataBaseEntry.getFlight();
	public boolean addFlight(Flight ft)	// adding data
	{ 
		Flight adddata = flightdaoobj.addFlight(ft);
		boolean addflight = flightlist.add(adddata);
		return addflight;
	}
	
	public Flight viewFlightService(int flightNumber) throws MyException // print details of specific flight number
	{
		if(flightNumber==0)
		{
			throw new MyException("flight number cannot be zero");
		}
		Flight flightobj=flightdaoobj.viewFlight(flightNumber);
		if(flightobj==null)
		{
			throw new MyException("no data found");
		}
		return flightobj;
		
	}
	public List<Flight> viewFlightServices()	//print detailsof all flight
	{
		List <Flight> flightlist=flightdaoobj.viewFlightDao();
		return flightlist;
		
	}
	public Flight modifyFlight(Flight ft)
	{
		Flight updateddata = flightdaoobj.modifyFlight(ft);
		return updateddata;
	}
	public Flight deleteFlight(int flightNumber) throws MyException
	{
		
		if(flightNumber==0)
		{
			throw new MyException("flight number cannot be zero");
		}
		else
		{
			return flightdaoobj.deleteFlight(flightNumber);
		}
		
	

	}
	
	

}
