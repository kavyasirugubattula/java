interface A{
    void show(int i);
}

public class Lambdaexpression {
    public static void main(String[] args){
    // Here i am using the lambda expression for decrease the code because the complie already knows the what we are creating the constructor
        // A obj = ()->
        //         System.out.println("In Show");
        // obj.show();
    // this is the another lambda expression which takes the value of the like int,float
    A obj = i -> System.out.println("in a show " + i);
    obj.show(5);
    }
}
