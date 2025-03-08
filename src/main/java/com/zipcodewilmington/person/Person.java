package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;
    private boolean isMarried; //booleans default to false

    public Person() {

    }

    public Person(int age) {
        setAge(age);
    }

    public Person(String name) {
        setName(name);
    }

    public Person(boolean isMarried){
        setMarried(isMarried);
    }

    public Person(int age, boolean isMarried){
        setAge(age);
        setMarried(isMarried);
    }

    public Person(String name, boolean isMarried){
        setName(name);
        setMarried(isMarried);
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Person(String name, int age, boolean isMarried){
        setName(name);
        setAge(age);
        setMarried(isMarried);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarried(boolean isMarried){
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getIsMarried() {
        return isMarried;
    }


    public void birthday(int amount){
        age++;
    }

    public void gotMarried(){
        isMarried = true;
    }

    public void gotDivorced(){
        isMarried = false;
    }
}
