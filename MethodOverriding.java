class A{
    public int add(int a, int b){
        return a + b;
    }
}
class B extends A{
    public int add(int a , int b){
        return a + b + 2;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        int r1 = obj.add(4,10);
        System.out.println(r1);
    }
}
