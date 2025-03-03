//Here in this program we are doing upcasting and the down casting 
class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A {
    public void show1(){
        System.out.println("In B Show");
    }
}
public class Casting {
    public static void main(String[] args) {
//In Line 15 we are refering B to A If we dont use this it prints same show 
        A obj = new B();
        obj.show();

        B obj1 = (B) obj;
        obj1.show1();
    }
}
