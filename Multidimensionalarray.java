public class Multidimensionalarray{
    public static void main(String[] args) {
        int num[][] = new int[3][4];
        
//Here we use math.random to print random variables math values are point so we multiply with 100
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                num[i][j]=(int)(Math.random() * 100);
                System.out.println(num[i] [j]);
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
//It is the another way to print the multi dimensional array.N is a specific variable
        for(int n[]: num){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}