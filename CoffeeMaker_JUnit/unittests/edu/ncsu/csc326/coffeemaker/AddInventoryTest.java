package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import junit.framework.TestCase;

public class AddInventoryTest extends TestCase {
	
	private CoffeeMaker cm;

	protected void setUp() throws Exception {
		cm = new CoffeeMaker();
		
		super.setUp();
	}

	//TID_14 Pr�fen ob das Auff�llen mit richtigen Mengen funktioniert
	public void testAddInventory() {
		try {
			cm.addInventory("4","4","4","4");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}
	
	//TID_15 Pr�fen ob das Auff�llen mit negativen Mengen funktioniert
	public void testAddInventoryNegativeAmount() {
		try {
			cm.addInventory("-4","4","4","4");
			cm.addInventory("4","-4","4","4");
			cm.addInventory("4","4","-4","4");
			cm.addInventory("4","4","4","-4");
			fail("Units must be a positive integer");
		} catch (InventoryException e) {
		}
	}
	
	//TID_16 Pr�fen ob das Auff�llen mit string als Mengen funktioniert
	public void testAddInventoryWrongTypeAmount() {
		try {
			cm.addInventory("vier","4","4","4");
			fail("Units of coffee must be a positive integer");
			cm.addInventory("4","vier","4","4");
			fail("Units of milk must be a positive integer");
			cm.addInventory("4","4","vier","4");
			fail("Units of sugar must be a positive integer");
			cm.addInventory("4","4","4","vier");
			fail("Units of chocolate must be a positive integer");
		} catch (InventoryException e) {
		}
	}
}
