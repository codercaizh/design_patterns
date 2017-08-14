package com.czh.builder;

/**
 * Created by a5453 on 2017-07-31.
 */
public class Waiter {
    MealBuilder mealBuilder = new MealOneBuilder();

    public Meal getMealOne(){
        Meal mealOne = new Meal();
        mealBuilder.setMeal(mealOne);
        mealBuilder.makeDrink();
        mealBuilder.makeFood();
        return mealBuilder.getBuildMeal();
    }
}
