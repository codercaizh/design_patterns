package com.czh.builder;

/**
 * Created by a5453 on 2017-07-31.
 */
public interface IMealBuilder {
    void makeFood();

    void makeDrink();

    Meal getBuildMeal();
}
