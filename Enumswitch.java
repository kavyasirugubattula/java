enum Status{
    Running, Loading, Pending, Success;
}

public class Enumswitch {
    public static void main(String[] args){

        Status s = Status.Pending;

        switch (s){
            case Running:
                System.out.println("Try again");
            break;
            case  Loading:
                System.out.println("Please wait..");
            break;
            case Pending:
                System.out.println("Try again later");
            break;
            case Success:
                System.out.println("Completed");
            break;
        }

    }
}

