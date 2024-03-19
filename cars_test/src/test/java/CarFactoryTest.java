import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;

import episen.*;

public class CarFactoryTest {

  
    @Test(expected = CarColorException.class)
    public void testBuildCarWithIncorrectColor() throws CarColorException{
         //Given 
        String a = "blabla";
        //Then
        CarFactory.build(a);


    }
    
}
