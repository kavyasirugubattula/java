import java.util.Set;
import java.util.TreeSet;

public class SetCollections {
    public static void main(String[] args) {
     
        Set<Integer> num = new TreeSet<Integer>();
        num.add(50);
        num.add(10);
        num.add(15);
        num.add(75);

        for(int n:num){
            System.out.println(n);
        }

    }
}
