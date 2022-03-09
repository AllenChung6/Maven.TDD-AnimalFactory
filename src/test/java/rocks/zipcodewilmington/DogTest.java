package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.Animal;

import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testSetBirthDate() {
        Dog dog = new Dog(null, null,null);

        Date expected = new Date(6,6,6);
        dog.setBirthDate(expected);

        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {
        Dog dog = new Dog(null,null,null);

        String expected = "bark!";
        dog.speak();

        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat(){
        Dog dog = new Dog(null, null,null);

        int expected = 1;
        Food food = new Food();
        dog.eat(food);

        int actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetId(){
        Dog dog = new Dog(null,null,1);

        Integer expected = 1;

        Integer actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDogAnimalInheritance(){
        Dog dog = new Dog(null,null,null);
        Assert.assertTrue(dog instanceof Animal);

    }

    @Test
    public void testDogMammalInheritance() {
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Mammal);
    }
}
