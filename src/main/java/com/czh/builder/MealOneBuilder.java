package com.czh.builder;

/**
 * Created by a5453 on 2017-07-31.
 */
public class MealOneBuilder extends MealBuilder{


    public void makeFood() {
        meal.setFood("汉堡");
    }

    public void makeDrink() {
        meal.setDrink("可乐");
    }
}
