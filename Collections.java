import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args){

        List<Integer> num = new ArrayList<Integer> ();
        num.add(10);
        num.add(20);
        num.add(10);
        num.add(2);

        System.out.println(num.get(2));
        System.out.println(num.indexOf(10));

        for(int n:num){
            System.out.println(n*2);
        }
        
    }
}
