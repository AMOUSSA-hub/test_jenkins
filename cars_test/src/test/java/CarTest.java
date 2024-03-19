import static org.junit.Assert.assertEquals;

import org.junit.Test;

import episen.Car;

public class CarTest {
    
    @Test
    public void testBuildCarWithNullColor(){
        
        //Given 
        String a = null;

        //When
        String result = "Rouge";

        //Then
        assertEquals(new Car(null).getColor(), result);

    }

}
