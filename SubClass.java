//You can't make outer class static
class A{
    public void show(){
        System.out.println("In Show");
    }
    // Here we doing subclass B as a static so we call the class name not with the obj name 
    class B{
        public void show1(){
            System.out.println("In show1");
        }
    }
}
public class SubClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.show1();
    }
}
