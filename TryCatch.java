public class TryCatch {
    public static void main(String[] args) {
        int i =0;
        int j = 0;

        try
        {
            j = 18/i;
        }
        //Catch will only excute when there is a exception.If exception is not there the catch will skip 
        catch(Exception e)
        {
            System.out.println("Something went wrong " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
