enum laptop{
    Windows(2000), Macbook(4000),XPS(10000),Thinkpad;

    private int price;

    private laptop(){
        price = 70000;
    }

    private laptop(int price){
        this.price = price;
    }

    public int getprice(){
        return price;
    }

    public void setprice(int price){
        this.price = price;
    }
}

public class Enumclass {
    public static void main(String[] args){
        // laptop lap = laptop.Windows;
        // System.out.println(lap + " : " + lap.getprice());

        for( laptop lap : laptop.values()){
            System.out.println(lap + " : " + lap.getprice());
        }
    }
}
