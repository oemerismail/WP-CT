package edu.ncsu.csc326.coffeemaker;

import java.util.ArrayList;
import java.util.Collections;

import junit.framework.TestCase;
import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

/**
 *
 * @author Sarah Heckman
 *
 * Unit tests for CoffeeMaker class.
 */
public class CoffeeMakerTest extends TestCase {

	private CoffeeMaker cm;
	private Recipe r1;
	private Recipe r1_edited;
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

		//Set up for r1_edited
		r1_edited = new Recipe();
		r1_edited.setName(r1.getName());
		r1_edited.setAmtChocolate("0");
		r1_edited.setAmtCoffee("4");
		r1_edited.setAmtMilk("2");
		r1_edited.setAmtSugar("2");
		r1_edited.setPrice("55");

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
		//TID_1 Pr�fen ob das Hinzuf�gen von Rezepten funkzioniert
		assertTrue(cm.addRecipe(r1));

		// Sicherstellen dass das Rezept hinzugef�gt wurde
		ArrayList<Recipe> list = new ArrayList<Recipe>();
		Collections.addAll(list, cm.getRecipes());
		assertTrue(list.contains(r1));
	}

	public void testAddRecipeMaximum() {
		assertTrue(cm.addRecipe(r1));
		assertTrue(cm.addRecipe(r2));
		//TID_2 Pr�fen ob das Hinzuf�gen der maximalen
		//Anzahl(3) von Rezepten funkzioniert
		assertTrue(cm.addRecipe(r3));
		//TID_3 Pr�fen ob das Hinzuf�gen �ber die maximale
		//Anzahl(3) von Rezepten hinaus funkzioniert
		assertFalse(cm.addRecipe(r4));
	}

	public void testAddExistingRecipe() {
		cm.addRecipe(r1);
		//TID_4 Pr�fen ob das Hinzuf�gen des gleichen Rezepts
		//(Coffee)funkzioniert
		assertFalse(cm.addRecipe(r1));
	}

	public void testAddEmptyRecipe() {
		//TID_5 Pr�fen ob das Hinzuf�gen eines leeren Rezepts
		//funkzioniert
		assertFalse(cm.addRecipe(new Recipe()));
	}

	public void testAddRecipePrice(){
		//TID_6 Pr�fen ob das setzen eines Integer Preises
		//funktioniert
		try {
			r4.setPrice("4");
		} catch (RecipeException e){
			fail("Setzen des validen Preis-String '4' fehlgeschlagen");
		}

		//TID_7 Pr�fen ob das setzen eines ung�ltigen Preis-Wertes fehlschl�gt
		try {
			r4.setPrice("blablub");
			fail("Setzen eines invaliden Preis-Strings ist nicht fehlgeschlagen");
		} catch (RecipeException e){
			// Diese Exception wird erwartet
		}

		//TID_8 Pr�fen ob das setzen eines negativen Preises
		//funktioniert
		try {
			r4.setPrice("-4");
			fail("Setzen eines negativen Preises schlug nicht fehl");
		} catch (RecipeException e){
			// Diese Exception wird erwartet
		}
	}

	public void testEditRecipe() {
		// TID_9 Pr�fen ob das Editieren der Rezepte funktioniert
		cm.addRecipe(r1);
		assertEquals(r1.getName(),cm.editRecipe(0, r1_edited));

		// TID_10 Pr�fen ob das Editieren der nicht vorhandener
		// Rezepte funktioniert
		assertNull(cm.editRecipe(2, r2));
	}

	public void testEditRecipeName() {
		// TID_11 Pr�fen ob das Editieren des Namens der
		// Rezepte funktioniert
		cm.addRecipe(r1);
		assertNull(cm.editRecipe(0, r3));
	}

	public void testDeleteRecipe() {
		// TID_12 Pr�fen ob das L�schen der Rezepte funktioniert
		cm.addRecipe(r1);
		assertEquals(r1.getName(),cm.deleteRecipe(0));
		// TID_13 Pr�fen ob das L�schen der nicht vorhandener
		// Rezepte funktioniert
		assertNull(cm.deleteRecipe(1));
	}


	public void testAddInventory() {
		//TID_14 Pr�fen ob das Auff�llen mit richtigen Mengen funktioniert
		try {
			cm.addInventory("4","7","0","9");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}

	public void testAddInventoryNegativeAmount() {
		//TID_15 Pr�fen ob das Auff�llen mit negativen Mengen funktioniert
		try {
			cm.addInventory("-4","7","0","9");
			cm.addInventory("4","-7","0","9");
			cm.addInventory("4","7","-4","9");
			cm.addInventory("4","7","0","-9");
			fail("Hinzuf�gen von negativen Werten ist nicht fehlgeschlagen");
		} catch (InventoryException e) {
		}
	}

	public void testAddInventoryWrongTypeAmount() {
		//TID_16 Pr�fen ob das Auff�llen mit string als Mengen funktioniert
		try {
			cm.addInventory("not a number","7","0","9");
			fail("Setzen von ung�ltigen String-Wert f�r Kaffee ist nicht fehlgeschlagen");
			cm.addInventory("4","not a number","0","9");
			fail("Setzen von ung�ltigen String-Wert f�r Milch ist nicht fehlgeschlagen");
			cm.addInventory("4","7","not a number","9");
			fail("Setzen von ung�ltigen String-Wert f�r Zucker ist nicht fehlgeschlagen");
			cm.addInventory("4","7","0","not a number");
			fail("Setzen von ung�ltigen String-Wert f�r Schokolade ist nicht fehlgeschlagen");
		} catch (InventoryException e) {
		}
	}

	public void testCheckInventory() {
		//TID_17 Pr�fen ob die Ausgangsdaten des Inventars stimmen
		assertEquals("Coffee: 15\nMilk: 15\nSugar: 15\nChocolate: 15\n", cm.checkInventory());
	}

	public void testCheckInventoryIncrement() {
		//TID_18 Pr�fen ob die Inventarmengen sich erh�hen
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
			fail("InventoryException should not be thrown. Message: " + e.getMessage());
		}
	}

	public void testPurchaseBeverageNotEnoughMoney() {
		//TID_19 Pr�fen ob "nicht genug Geld" akzeptiert wird
		cm.addRecipe(r1);
		assertEquals(49,cm.makeCoffee(0, 49));
	}

	public void testPurchaseBeverageTooManyMoney() {
		//TID_20 Pr�fen ob R�ckgeld zur�ckgegeben wird
		cm.addRecipe(r1);
		assertEquals(50,cm.makeCoffee(0, 100));
	}

	public void testPurchaseBeverageMatchingMoney() {
		//TID_21 Pr�fen ob "passend" akzeptiert wird
		cm.addRecipe(r1);
		assertEquals(0,cm.makeCoffee(0, 50));
	}

	public void testPurchaseBeverageNeededMoneyNotEnoughInventary() {
		//TID_22 Pr�fen ob "genug Geld aber nicht genug Inventar" akzeptiert wird
		cm.addRecipe(r5);
		cm.makeCoffee(0, 50);
		assertEquals(100,cm.makeCoffee(0, 100));
	}
}
