package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        boolean expectedMartialStatus = false; //added

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Boolean actualMaritalStatus = person.getIsMarried(); //added

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedMartialStatus, actualMaritalStatus); // added
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithMaritalStatus(){
        // Given
        Boolean expected = true;

        // When
        Person person = new Person(expected);

        //Then
        Boolean actual = person.getIsMarried();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithAgeAndMaritalStatus() {
        // Given

        Integer expectedAge = Integer.MAX_VALUE;
        boolean expectedMartialStatus = false; //added

        // When
        Person person = new Person();

        // Then

        Integer actualAge = person.getAge();
        Boolean actualMaritalStatus = person.getIsMarried(); //added


        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedMartialStatus, actualMaritalStatus); // added
    }

    @Test
    public void testConstructorWithNameAndMaritalStatus() {
        // Given
        String expectedName = "";

        boolean expectedMartialStatus = false; //added

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();

        Boolean actualMaritalStatus = person.getIsMarried(); //added

        Assert.assertEquals(expectedName, actualName);

        Assert.assertEquals(expectedMartialStatus, actualMaritalStatus); // added
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setMarried() {
        // Given
        Person person = new Person();
        Boolean expected = true; //added
        Boolean expected1 = true;
        Boolean expected2 = false;

        // When
        person.setMarried(expected);

        // Then
        Boolean actual = person.getIsMarried();
        Boolean actual1 = person.gotMarried();
        Boolean actual2 = person.gotDivorced();
        Assert.assertEquals(expected, actual); // added
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2,actual2);
    }

    @Test
    public void birthdayCheck(){
        // Give
        int age = 34;
        Person person = new Person(age);
        Integer expected = 35;

        // When
        person.birthday();

        // then
        Integer actual = person.getAge();
        Assert.assertEquals(expected,actual);
    }


}
