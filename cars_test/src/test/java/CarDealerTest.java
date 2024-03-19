import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import episen.Car;
import episen.CarDealer;

public class CarDealerTest {

    @Test
    public void testSuccessStory() {
        //Given
        String color = "null";
        for(int i = 1 ; i<= 3 ; i++ ){

            if( i == 1 ){
                color = "Rouge";
            }

            if( i == 2 ){
                color = "Bleu";
            }

            if( i == 3 ){
                color = "Vert";
            }

            //Then
           List<Car> cars =  CarDealer.order(i, color);
           assertEquals(i, cars.size()-1);
           for (Car car : cars) {
                assertEquals(car.getColor(), color);
           }

        }

        
    }

    
}
