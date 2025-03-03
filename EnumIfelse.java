enum Status{
    Running, Loading, Pending, Success;
}

public class EnumIfelse {
    public static void main(String[] args){
        Status s = Status.Success;

        if( s== Status.Running)
            System.out.println("It's running");
        else if(s == Status.Loading)
            System.out.println("Error");
        else if(s == Status.Pending)
            System.out.println("Please wait");
        else 
            System.out.println("It is successfully completed");
    }
}
