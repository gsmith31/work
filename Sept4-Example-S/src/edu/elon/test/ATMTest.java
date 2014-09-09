
package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ATMTest {
	private ATM atm;
	

	@Test
	public void testGetBalance() {
		atm = new ATM(10.0);
		double actual = atm.getBalance();
		assertEquals(10.0,actual,0);
	}
	
	@Test
	public void testToString(){
		atm = new ATM(10.0);
		String actual = atm.toString();
		assertEquals("Amount balance is $10.00",actual);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testDeposit(){
		atm = new ATM(10.0);
		atm.deposit(-10.0);
		assertEquals(20.0,atm.getBalance(),0);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testWithdrawl(){
		atm = new ATM(10.0);
		atm.withdraw(20.0);
		assertEquals(-10.0,atm.getBalance(),0);
	}
	
	
}
