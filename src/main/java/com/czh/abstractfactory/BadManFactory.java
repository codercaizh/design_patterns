package com.czh.abstractfactory;

/**
 * Created by a5453 on 2017-07-31.
 */
public class BadManFactory implements PersonFactory {
    public Person createPerson() {
        return new BadMan();
    }
}
