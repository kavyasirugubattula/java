public class Jagged{
    public static void main(String[] args) {
        int num[][] = new int[3][];   //jagged

        num[0]=new int[3];
        num[1]=new int[4];
        num[2]=new int[5];

        for (int[] num1 : num) {
            for (int j = 0; j < num1.length; j++) {
                num1[j] = (int)(Math.random() * 10);
            }
        }
        for(int n[]:num){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
