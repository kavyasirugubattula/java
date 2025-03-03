public class TrywithMultipleCatch {
    public static void main(String[] args){
        int i = 2;
        int j = 0;

        int n[] = new int[5];

        try
        {
            j = 18/i;
            System.out.println(n[1]);
            System.out.println(n[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("The number is can't divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Your are out of limit");
        }
        catch(Exception e){
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
