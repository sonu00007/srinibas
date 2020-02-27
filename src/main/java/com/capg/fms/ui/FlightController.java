package com.capg.fms.ui;

import java.util.List;
import java.util.Scanner;

import com.capg.fms.Exceptions.MyException;
import com.capg.fms.dto.Flight;
import com.capg.fms.service.FlightService;
import com.capg.fms.service.FlightServiceImpl;
import com.capg.fms.util.DataBaseEntry;

public class FlightController {

	public static void main(String[] args) {
		new DataBaseEntry();
		char ch = 0;
		FlightService flightServiceobj=new FlightServiceImpl();
		do
		{
			System.out.println("enter ur choice");
			System.out.println("1. Add a new flight");
			System.out.println("2. modify the flight");
			System.out.println("3. view flight");
			System.out.println("4 view all the details of flight");
			System.out.println("5.delete flight");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Flight f=new Flight();
				System.out.println("Enter the details  <FLIGHT NUMBER> <FLIGHT MODEL> <CARRIER NAME> <SEAT CAPACITY>");
				f.setFlightNumber(sc.nextInt());
				
				f.setFlightModel(sc.next());
				f.setCarrierName(sc.next());
				f.setSeatCapacity(sc.nextInt());
				flightServiceobj.addFlight(f);
				break;
			case 2:
				Flight f1=new Flight();
				System.out.println("Enter the details  <FLIGHT NUMBER>");
				f1.setFlightNumber(sc.nextInt());
				
				 System.out.println("Enter the<FLIGHT MODEL> <CARRIER NAME> <SEAT CAPACITY>");
				f1.setFlightModel(sc.next());
				f1.setCarrierName(sc.next());
				f1.setSeatCapacity(sc.nextInt());
				flightServiceobj.modifyFlight(f1);
				break;
			case 3:

				System.out.println("Enter the <fLIGHT NUMBER>");
				//					
				try {
					System.out.println(flightServiceobj.viewFlightService(sc.nextInt()));
				} catch (MyException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 4: 
				List<Flight> flight=flightServiceobj.viewFlightServices();
				for(Flight flightobj:flight)
				{
					System.out.println(flightobj.getFlightNumber()+" "+flightobj.getFlightModel()+" "+flightobj.getCarrierName()+" "+flightobj.getSeatCapacity());

				}

				break;

			case 5:
				System.out.println("Enter the <FLIGHT NUMBER>");
				//					
				try {
					
					Flight f3=flightServiceobj.deleteFlight(sc.nextInt());

				} catch (MyException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
				
				
			}
			System.out.println("do want to operate more Y|N?");
			ch=sc.next().charAt(0);
		}while(ch=='y'|| ch=='Y');




	}

}
