/*/class Calculator{
    public int mul(int n1,int n2) 
    {
        int r = n1 * n2;
        return r;
    }
}
public class Class_Object {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
         Calculator calc = new Calculator();
         int result = calc.mul(num1,num2);
         System.out.println("Result " + result);
    }
}
/*/ 
class Calculator{
    public int add(int n1, int n2, int n3){
        return n1 + n2;
    }
    public float add(int n1, float n2){
        return n1 + n2;
    }
    public double add(double n1, int n2){
        return n1 + n2;
    }
}

public class Method_Overloading{
    public static void main(String[] args){
      Calculator calc = new Calculator();
      double result = calc.add(5.6, 10);
      System.out.println("Result " + result);  
    }
}