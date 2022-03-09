package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        String name ="milo";                            //Assign variable to name (given)
        Date date = new Date(6,6,6);  //Assign variable to Date (given)

        Dog dog = AnimalFactory.createDog(name, date); //Create dog object and call createDog method (when)

        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(date, actualDate);
    }

    @Test
    public void testCreateCat() {
        String name = "zula";                            //Assign variable to name (given)
        Date date = new Date(3, 3, 3);  //Assign variable to Date (given)

        Cat cat = AnimalFactory.createCat(name, date); //Create dog object and call createDog method (when)

        String actualName = cat.getName();              //Get Actual Name
        Date actualDate = cat.getBirthDate();           //Get Actual Birth Date

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(date, actualDate);
    }
}
