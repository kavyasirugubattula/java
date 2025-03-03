// Functional interaface is used when we create the more than one method and that are uncessary so we can find oout easily by using this functionalInterface in this we only use only one method

interface A {
    void show();
}
// //In interface we can't create object directly that why we are creating the class 
// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
//}

public class FunctionalInterface {
    public static void main(String[] args){
// Here we use instead of creating the class it reduces the line of code 
        A obj = new A()
        {
            public void show(){
                System.out.println("In a show");
            }
        };
        obj.show();
    }
}
