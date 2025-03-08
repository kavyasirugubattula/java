import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(10,4,2,7,5,9);
        nums.forEach(i -> System.out.println(i));
    }
}
