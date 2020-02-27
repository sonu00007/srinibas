package com.capg.fms.util;

import java.util.regex.Pattern;

import com.capg.fms.dao.FlightDaoImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;

public class Validator {
	
	 FlightDaoImpl siv = new  FlightDaoImpl();
	
	public boolean validateflightModel(String flightModel)
	{
		if(!flightModel.matches("[A-Z][a-z,A-Z,0-9,\\s]*"))
		{
			System.out.println("\n*Note: Center name should not be blank, fist letter should be capital");
			return false;
		}
		else if(siv.isflightModelPresent(flightModel))
		{
			System.out.println("Center Name already there in the list");
			return false;
		}
		
		return true;
	}
	
	public boolean validateflightNumber(String flightNumber)
	{
		if(!flightNumber.matches("[0-9,\\s]*"))
		{
			System.out.println("please enter number");
			return false;
		}
	//	throw new InputMisMatchException("");
		return true;
	}
	
	public boolean validatecarrierName(String  carrierName)
	{
		if(! carrierName.matches("[A-Z][a-z,A-Z,0-9,\\s]*"))
		{
			System.out.println("\n*Note: Carrier name should not be blank, fist letter should be capital");
			return false;
		}
		else 
		{
		return true;
	}}
	
	public boolean validateseatCapacity(String seatCapacity)
	{
		if(! seatCapacity.matches("[0-9,\\s]*"))
		{
			System.out.println("\n*Note: please enter a number");
			return false;
		}
		else 
		{
		return true;
	}}
}
