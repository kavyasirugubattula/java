
interface  Computer{
    void code();
}
class Laptop implements Computer {
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Faster");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
public class Interface{
    public static void main(String[] args){
        Computer lap = new Laptop();
        Computer desk =  new Desktop();

        Developer kavya = new Developer();
        kavya.devApp(lap);
    }
}