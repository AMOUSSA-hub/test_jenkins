package episen;


public class CarFactory {


    public static Car build(String color) throws CarColorException{

        if(color.equals("Rouge") || color.equals("Bleu") ||color.equals("Vert") || color.equals(null) ){
        return new Car(color);
            
    }
    throw new CarColorException(color);    
    }
}
