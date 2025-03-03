public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(5 , 10);
        int r2 = obj.sub(10 , 5);
        int r3 = obj.mul(100,2);
        int r4 = obj.div(10000, 5);
        double r5 = obj.power(5,6);

    System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
