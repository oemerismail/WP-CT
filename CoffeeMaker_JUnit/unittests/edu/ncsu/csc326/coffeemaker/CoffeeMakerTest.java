package edu.ncsu.csc326.coffeemaker;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

/**
 * 
 * @author Sarah Heckman
 *
 * Unit tests for CoffeeMaker class.
 */
public class CoffeeMakerTest extends TestCase {
	
	private CoffeeMaker cm;
	private Recipe r1;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;
	private Recipe r5;

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
		
		//Set up for r5
		r5 = new Recipe();
		r5.setName("Test recipe");
		r5.setAmtChocolate("15");
		r5.setAmtCoffee("15");
		r5.setAmtMilk("15");
		r5.setAmtSugar("15");
		r5.setPrice("50");
		
		
		super.setUp();
	}
	
	public void testAddRecipe() {
		//TID_1 Prüfen ob das Hinzufügen von Rezepten funkzioniert
		assertTrue(cm.addRecipe(r1));
	}
	
	public void testAddRecipeMaximum() {
		assertTrue(cm.addRecipe(r1));
		assertTrue(cm.addRecipe(r2));
		//TID_2 Prüfen ob das Hinzufügen der maximalen
		//Anzahl(3) von Rezepten funkzioniert
		assertTrue(cm.addRecipe(r3));
		//TID_3 Prüfen ob das Hinzufügen über die maximale
		//Anzahl(3) von Rezepten hinaus funkzioniert
		assertFalse(cm.addRecipe(r4));
	}
	
	public void testAddExistingRecipe() {
		assertTrue(cm.addRecipe(r1));
		//TID_4 Prüfen ob das Hinzufügen des gleichen Rezepts
		//(Coffee)funkzioniert
		assertFalse(cm.addRecipe(r1));
		//TID_5 Prüfen ob das Hinzufügen eines leeren Rezepts
		//funkzioniert
		assertFalse(cm.addRecipe(new Recipe()));
	}
	
	public void testAddRecipePrice(){
		//TID_6 Prüfen ob das setzen eines Integer Preises
		//funktioniert
		try {
			r4.setPrice("4");
		} catch (RecipeException e){
			fail("Price must be a positive integer");
		}
		//TID_7 Prüfen ob das setzen eines String Preises
		//funktioniert
		try {
			r4.setPrice("vier");
			fail("Price must be a positive integer");
		} catch (RecipeException e){
		}
		//TID_8 Prüfen ob das setzen eines negativen Preises
		//funktioniert
		try {
			r4.setPrice("-4");
			fail("Price must be a positive integer");
		} catch (RecipeException e){
		}
	}
	
	// TID_9 Prüfen ob das Editieren der Rezepte funktioniert
	public void testEditRecipe() {
		cm.addRecipe(r1);
		assertEquals(r2.getName(),cm.editRecipe(0, r2));
		// TID_10 Prüfen ob das Editieren der nicht vorhandener
		// Rezepte funktioniert
		assertNull(cm.editRecipe(2, r2));
	}

	// TID_11 Prüfen ob das Editieren des Namens der
	// Rezepte funktioniert
	public void testEditRecipeName() {
		cm.addRecipe(r1);
		assertNull(cm.editRecipe(0, r3));
	}
	
	// TID_12 Prüfen ob das Löschen der Rezepte funktioniert
	public void testDeleteRecipe() {
		cm.addRecipe(r1);
		assertEquals(r1.getName(),cm.deleteRecipe(0));
		// TID_13 Prüfen ob das Löschen der nicht vorhandener
		// Rezepte funktioniert
		assertNull(cm.deleteRecipe(1));
	}
	

	//TID_14 Prüfen ob das Auffüllen mit richtigen Mengen funktioniert
	public void testAddInventory() {
		try {
			cm.addInventory("4","7","0","9");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}
	
	//TID_15 Prüfen ob das Auffüllen mit negativen Mengen funktioniert
	public void testAddInventoryNegativeAmount() {
		try {
			cm.addInventory("-4","7","0","9");
			cm.addInventory("4","-7","0","9");
			cm.addInventory("4","7","-4","9");
			cm.addInventory("4","7","0","-9");
			fail("Units must be a positive integer");
		} catch (InventoryException e) {
		}
	}
	
	//TID_16 Prüfen ob das Auffüllen mit string als Mengen funktioniert
	public void testAddInventoryWrongTypeAmount() {
		try {
			cm.addInventory("vier","7","0","9");
			fail("Units of coffee must be a positive integer");
			cm.addInventory("4","sieben","0","9");
			fail("Units of milk must be a positive integer");
			cm.addInventory("4","7","null","9");
			fail("Units of sugar must be a positive integer");
			cm.addInventory("4","7","0","neun");
			fail("Units of chocolate must be a positive integer");
		} catch (InventoryException e) {
		}
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
	
	//TID_19 Prüfen ob "nicht genug Geld" akzeptiert wird
	public void testPurchaseBeverageNotEnoughMoney() {
		cm.addRecipe(r1);
		assertEquals(49,cm.makeCoffee(0, 49));
	}
	
	//TID_20 Prüfen ob Rückgeld zurückgegeben wird
	public void testPurchaseBeverageTooManyMoney() {
		cm.addRecipe(r1);
		assertEquals(50,cm.makeCoffee(0, 100));
	}
	
	//TID_21 Prüfen ob "passend" akzeptiert wird
	public void testPurchaseBeverageNeededMoney() {
		cm.addRecipe(r1);
		assertEquals(0,cm.makeCoffee(0, 50));		
	}
	
	//TID_22 Prüfen ob "genug Geld aber nicht genug Inventar" akzeptiert wird
	public void testPurchaseBeverageNeededMoneyNotEnoughInventary() {
		cm.addRecipe(r5);
		cm.makeCoffee(0, 50);
		assertEquals(100,cm.makeCoffee(0, 100));
	}
}
