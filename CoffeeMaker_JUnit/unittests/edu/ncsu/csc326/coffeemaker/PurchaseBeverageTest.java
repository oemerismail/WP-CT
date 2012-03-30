package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import junit.framework.TestCase;

public class PurchaseBeverageTest extends TestCase {
	
	private CoffeeMaker cm;
	private Recipe r1;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;

	protected void setUp() throws Exception {
		cm = new CoffeeMaker();
		
		//Set up for r1
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setAmtChocolate("0");
		r1.setAmtCoffee("3");
		r1.setAmtMilk("1");
		r1.setAmtSugar("1");
		r1.setPrice("50");
		
		//Set up for r2
		r2 = new Recipe();
		r2.setName("Mocha");
		r2.setAmtChocolate("20");
		r2.setAmtCoffee("3");
		r2.setAmtMilk("1");
		r2.setAmtSugar("1");
		r2.setPrice("75");
		
		//Set up for r3
		r3 = new Recipe();
		r3.setName("LatteMacchiato");
		r3.setAmtChocolate("0");
		r3.setAmtCoffee("3");
		r3.setAmtMilk("3");
		r3.setAmtSugar("1");
		r3.setPrice("100");
		
		//Set up for r4
		r4 = new Recipe();
		r4.setName("Hot Chocolate");
		r4.setAmtChocolate("4");
		r4.setAmtCoffee("0");
		r4.setAmtMilk("1");
		r4.setAmtSugar("1");
		r4.setPrice("65");
		
		
		super.setUp();
	}

	//TID_19 Prüfen ob "nicht genug Geld" akzeptiert wird
	public void testPurchaseBeverageNotEnoughMoney() {
		
	}
	
	//TID_20 Prüfen ob Rückgeld zurückgegeben wird
	public void testPurchaseBeverageTooManyMoney() {

	}
	
	//TID_21 Prüfen ob "passend" akzeptiert wird
	public void testPurchaseBeverageNeededMoney() {

	}
	
	//TID_22 Prüfen ob "genug Geld und genug Inventar" akzeptiert wird
	public void testPurchaseBeverageNeededMoneyEnoughInventary() {

	}
	
	//TID_23 Prüfen ob "genug Geld aber nicht genug Inventar" akzeptiert wird
	public void testPurchaseBeverageNeededMoneyNotEnoughInventary() {

	}
}
