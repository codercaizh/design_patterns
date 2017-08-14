package com.czh.decorator;

/**
 * Created by a5453 on 2017-07-28.
 */
public class SomeThing extends Person {
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void doSomeThing() {
        if(getPerson() != null){
            person.doSomeThing();
        }
    }
}
