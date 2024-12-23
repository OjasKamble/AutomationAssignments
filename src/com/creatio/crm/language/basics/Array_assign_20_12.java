package com.creatio.crm.language.basics;

public class Array_assign_20_12 {

	
	public static void main(String[] args) {

		String [] [] [] products = new String [2] [4] [5] ;
		
		//Category = "Groceries"
		
		//Sub-Category = Beverages
		products[0][0][0] = "Cola";
		products[0][0][1] = "Orange Juice";
		products[0][0][2] = "Lemonade";
		products[0][0][3] = "Green Tea";
		products[0][0][4] = "Black Coffee";
		
		//Sub-Category = Snacks
		products[0][1][0] = "Popcorn";
		products[0][1][1] = "Trail Mix";
		products[0][1][2] = "Beef Jerky";
		products[0][1][3] = "Salted Nuts";
		products[0][1][4] = "Rice Cakes";
		
		//Sub-Category = Dairy Products
		products[0][2][0] = "Cottage Cheese";
		products[0][2][1] = "Heavy Cream";
		products[0][2][2] = "Ice Cream";
		products[0][2][3] = "Parmesan Cheese";
		products[0][2][4] = "Eggnog";
		
		//Sub-Category = Produce
		products[0][3][0] = "Apples";
		products[0][3][1] = "Bananas";
		products[0][3][2] = "Carrots";
		products[0][3][3] = "Potatoes";
		products[0][3][4] = "Onions";

		//----------------------------------------------------------
		
		//Category = "Electronics"
		
		//Sub-Category = Beverages
		products[1][0][0] = "Cola";
		products[1][0][1] = "Orange Juice";
		products[1][0][2] = "Lemonade";
		products[1][0][3] = "Green Tea";
		products[1][0][4] = "Black Coffee";
				
		//Sub-Category = Snacks
		products[1][1][0] = "Popcorn";
		products[1][1][1] = "Trail Mix";
		products[1][1][2] = "Beef Jerky";
		products[1][1][3] = "Salted Nuts";
		products[1][1][4] = "Rice Cakes";
				
		//Sub-Category = Dairy Products
		products[1][2][0] = "Cottage Cheese";
		products[1][2][1] = "Heavy Cream";
		products[1][2][2] = "Ice Cream";
		products[1][2][3] = "Parmesan Cheese";
		products[1][2][4] = "Eggnog";
				
		//Sub-Category = Produce
		products[1][3][0] = "Apples";
		products[1][3][1] = "Bananas";
		products[1][3][2] = "Carrots";
		products[1][3][3] = "Potatoes";
		products[1][3][4] = "Onions";
	}
	
}
