package episen;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {


    public static List<Car> order(int qte, String color){

        ArrayList<Car> cars = new ArrayList<Car>(); 

        for (int i = 0; i<= qte; i++){
            try {
                cars.add(CarFactory.build(color));
            } catch (CarColorException e) {
                
                e.printStackTrace();
            }
        }

        if(cars.isEmpty()){
            return null;
        }
        return cars;

    }
    
}
