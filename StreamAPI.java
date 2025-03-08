import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
     List<Integer> nums = Arrays.asList(3,7,9,6,2,5);

    //We can't reuse the Stream. we use onlu once and if we want print multiple times it gets error in runtime 
     Stream<Integer> st1 = nums.stream();

     st1.forEach(i->System.out.println(i));

    }
}
