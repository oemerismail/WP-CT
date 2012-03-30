package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

public class AddRecipeTest extends TestCase {
		
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
	
	
}
