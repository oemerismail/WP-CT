package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;

public class DeleteRecipeTest extends TestCase {
	private CoffeeMaker cm;
	private Recipe r1;

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

		super.setUp();
	}

	// TID_12 Prüfen ob das löschen der Rezepte funktioniert
	public void testDeleteRecipe() {
		cm.addRecipe(r1);
		assertEquals(r1.getName(),cm.deleteRecipe(0));
		// TID_13 Prüfen ob das löschen der nicht vorhandener
		// Rezepte funktioniert
		assertNull(cm.deleteRecipe(1));
	}
}
