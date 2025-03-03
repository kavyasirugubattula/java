//When where u create a abstract definitly create the abstract class but, abstract class doesn't need abstract method.
abstract class Car{
    public abstract void drive();
 
    public void music(){
        System.out.println("Play music..");
    }
}
//Here you are creating a another class which implements the car class
class RangeRover extends Car{
    @Override
    public void drive(){
        System.out.println("Driving.....");
    }
}
public class Abstract {
    public static void main(String[] args) {
//Here we create a obj for rangerover because it takes the car features if we create a car object it throw an error
        Car obj = new RangeRover();
        obj.drive();
        obj.music();
    }
}
