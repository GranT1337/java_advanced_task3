package entity;


import annotations.SecondAnnotation;
import annotations.Secured;

public class Entity {

    @Secured(value = 2)
    public void firstMethod() {

    }

    @Secured(value = 5, name = "hey")
    @SecondAnnotation
    private void secondMethod() {

    }

    public void thirdMethod() {

    }
}
