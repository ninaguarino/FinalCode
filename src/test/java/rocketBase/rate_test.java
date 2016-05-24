package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;
import rocketData.LoanRequest;

public class rate_test {
	
	
	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score	
	
	@Test
	public void paymentTest(){
		double payment = RateBLL.getPayment(0.04/12.0, 360.0, 300000.0, 0.0, false);
		assertEquals(payment, 1432.25, 0.01);
	}
	
	
	@Test
	public void rateTest1(){
		try {
			assertEquals(RateBLL.getRate(720), 4, 0.001);
		} catch (RateException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test (expected = RateException.class)
	public void rateTest2() throws Exception {
		assertEquals(RateBLL.getRate(800), 4, 0.01);
	}
	

}
