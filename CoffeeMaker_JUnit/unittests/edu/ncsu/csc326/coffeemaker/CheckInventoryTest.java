package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import junit.framework.TestCase;

public class CheckInventoryTest extends TestCase {
	
	private CoffeeMaker cm;

	protected void setUp() throws Exception {
		cm = new CoffeeMaker();		
		
		super.setUp();
	}

	//TID_17 Prüfen ob die Ausgangsdaten des Inventars stimmen
	public void testCheckInventory() {
		assertEquals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n", cm.checkInventory());
	}
	
	//TID_18 Prüfen ob die Inventarmengen sich erhöhen
	public void testCheckInventoryIncrement() {
		try {
			cm.addInventory("1","0","0","0");
			assertEquals("Coffee: 16\nMilk: 15\nSugar: 15\nChocolate: 15\n", cm.checkInventory());
			cm.addInventory("0","1","0","0");
			assertEquals("Coffee: 16\nMilk: 16\nSugar: 15\nChocolate: 15\n", cm.checkInventory());
			cm.addInventory("0","0","1","0");
			assertEquals("Coffee: 16\nMilk: 16\nSugar: 16\nChocolate: 15\n", cm.checkInventory());
			cm.addInventory("0","0","0","1");
			assertEquals("Coffee: 16\nMilk: 16\nSugar: 16\nChocolate: 16\n", cm.checkInventory());
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}
}
