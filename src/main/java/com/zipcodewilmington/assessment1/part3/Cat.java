package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        super(name, age);
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        super(age);
        String name= getName();
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        super("Cat name",0);

    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
