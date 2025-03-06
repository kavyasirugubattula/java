import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static void main(String[] args){

        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j){
                if(i%10>j%10){
                    return 1;
                }
                else
                    return -1;
            }
        };

        List<Integer> num = new ArrayList<Integer>();
        num.add(12);
        num.add(15);
        num.add(48);
        num.add(76);

        Collections.sort(num, com);

        System.out.println(num);
    }
}
