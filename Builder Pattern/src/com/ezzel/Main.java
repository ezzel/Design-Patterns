package com.ezzel;

public class Main {

    public static void main(String[] args) {
	// write your code here
       MealBuilder mealBuilder=new MealBuilder();
        Meal meal1=mealBuilder.cheeseBurgerMeal();
        Meal meal2=mealBuilder.vegeeBurgerMeal();

        meal1.showItems();
        meal2.showItems();
    }
}
