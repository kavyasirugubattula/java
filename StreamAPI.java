import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
     List<Integer> nums = Arrays.asList(3,7,9,6,2,5);

    //We can't reuse the Stream. we use onlu once and if we want print multiple times it gets error in runtime 
    //  Stream<Integer> st1 = nums.stream();
    //  Stream<Integer> st2 = st1.filter(n -> n%2==0);
    //  Stream<Integer> st3 = st1.map(n -> n*2);

    //  st3.forEach(i->System.out.println(i));

    // int result = nums.stream()
    //                 .filter(n -> n%2==0)
    //                 .map(n -> n*2)
    //                 .reduce(0,(c,e) -> c+e);
    // System.out.println(result);

    Stream<Integer> sortedvalues = nums.stream()
                                    .filter(n -> n%2 ==0)
                                    .sorted();
                                    
    sortedvalues.forEach(i -> System.out.println(i));

    }
}
