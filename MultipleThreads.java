class A extends Thread {
    public void run(){
        for(int i =1;i<=100;i++){
        System.out.println("Hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    }
}

class B extends Thread {
    public void run(){
        for(int i=1;i<=100;i++){
        System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
        }
        obj2.start();
    }
}
