public class ThreeDarray {
    public static void main(String[] args) {
        int num[][][] = new int[3][4][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for(int z=0;z<3;z++){
                    num[i][j][z] = (int)(Math.random() *10);
                }
            }
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for(int z=0;z<3;z++){
                    System.out.print(num[i][j][z] + " ");
                }
            }
            System.out.println();
        }
        System.out.println(num[1][1][2]);
    }
}
