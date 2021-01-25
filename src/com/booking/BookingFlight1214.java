package com.booking;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingFlight1214 {
	
	
		@BeforeTest
	public void BeforeTestCase1() {
		System.out.println("This should run first");
	}
		
   @BeforeMethod
   public void BeforeMethord() {
	   System.out.println("This method will run before all testcase");
   }
	
   @AfterMethod
   public void AfterMethord() {
	   System.out.println("This method will run after all testcase");
   }
	
   @Test
	public void Booking_Round_Trip_TC1() {
		System.out.println("This is my Testcase2");
		
	}
	@Test
	public void Booking_Round_Trip_TC0() {
		System.out.println("This is my Tc1");
		
	}
	@Test
	public void Booking_Round_Trip_TC2() {
		System.out.println("This is my Tc3");
		
	}
	@Test(dependsOnMethods= {"Booking_Round_Trip_TC1"})
	public void Booking_Oneway_Trip_TC3() {
		System.out.println("This is my Tc4");
		
	}
	@Test(enabled=false)
	public void Booking_Oneway_Trip_TC4() {
		System.out.println("This is my Tc5");
		
	}
	
	@AfterTest
	public void AfterTestCase1() {
		System.out.println("This should run last");
	}
	
	

}
