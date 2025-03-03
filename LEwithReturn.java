interface A{
    int add(int i , int j);
}

public class LEwithReturn {
    public static void main(String[] args){
        A obj =( i ,j)->  i+j;
        int result = obj.add(5,10);
        System.out.println(result);
    }
}
// Lambda expression only works when there is FunctionalInterface 
//In interface we only declare methods
