package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;

public class EditRecipeTest extends TestCase {

	private CoffeeMaker cm;
	private Recipe r1;
	private Recipe r2;
	private Recipe r3;

	protected void setUp() throws Exception {
		cm = new CoffeeMaker();

		// Set up for r1
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setAmtChocolate("0");
		r1.setAmtCoffee("3");
		r1.setAmtMilk("1");
		r1.setAmtSugar("1");
		r1.setPrice("50");

		// Set up for r2
		r2 = new Recipe();
		r2.setName("Mocha");
		r2.setAmtChocolate("20");
		r2.setAmtCoffee("3");
		r2.setAmtMilk("1");
		r2.setAmtSugar("1");
		r2.setPrice("75");

		// Set up for r3
		r3 = new Recipe();
		r3.setName("LatteMacchiato");
		r3.setAmtChocolate("0");
		r3.setAmtCoffee("3");
		r3.setAmtMilk("3");
		r3.setAmtSugar("1");
		r3.setPrice("100");

		super.setUp();
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
}
