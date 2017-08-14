package com.czh.builder;

/**
 * Created by a5453 on 2017-07-31.
 */
public abstract class MealBuilder implements IMealBuilder{
    Meal meal;

    public void setMeal(Meal meal){
        this.meal= meal;
    }
    public Meal getBuildMeal() {
        return meal;
    }

}
