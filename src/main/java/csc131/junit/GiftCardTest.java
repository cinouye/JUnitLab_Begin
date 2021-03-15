package csc131.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals; 

import org.junit.rules.ExpectedException; 

class GiftCardTest 
{

	@Test
	void testGetIssuingStore() 
	{

		double balance;
		GiftCard card; 
		int issuingStore; 
		issuingStore = 1337; 
		balance = 100.00; 
		card = new GiftCard(issuingStore, balance); 
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore()); 
		
	}
	
	@Test
	public void getBalance()
	{
		double balance;
		GiftCard card; 
		int issuingStore; 
		issuingStore = 1337; 
		balance = 100.00; 
		card = new GiftCard(issuingStore, balance); 
		assertEquals("getBalance()", balance, card.getBalance(), .001); 
	}
	
	@Test
	public void deduct_RemainingBalance()
	{
		double balance;
		GiftCard card; 
		int issuingStore; 
		issuingStore = 1337; 
		balance = 100.00; 
		String result;
		card = new GiftCard(issuingStore, balance); 
		
		result = "Remaining Balance: " + String.format("%6.2f", 90.00);
		assertEquals("deduct(10.00)", result, card.deduct(10));
	}

}
