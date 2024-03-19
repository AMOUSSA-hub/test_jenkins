package episen;
public class Car{
private String color ="Rouge";


public Car(String c) {
    if(c != null){this.color = c;}

}


public String getColor() {
    return color;
}

}