enum Status{
    Running, Loading, Success, Error;
}
public class Enum {
    public static void main(String[] args) {
        //[] we are using for printing the multiple values and values is a method 
        Status[] ss = Status.values();

        //ss is assigned to the s it is a enhance method 
        for(Status s : ss)
        {
            System.out.println(s + " : " + s.ordinal());
            //We are using ordinal for printing index values 
            /*/if you want to print only running this line is used
            Status s = Status.Running;
            System.out.println(s);/*/
        }
    }
}
