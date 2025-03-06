import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Comparator_String {
    public static void main(String[] args){
        Comparator<String> com = new Comparator<String>() {
            public int compare(String i, String j){
                if(i.length()>j.length()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<String> st = new ArrayList<String>();
        st.add("Kavya");
        st.add("Prasanna");
        st.add("Rutika");
        st.add("Kusu");

        Collections.sort(st,com);
        System.out.println(st);
    }
}
